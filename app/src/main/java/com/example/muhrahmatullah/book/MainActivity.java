package com.example.muhrahmatullah.book;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.muhrahmatullah.book.adapter.BookListAdapter;
import com.example.muhrahmatullah.book.model.Book;
import com.example.muhrahmatullah.book.model.Item;
import com.example.muhrahmatullah.book.model.VolumeInfo;
import com.example.muhrahmatullah.book.rest.ApiInterface;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import timber.log.Timber;

public class MainActivity extends AppCompatActivity implements BookListAdapter.BooksAdapterListener, SearchView.OnQueryTextListener{


    RecyclerView recyclerView;
    List<VolumeInfo> volumeInfoList = new ArrayList<>();
    BookListAdapter mAdapter;
    Retrofit retrofit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();

        Timber.plant(new Timber.DebugTree());

        HttpLoggingInterceptor httpLoggingInterceptor = new
                HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(@NonNull String message) {
                Timber.i(message);
            }
        });

        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient()
                .newBuilder()
                .addInterceptor(httpLoggingInterceptor)
                .build();


        retrofit = new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("https://www.googleapis.com/books/v1/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        populateBooks("Hello");


    }

    public void initViews(){
        recyclerView = findViewById(R.id.book_recycler_view);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    void populateBooks(String query){
        Call<Book> call = getApiClientService().getBooks(query);

        call.enqueue(new Callback<Book>() {
            @Override
            public void onResponse(Call<Book> call, Response<Book> response) {
                List<Item> items = response.body().getItems();
                for(int i = 0; i < items.size(); i++){
                    volumeInfoList.add(items.get(i).getVolumeInfo());
                }
                mAdapter = new BookListAdapter(MainActivity.this);
                mAdapter.setItems(volumeInfoList);
                recyclerView.setAdapter(mAdapter);
            }

            @Override
            public void onFailure(Call<Book> call, Throwable t) {
                Timber.i(t.getMessage());
            }
        });
    }

    public ApiInterface getApiClientService(){
        return retrofit.create(ApiInterface.class);
    }


    @Override
    public void onCardSelected(int position, ImageView thumbnail) {
        Intent intent = new Intent(this, DetailActivity.class);
        Bundle b = new Bundle();
        b.putParcelable("Books", volumeInfoList.get(position));
        intent.putExtras(b);
        startActivity(intent);
    }

    @Override
    public void onImageSelected(int position) {
        Intent intent = new Intent(this, DetailActivity.class);
        Bundle b = new Bundle();
        b.putParcelable("Books", volumeInfoList.get(position));
        intent.putExtras(b);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_book, menu);
        final MenuItem searchItem=menu.findItem(R.id.action_search);
        final SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
        searchView.setOnQueryTextListener(this);
        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        if(volumeInfoList != null){
            volumeInfoList.clear();
        }
        populateBooks(query);
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }
}

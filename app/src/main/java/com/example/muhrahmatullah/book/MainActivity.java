package com.example.muhrahmatullah.book;

import android.content.Intent;
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
import com.example.muhrahmatullah.book.rest.ApiClient;
import com.example.muhrahmatullah.book.rest.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements BookListAdapter.BooksAdapterListener, SearchView.OnQueryTextListener{


    RecyclerView recyclerView;
    List<VolumeInfo> volumeInfoList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.book_recycler_view);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());


        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        Call<Book> call = apiService.getBooks("test");

        call.enqueue(new Callback<Book>() {
            @Override
            public void onResponse(Call<Book> call, Response<Book> response) {
                List<Item> items = response.body().getItems();
                for(int i = 0; i < items.size(); i++){
                    volumeInfoList.add(items.get(i).getVolumeInfo());
                }
                recyclerView.setAdapter(new BookListAdapter(volumeInfoList, MainActivity.this, getApplicationContext()));
            }

            @Override
            public void onFailure(Call<Book> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Make sure you have internet connection", Toast.LENGTH_SHORT).show();
            }
        });
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
        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        Call<Book> call = apiService.getBooks(query);

        call.enqueue(new Callback<Book>() {
            @Override
            public void onResponse(Call<Book> call, Response<Book> response) {
                List<Item> items = response.body().getItems();
                for(int i = 0; i < items.size(); i++){
                    volumeInfoList.add(items.get(i).getVolumeInfo());
                }
                recyclerView.setAdapter(new BookListAdapter(volumeInfoList, MainActivity.this, getApplicationContext()));
            }

            @Override
            public void onFailure(Call<Book> call, Throwable t) {

            }
        });
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }
}

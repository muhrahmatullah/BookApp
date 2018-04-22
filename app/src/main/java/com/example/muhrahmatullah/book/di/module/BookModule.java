package com.example.muhrahmatullah.book.di.module;

import com.example.muhrahmatullah.book.di.BookApplicationScope;
import com.example.muhrahmatullah.book.rest.ApiInterface;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by muhrahmatullah on 4/22/18.
 */
@Module(includes = OkHttpClientModule.class)
public class BookModule {

    @Provides
    public ApiInterface bookApi(Retrofit retrofit){
        return retrofit.create(ApiInterface.class);
    }

    @BookApplicationScope
    @Provides
    public Retrofit retrofit(OkHttpClient okHttpClient,
                             GsonConverterFactory gsonConverterFactory, Gson gson){
        return new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("https://www.googleapis.com/books/v1/")
                .addConverterFactory(gsonConverterFactory)
                .build();
    }

    @Provides
    public Gson gson(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        return gsonBuilder.create();
    }

    @Provides
    public GsonConverterFactory gsonConverterFactory(Gson gson){
        return GsonConverterFactory.create(gson);
    }


}

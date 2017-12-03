package com.example.muhrahmatullah.book.rest;

import com.example.muhrahmatullah.book.model.Book;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by muhrahmatullah on 11/1/17.
 */

public interface ApiInterface {

    @GET("volumes")
    Call<Book> getBooks(@Query("q") String query);
}

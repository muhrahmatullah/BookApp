package com.example.muhrahmatullah.book.di.component;

import com.example.muhrahmatullah.book.adapter.BookListAdapter;
import com.example.muhrahmatullah.book.di.MainActivityScope;
import com.example.muhrahmatullah.book.di.module.MainActivityModule;
import com.example.muhrahmatullah.book.rest.ApiInterface;

import dagger.Component;

/**
 * Created by muhrahmatullah on 4/23/18.
 */

@MainActivityScope
@Component(modules = {MainActivityModule.class, BooksComponent.class})
public interface MainActivityComponent {
    BookListAdapter getBookListAdapter();
    ApiInterface getBooksService();
}

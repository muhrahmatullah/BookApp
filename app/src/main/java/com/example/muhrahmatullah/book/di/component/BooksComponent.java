package com.example.muhrahmatullah.book.di.component;

import com.example.muhrahmatullah.book.di.BookApplicationScope;
import com.example.muhrahmatullah.book.di.module.BookModule;
import com.example.muhrahmatullah.book.di.module.PicassoModule;
import com.example.muhrahmatullah.book.rest.ApiInterface;
import com.squareup.picasso.Picasso;

import dagger.Component;

/**
 * Created by muhrahmatullah on 4/22/18.
 */
@BookApplicationScope
@Component(modules = {BookModule.class, PicassoModule.class})
public interface BooksComponent {
    ApiInterface getBooksService();
    Picasso getPicasso();
}

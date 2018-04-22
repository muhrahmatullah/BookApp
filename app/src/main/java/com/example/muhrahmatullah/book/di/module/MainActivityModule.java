package com.example.muhrahmatullah.book.di.module;

import com.example.muhrahmatullah.book.MainActivity;
import com.example.muhrahmatullah.book.adapter.BookListAdapter;
import com.example.muhrahmatullah.book.di.MainActivityScope;
import com.squareup.picasso.Picasso;

import dagger.Module;
import dagger.Provides;

/**
 * Created by muhrahmatullah on 4/23/18.
 */
@Module
public class MainActivityModule {
    private final MainActivity mainActivity;

    public MainActivityModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }
    @Provides
    @MainActivityScope
    public BookListAdapter bookListAdapter(Picasso picasso){
        return new BookListAdapter(mainActivity, picasso);
    }
}

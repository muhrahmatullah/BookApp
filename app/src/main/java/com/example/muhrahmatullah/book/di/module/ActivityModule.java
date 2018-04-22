package com.example.muhrahmatullah.book.di.module;

import android.app.Activity;
import android.content.Context;

import com.example.muhrahmatullah.book.di.BookApplicationScope;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by muhrahmatullah on 4/22/18.
 */

@Module
public class ActivityModule {
    private final Context context;

    ActivityModule(Activity context){
        this.context = context;
    }

    @Named("activity_context")
    @BookApplicationScope
    @Provides
    public Context context(){ return context; }
}

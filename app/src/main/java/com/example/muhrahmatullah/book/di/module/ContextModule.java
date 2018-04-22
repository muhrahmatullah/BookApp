package com.example.muhrahmatullah.book.di.module;

import android.content.Context;


import com.example.muhrahmatullah.book.di.ApplicationContext;
import com.example.muhrahmatullah.book.di.BookApplicationScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by muhrahmatullah on 4/22/18.
 */
@Module
public class ContextModule {
    Context context;

    public ContextModule(Context context){
        this.context = context;
    }
    @ApplicationContext
    @BookApplicationScope
    @Provides
    public Context context(){
        return context.getApplicationContext();
    }

}

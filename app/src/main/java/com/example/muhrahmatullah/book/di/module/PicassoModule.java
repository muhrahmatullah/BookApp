package com.example.muhrahmatullah.book.di.module;

import android.content.Context;

import com.example.muhrahmatullah.book.di.ApplicationContext;
import com.example.muhrahmatullah.book.di.BookApplicationScope;
import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by muhrahmatullah on 4/22/18.
 */
@Module(includes = OkHttpClientModule.class)
public class PicassoModule {
    @BookApplicationScope
    @Provides
    public Picasso picasso(@ApplicationContext Context context, OkHttp3Downloader okHttp3Downloader){
        return new Picasso.Builder(context).
                downloader(okHttp3Downloader).
                build();
    }

    @Provides
    public OkHttp3Downloader okHttp3Downloader(OkHttpClient okHttpClient){
        return new OkHttp3Downloader(okHttpClient);
    }
}

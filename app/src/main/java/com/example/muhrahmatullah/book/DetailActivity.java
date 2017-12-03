package com.example.muhrahmatullah.book;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.muhrahmatullah.book.model.VolumeInfo;
import com.squareup.picasso.Picasso;

import java.util.List;

public class DetailActivity extends AppCompatActivity {

    TextView judul, author, tahun, deskripsi;
    ImageView sampul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        judul = findViewById(R.id.book_title);
        author = findViewById(R.id.book_author);
        tahun = findViewById(R.id.book_year);
        deskripsi = findViewById(R.id.book_description);

        sampul = findViewById(R.id.book_cover);

        Bundle bundle  = getIntent().getExtras();
        VolumeInfo volumeInfo = bundle.getParcelable("Books");
        Log.v("Judul", volumeInfo.getTitle());

        judul.setText(volumeInfo.getTitle());
        if(volumeInfo.getAuthors() != null) {
            author.setText(volumeInfo.getAuthors().get(0));
        }else{
            author.setVisibility(View.GONE);
        }
        tahun.setText(volumeInfo.getPublishedDate());
        deskripsi.setText(volumeInfo.getDescription());

        Picasso.with(this)
                .load(volumeInfo.getImageLinks().getThumbnail())
                .placeholder(R.drawable.placeholder)
                .into(sampul);
    }
}

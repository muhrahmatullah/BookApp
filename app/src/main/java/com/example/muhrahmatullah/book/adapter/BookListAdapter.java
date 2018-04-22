package com.example.muhrahmatullah.book.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.muhrahmatullah.book.R;
import com.example.muhrahmatullah.book.model.VolumeInfo;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by muhrahmatullah on 11/1/17.
 */

public class BookListAdapter extends RecyclerView.Adapter<BookListAdapter.BookViewHolder>{

    private List<VolumeInfo> list;
    private BooksAdapterListener listener;
    Picasso picasso;

    public BookListAdapter(BooksAdapterListener listener) {
        this.listener = listener;
    }
    public BookListAdapter(BooksAdapterListener listener, Picasso picasso) {
        this.listener = listener;
        this.picasso = picasso;
    }
    public void setItems(List<VolumeInfo>list){
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public BookViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_item_list, parent, false);


        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final BookViewHolder holder, final int position) {
        holder.title.setText(list.get(position).getTitle());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onCardSelected(position, holder.cover);
            }
        });
        holder.cover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onImageSelected(position);
            }
        });

        Picasso.with(holder.cover.getContext())
                .load(list.get(position).getImageLinks().getSmallThumbnail())
                .into(holder.cover);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class BookViewHolder extends RecyclerView.ViewHolder{

        TextView title;
        //TextView author;
        ImageView cover;
        CardView cardView;

        public BookViewHolder(View v){
            super(v);
            title = v.findViewById(R.id.title_textView);
            //author = (TextView) v.findViewById(R.id.author_textView);
            cover = v.findViewById(R.id.img_cover);
            cardView = v.findViewById(R.id.card_view);

        }
    }

    public interface BooksAdapterListener {

        void onCardSelected(int position, ImageView thumbnail);
        void onImageSelected(int position);
    }

}

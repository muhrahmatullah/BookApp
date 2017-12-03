
package com.example.muhrahmatullah.book.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Book implements Parcelable {

    @SerializedName("items")
    private List<Item> mItems;
    @SerializedName("kind")
    private String mKind;
    @SerializedName("totalItems")
    private Long mTotalItems;

    public List<Item> getItems() {
        return mItems;
    }

    public String getKind() {
        return mKind;
    }

    public Long getTotalItems() {
        return mTotalItems;
    }

    public static class Builder {

        private List<Item> mItems;
        private String mKind;
        private Long mTotalItems;

        public Book.Builder withItems(List<Item> items) {
            mItems = items;
            return this;
        }

        public Book.Builder withKind(String kind) {
            mKind = kind;
            return this;
        }

        public Book.Builder withTotalItems(Long totalItems) {
            mTotalItems = totalItems;
            return this;
        }

        public Book build() {
            Book Book = new Book();
            Book.mItems = mItems;
            Book.mKind = mKind;
            Book.mTotalItems = mTotalItems;
            return Book;
        }

    }

    public Book() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.mItems);
        dest.writeString(this.mKind);
        dest.writeValue(this.mTotalItems);
    }

    protected Book(Parcel in) {
        this.mItems = new ArrayList<Item>();
        in.readList(this.mItems, Item.class.getClassLoader());
        this.mKind = in.readString();
        this.mTotalItems = (Long) in.readValue(Long.class.getClassLoader());
    }

    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel source) {
            return new Book(source);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };
}

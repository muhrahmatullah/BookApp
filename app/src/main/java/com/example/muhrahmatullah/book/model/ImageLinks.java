
package com.example.muhrahmatullah.book.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class ImageLinks implements Parcelable {

    @SerializedName("smallThumbnail")
    private String mSmallThumbnail;
    @SerializedName("thumbnail")
    private String mThumbnail;

    public String getSmallThumbnail() {
        return mSmallThumbnail;
    }

    public String getThumbnail() {
        return mThumbnail;
    }

    public static class Builder {

        private String mSmallThumbnail;
        private String mThumbnail;

        public ImageLinks.Builder withSmallThumbnail(String smallThumbnail) {
            mSmallThumbnail = smallThumbnail;
            return this;
        }

        public ImageLinks.Builder withThumbnail(String thumbnail) {
            mThumbnail = thumbnail;
            return this;
        }

        public ImageLinks build() {
            ImageLinks ImageLinks = new ImageLinks();
            ImageLinks.mSmallThumbnail = mSmallThumbnail;
            ImageLinks.mThumbnail = mThumbnail;
            return ImageLinks;
        }

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mSmallThumbnail);
        dest.writeString(this.mThumbnail);
    }

    public ImageLinks() {
    }

    protected ImageLinks(Parcel in) {
        this.mSmallThumbnail = in.readString();
        this.mThumbnail = in.readString();
    }

    public static final Parcelable.Creator<ImageLinks> CREATOR = new Parcelable.Creator<ImageLinks>() {
        @Override
        public ImageLinks createFromParcel(Parcel source) {
            return new ImageLinks(source);
        }

        @Override
        public ImageLinks[] newArray(int size) {
            return new ImageLinks[size];
        }
    };
}


package com.example.muhrahmatullah.book.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class ReadingModes implements Parcelable {

    @SerializedName("image")
    private Boolean mImage;
    @SerializedName("text")
    private Boolean mText;

    public Boolean getImage() {
        return mImage;
    }

    public Boolean getText() {
        return mText;
    }

    public static class Builder {

        private Boolean mImage;
        private Boolean mText;

        public ReadingModes.Builder withImage(Boolean image) {
            mImage = image;
            return this;
        }

        public ReadingModes.Builder withText(Boolean text) {
            mText = text;
            return this;
        }

        public ReadingModes build() {
            ReadingModes ReadingModes = new ReadingModes();
            ReadingModes.mImage = mImage;
            ReadingModes.mText = mText;
            return ReadingModes;
        }

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.mImage);
        dest.writeValue(this.mText);
    }

    public ReadingModes() {
    }

    protected ReadingModes(Parcel in) {
        this.mImage = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.mText = (Boolean) in.readValue(Boolean.class.getClassLoader());
    }

    public static final Parcelable.Creator<ReadingModes> CREATOR = new Parcelable.Creator<ReadingModes>() {
        @Override
        public ReadingModes createFromParcel(Parcel source) {
            return new ReadingModes(source);
        }

        @Override
        public ReadingModes[] newArray(int size) {
            return new ReadingModes[size];
        }
    };
}

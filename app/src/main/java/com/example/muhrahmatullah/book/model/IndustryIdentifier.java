
package com.example.muhrahmatullah.book.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class IndustryIdentifier implements Parcelable {

    @SerializedName("identifier")
    private String mIdentifier;
    @SerializedName("type")
    private String mType;

    public String getIdentifier() {
        return mIdentifier;
    }

    public String getType() {
        return mType;
    }

    public static class Builder {

        private String mIdentifier;
        private String mType;

        public IndustryIdentifier.Builder withIdentifier(String identifier) {
            mIdentifier = identifier;
            return this;
        }

        public IndustryIdentifier.Builder withType(String type) {
            mType = type;
            return this;
        }

        public IndustryIdentifier build() {
            IndustryIdentifier IndustryIdentifier = new IndustryIdentifier();
            IndustryIdentifier.mIdentifier = mIdentifier;
            IndustryIdentifier.mType = mType;
            return IndustryIdentifier;
        }

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mIdentifier);
        dest.writeString(this.mType);
    }

    public IndustryIdentifier() {
    }

    protected IndustryIdentifier(Parcel in) {
        this.mIdentifier = in.readString();
        this.mType = in.readString();
    }

    public static final Parcelable.Creator<IndustryIdentifier> CREATOR = new Parcelable.Creator<IndustryIdentifier>() {
        @Override
        public IndustryIdentifier createFromParcel(Parcel source) {
            return new IndustryIdentifier(source);
        }

        @Override
        public IndustryIdentifier[] newArray(int size) {
            return new IndustryIdentifier[size];
        }
    };
}


package com.example.muhrahmatullah.book.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Epub {

    @SerializedName("acsTokenLink")
    private String mAcsTokenLink;
    @SerializedName("isAvailable")
    private Boolean mIsAvailable;

    public String getAcsTokenLink() {
        return mAcsTokenLink;
    }

    public Boolean getIsAvailable() {
        return mIsAvailable;
    }

    public static class Builder {

        private String mAcsTokenLink;
        private Boolean mIsAvailable;

        public Epub.Builder withAcsTokenLink(String acsTokenLink) {
            mAcsTokenLink = acsTokenLink;
            return this;
        }

        public Epub.Builder withIsAvailable(Boolean isAvailable) {
            mIsAvailable = isAvailable;
            return this;
        }

        public Epub build() {
            Epub Epub = new Epub();
            Epub.mAcsTokenLink = mAcsTokenLink;
            Epub.mIsAvailable = mIsAvailable;
            return Epub;
        }

    }

}

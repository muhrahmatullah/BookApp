
package com.example.muhrahmatullah.book.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Pdf {

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

        public Pdf.Builder withAcsTokenLink(String acsTokenLink) {
            mAcsTokenLink = acsTokenLink;
            return this;
        }

        public Pdf.Builder withIsAvailable(Boolean isAvailable) {
            mIsAvailable = isAvailable;
            return this;
        }

        public Pdf build() {
            Pdf Pdf = new Pdf();
            Pdf.mAcsTokenLink = mAcsTokenLink;
            Pdf.mIsAvailable = mIsAvailable;
            return Pdf;
        }

    }

}

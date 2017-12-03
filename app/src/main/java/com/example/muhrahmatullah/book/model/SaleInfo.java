
package com.example.muhrahmatullah.book.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class SaleInfo {

    @SerializedName("country")
    private String mCountry;
    @SerializedName("isEbook")
    private Boolean mIsEbook;
    @SerializedName("saleability")
    private String mSaleability;

    public String getCountry() {
        return mCountry;
    }

    public Boolean getIsEbook() {
        return mIsEbook;
    }

    public String getSaleability() {
        return mSaleability;
    }

    public static class Builder {

        private String mCountry;
        private Boolean mIsEbook;
        private String mSaleability;

        public SaleInfo.Builder withCountry(String country) {
            mCountry = country;
            return this;
        }

        public SaleInfo.Builder withIsEbook(Boolean isEbook) {
            mIsEbook = isEbook;
            return this;
        }

        public SaleInfo.Builder withSaleability(String saleability) {
            mSaleability = saleability;
            return this;
        }

        public SaleInfo build() {
            SaleInfo SaleInfo = new SaleInfo();
            SaleInfo.mCountry = mCountry;
            SaleInfo.mIsEbook = mIsEbook;
            SaleInfo.mSaleability = mSaleability;
            return SaleInfo;
        }

    }

}


package com.example.muhrahmatullah.book.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Item {

    @SerializedName("accessInfo")
    private AccessInfo mAccessInfo;
    @SerializedName("etag")
    private String mEtag;
    @SerializedName("id")
    private String mId;
    @SerializedName("kind")
    private String mKind;
    @SerializedName("saleInfo")
    private SaleInfo mSaleInfo;
    @SerializedName("searchInfo")
    private SearchInfo mSearchInfo;
    @SerializedName("selfLink")
    private String mSelfLink;
    @SerializedName("volumeInfo")
    private VolumeInfo mVolumeInfo;

    public AccessInfo getAccessInfo() {
        return mAccessInfo;
    }

    public String getEtag() {
        return mEtag;
    }

    public String getId() {
        return mId;
    }

    public String getKind() {
        return mKind;
    }

    public SaleInfo getSaleInfo() {
        return mSaleInfo;
    }

    public SearchInfo getSearchInfo() {
        return mSearchInfo;
    }

    public String getSelfLink() {
        return mSelfLink;
    }

    public VolumeInfo getVolumeInfo() {
        return mVolumeInfo;
    }

    public static class Builder {

        private AccessInfo mAccessInfo;
        private String mEtag;
        private String mId;
        private String mKind;
        private SaleInfo mSaleInfo;
        private SearchInfo mSearchInfo;
        private String mSelfLink;
        private VolumeInfo mVolumeInfo;

        public Item.Builder withAccessInfo(AccessInfo accessInfo) {
            mAccessInfo = accessInfo;
            return this;
        }

        public Item.Builder withEtag(String etag) {
            mEtag = etag;
            return this;
        }

        public Item.Builder withId(String id) {
            mId = id;
            return this;
        }

        public Item.Builder withKind(String kind) {
            mKind = kind;
            return this;
        }

        public Item.Builder withSaleInfo(SaleInfo saleInfo) {
            mSaleInfo = saleInfo;
            return this;
        }

        public Item.Builder withSearchInfo(SearchInfo searchInfo) {
            mSearchInfo = searchInfo;
            return this;
        }

        public Item.Builder withSelfLink(String selfLink) {
            mSelfLink = selfLink;
            return this;
        }

        public Item.Builder withVolumeInfo(VolumeInfo volumeInfo) {
            mVolumeInfo = volumeInfo;
            return this;
        }

        public Item build() {
            Item Item = new Item();
            Item.mAccessInfo = mAccessInfo;
            Item.mEtag = mEtag;
            Item.mId = mId;
            Item.mKind = mKind;
            Item.mSaleInfo = mSaleInfo;
            Item.mSearchInfo = mSearchInfo;
            Item.mSelfLink = mSelfLink;
            Item.mVolumeInfo = mVolumeInfo;
            return Item;
        }

    }

}

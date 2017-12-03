
package com.example.muhrahmatullah.book.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class AccessInfo {

    @SerializedName("accessViewStatus")
    private String mAccessViewStatus;
    @SerializedName("country")
    private String mCountry;
    @SerializedName("embeddable")
    private Boolean mEmbeddable;
    @SerializedName("epub")
    private Epub mEpub;
    @SerializedName("pdf")
    private Pdf mPdf;
    @SerializedName("publicDomain")
    private Boolean mPublicDomain;
    @SerializedName("quoteSharingAllowed")
    private Boolean mQuoteSharingAllowed;
    @SerializedName("textToSpeechPermission")
    private String mTextToSpeechPermission;
    @SerializedName("viewability")
    private String mViewability;
    @SerializedName("webReaderLink")
    private String mWebReaderLink;

    public String getAccessViewStatus() {
        return mAccessViewStatus;
    }

    public String getCountry() {
        return mCountry;
    }

    public Boolean getEmbeddable() {
        return mEmbeddable;
    }

    public Epub getEpub() {
        return mEpub;
    }

    public Pdf getPdf() {
        return mPdf;
    }

    public Boolean getPublicDomain() {
        return mPublicDomain;
    }

    public Boolean getQuoteSharingAllowed() {
        return mQuoteSharingAllowed;
    }

    public String getTextToSpeechPermission() {
        return mTextToSpeechPermission;
    }

    public String getViewability() {
        return mViewability;
    }

    public String getWebReaderLink() {
        return mWebReaderLink;
    }

    public static class Builder {

        private String mAccessViewStatus;
        private String mCountry;
        private Boolean mEmbeddable;
        private Epub mEpub;
        private Pdf mPdf;
        private Boolean mPublicDomain;
        private Boolean mQuoteSharingAllowed;
        private String mTextToSpeechPermission;
        private String mViewability;
        private String mWebReaderLink;

        public AccessInfo.Builder withAccessViewStatus(String accessViewStatus) {
            mAccessViewStatus = accessViewStatus;
            return this;
        }

        public AccessInfo.Builder withCountry(String country) {
            mCountry = country;
            return this;
        }

        public AccessInfo.Builder withEmbeddable(Boolean embeddable) {
            mEmbeddable = embeddable;
            return this;
        }

        public AccessInfo.Builder withEpub(Epub epub) {
            mEpub = epub;
            return this;
        }

        public AccessInfo.Builder withPdf(Pdf pdf) {
            mPdf = pdf;
            return this;
        }

        public AccessInfo.Builder withPublicDomain(Boolean publicDomain) {
            mPublicDomain = publicDomain;
            return this;
        }

        public AccessInfo.Builder withQuoteSharingAllowed(Boolean quoteSharingAllowed) {
            mQuoteSharingAllowed = quoteSharingAllowed;
            return this;
        }

        public AccessInfo.Builder withTextToSpeechPermission(String textToSpeechPermission) {
            mTextToSpeechPermission = textToSpeechPermission;
            return this;
        }

        public AccessInfo.Builder withViewability(String viewability) {
            mViewability = viewability;
            return this;
        }

        public AccessInfo.Builder withWebReaderLink(String webReaderLink) {
            mWebReaderLink = webReaderLink;
            return this;
        }

        public AccessInfo build() {
            AccessInfo AccessInfo = new AccessInfo();
            AccessInfo.mAccessViewStatus = mAccessViewStatus;
            AccessInfo.mCountry = mCountry;
            AccessInfo.mEmbeddable = mEmbeddable;
            AccessInfo.mEpub = mEpub;
            AccessInfo.mPdf = mPdf;
            AccessInfo.mPublicDomain = mPublicDomain;
            AccessInfo.mQuoteSharingAllowed = mQuoteSharingAllowed;
            AccessInfo.mTextToSpeechPermission = mTextToSpeechPermission;
            AccessInfo.mViewability = mViewability;
            AccessInfo.mWebReaderLink = mWebReaderLink;
            return AccessInfo;
        }

    }

}

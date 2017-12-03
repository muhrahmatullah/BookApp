
package com.example.muhrahmatullah.book.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;

//@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class VolumeInfo implements Parcelable {

    @SerializedName("allowAnonLogging")
    private Boolean mAllowAnonLogging;
    @SerializedName("authors")
    private List<String> mAuthors;
    @SerializedName("averageRating")
    private Double mAverageRating;
    @SerializedName("canonicalVolumeLink")
    private String mCanonicalVolumeLink;
    @SerializedName("categories")
    private List<String> mCategories;
    @SerializedName("contentVersion")
    private String mContentVersion;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("imageLinks")
    private ImageLinks mImageLinks;
    @SerializedName("industryIdentifiers")
    private List<IndustryIdentifier> mIndustryIdentifiers;
    @SerializedName("infoLink")
    private String mInfoLink;
    @SerializedName("language")
    private String mLanguage;
    @SerializedName("maturityRating")
    private String mMaturityRating;
    @SerializedName("pageCount")
    private Long mPageCount;
    @SerializedName("panelizationSummary")
    private PanelizationSummary mPanelizationSummary;
    @SerializedName("previewLink")
    private String mPreviewLink;
    @SerializedName("printType")
    private String mPrintType;
    @SerializedName("publishedDate")
    private String mPublishedDate;
    @SerializedName("publisher")
    private String mPublisher;
    @SerializedName("ratingsCount")
    private Long mRatingsCount;
    @SerializedName("readingModes")
    private ReadingModes mReadingModes;
    @SerializedName("subtitle")
    private String mSubtitle;
    @SerializedName("title")
    private String mTitle;

    public Boolean getAllowAnonLogging() {
        return mAllowAnonLogging;
    }

    public List<String> getAuthors() {
        return mAuthors;
    }

    public Double getAverageRating() {
        return mAverageRating;
    }

    public String getCanonicalVolumeLink() {
        return mCanonicalVolumeLink;
    }

    public List<String> getCategories() {
        return mCategories;
    }

    public String getContentVersion() {
        return mContentVersion;
    }

    public String getDescription() {
        return mDescription;
    }

    public ImageLinks getImageLinks() {
        return mImageLinks;
    }

    public List<IndustryIdentifier> getIndustryIdentifiers() {
        return mIndustryIdentifiers;
    }

    public String getInfoLink() {
        return mInfoLink;
    }

    public String getLanguage() {
        return mLanguage;
    }

    public String getMaturityRating() {
        return mMaturityRating;
    }

    public Long getPageCount() {
        return mPageCount;
    }

    public PanelizationSummary getPanelizationSummary() {
        return mPanelizationSummary;
    }

    public String getPreviewLink() {
        return mPreviewLink;
    }

    public String getPrintType() {
        return mPrintType;
    }

    public String getPublishedDate() {
        return mPublishedDate;
    }

    public String getPublisher() {
        return mPublisher;
    }

    public Long getRatingsCount() {
        return mRatingsCount;
    }

    public ReadingModes getReadingModes() {
        return mReadingModes;
    }

    public String getSubtitle() {
        return mSubtitle;
    }

    public String getTitle() {
        return mTitle;
    }

    public static class Builder implements Parcelable {

        private Boolean mAllowAnonLogging;
        private List<String> mAuthors;
        private Double mAverageRating;
        private String mCanonicalVolumeLink;
        private List<String> mCategories;
        private String mContentVersion;
        private String mDescription;
        private ImageLinks mImageLinks;
        private List<IndustryIdentifier> mIndustryIdentifiers;
        private String mInfoLink;
        private String mLanguage;
        private String mMaturityRating;
        private Long mPageCount;
        private PanelizationSummary mPanelizationSummary;
        private String mPreviewLink;
        private String mPrintType;
        private String mPublishedDate;
        private String mPublisher;
        private Long mRatingsCount;
        private ReadingModes mReadingModes;
        private String mSubtitle;
        private String mTitle;

        public VolumeInfo.Builder withAllowAnonLogging(Boolean allowAnonLogging) {
            mAllowAnonLogging = allowAnonLogging;
            return this;
        }

        public VolumeInfo.Builder withAuthors(List<String> authors) {
            mAuthors = authors;
            return this;
        }

        public VolumeInfo.Builder withAverageRating(Double averageRating) {
            mAverageRating = averageRating;
            return this;
        }

        public VolumeInfo.Builder withCanonicalVolumeLink(String canonicalVolumeLink) {
            mCanonicalVolumeLink = canonicalVolumeLink;
            return this;
        }

        public VolumeInfo.Builder withCategories(List<String> categories) {
            mCategories = categories;
            return this;
        }

        public VolumeInfo.Builder withContentVersion(String contentVersion) {
            mContentVersion = contentVersion;
            return this;
        }

        public VolumeInfo.Builder withDescription(String description) {
            mDescription = description;
            return this;
        }

        public VolumeInfo.Builder withImageLinks(ImageLinks imageLinks) {
            mImageLinks = imageLinks;
            return this;
        }

        public VolumeInfo.Builder withIndustryIdentifiers(List<IndustryIdentifier> industryIdentifiers) {
            mIndustryIdentifiers = industryIdentifiers;
            return this;
        }

        public VolumeInfo.Builder withInfoLink(String infoLink) {
            mInfoLink = infoLink;
            return this;
        }

        public VolumeInfo.Builder withLanguage(String language) {
            mLanguage = language;
            return this;
        }

        public VolumeInfo.Builder withMaturityRating(String maturityRating) {
            mMaturityRating = maturityRating;
            return this;
        }

        public VolumeInfo.Builder withPageCount(Long pageCount) {
            mPageCount = pageCount;
            return this;
        }

        public VolumeInfo.Builder withPanelizationSummary(PanelizationSummary panelizationSummary) {
            mPanelizationSummary = panelizationSummary;
            return this;
        }

        public VolumeInfo.Builder withPreviewLink(String previewLink) {
            mPreviewLink = previewLink;
            return this;
        }

        public VolumeInfo.Builder withPrintType(String printType) {
            mPrintType = printType;
            return this;
        }

        public VolumeInfo.Builder withPublishedDate(String publishedDate) {
            mPublishedDate = publishedDate;
            return this;
        }

        public VolumeInfo.Builder withPublisher(String publisher) {
            mPublisher = publisher;
            return this;
        }

        public VolumeInfo.Builder withRatingsCount(Long ratingsCount) {
            mRatingsCount = ratingsCount;
            return this;
        }

        public VolumeInfo.Builder withReadingModes(ReadingModes readingModes) {
            mReadingModes = readingModes;
            return this;
        }

        public VolumeInfo.Builder withSubtitle(String subtitle) {
            mSubtitle = subtitle;
            return this;
        }

        public VolumeInfo.Builder withTitle(String title) {
            mTitle = title;
            return this;
        }

        public VolumeInfo build() {
            VolumeInfo VolumeInfo = new VolumeInfo();
            VolumeInfo.mAllowAnonLogging = mAllowAnonLogging;
            VolumeInfo.mAuthors = mAuthors;
            VolumeInfo.mAverageRating = mAverageRating;
            VolumeInfo.mCanonicalVolumeLink = mCanonicalVolumeLink;
            VolumeInfo.mCategories = mCategories;
            VolumeInfo.mContentVersion = mContentVersion;
            VolumeInfo.mDescription = mDescription;
            VolumeInfo.mImageLinks = mImageLinks;
            VolumeInfo.mIndustryIdentifiers = mIndustryIdentifiers;
            VolumeInfo.mInfoLink = mInfoLink;
            VolumeInfo.mLanguage = mLanguage;
            VolumeInfo.mMaturityRating = mMaturityRating;
            VolumeInfo.mPageCount = mPageCount;
            VolumeInfo.mPanelizationSummary = mPanelizationSummary;
            VolumeInfo.mPreviewLink = mPreviewLink;
            VolumeInfo.mPrintType = mPrintType;
            VolumeInfo.mPublishedDate = mPublishedDate;
            VolumeInfo.mPublisher = mPublisher;
            VolumeInfo.mRatingsCount = mRatingsCount;
            VolumeInfo.mReadingModes = mReadingModes;
            VolumeInfo.mSubtitle = mSubtitle;
            VolumeInfo.mTitle = mTitle;
            return VolumeInfo;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeValue(this.mAllowAnonLogging);
            dest.writeStringList(this.mAuthors);
            dest.writeValue(this.mAverageRating);
            dest.writeString(this.mCanonicalVolumeLink);
            dest.writeStringList(this.mCategories);
            dest.writeString(this.mContentVersion);
            dest.writeString(this.mDescription);
            dest.writeParcelable(this.mImageLinks, flags);
            dest.writeList(this.mIndustryIdentifiers);
            dest.writeString(this.mInfoLink);
            dest.writeString(this.mLanguage);
            dest.writeString(this.mMaturityRating);
            dest.writeValue(this.mPageCount);
            dest.writeParcelable(this.mPanelizationSummary, flags);
            dest.writeString(this.mPreviewLink);
            dest.writeString(this.mPrintType);
            dest.writeString(this.mPublishedDate);
            dest.writeString(this.mPublisher);
            dest.writeValue(this.mRatingsCount);
            dest.writeParcelable(this.mReadingModes, flags);
            dest.writeString(this.mSubtitle);
            dest.writeString(this.mTitle);
        }

        public Builder() {
        }

        protected Builder(Parcel in) {
            this.mAllowAnonLogging = (Boolean) in.readValue(Boolean.class.getClassLoader());
            this.mAuthors = in.createStringArrayList();
            this.mAverageRating = (Double) in.readValue(Double.class.getClassLoader());
            this.mCanonicalVolumeLink = in.readString();
            this.mCategories = in.createStringArrayList();
            this.mContentVersion = in.readString();
            this.mDescription = in.readString();
            this.mImageLinks = in.readParcelable(ImageLinks.class.getClassLoader());
            this.mIndustryIdentifiers = new ArrayList<IndustryIdentifier>();
            in.readList(this.mIndustryIdentifiers, IndustryIdentifier.class.getClassLoader());
            this.mInfoLink = in.readString();
            this.mLanguage = in.readString();
            this.mMaturityRating = in.readString();
            this.mPageCount = (Long) in.readValue(Long.class.getClassLoader());
            this.mPanelizationSummary = in.readParcelable(PanelizationSummary.class.getClassLoader());
            this.mPreviewLink = in.readString();
            this.mPrintType = in.readString();
            this.mPublishedDate = in.readString();
            this.mPublisher = in.readString();
            this.mRatingsCount = (Long) in.readValue(Long.class.getClassLoader());
            this.mReadingModes = in.readParcelable(ReadingModes.class.getClassLoader());
            this.mSubtitle = in.readString();
            this.mTitle = in.readString();
        }

        public static final Parcelable.Creator<Builder> CREATOR = new Parcelable.Creator<Builder>() {
            @Override
            public Builder createFromParcel(Parcel source) {
                return new Builder(source);
            }

            @Override
            public Builder[] newArray(int size) {
                return new Builder[size];
            }
        };
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.mAllowAnonLogging);
        dest.writeStringList(this.mAuthors);
        dest.writeValue(this.mAverageRating);
        dest.writeString(this.mCanonicalVolumeLink);
        dest.writeStringList(this.mCategories);
        dest.writeString(this.mContentVersion);
        dest.writeString(this.mDescription);
        dest.writeParcelable(this.mImageLinks, flags);
        dest.writeList(this.mIndustryIdentifiers);
        dest.writeString(this.mInfoLink);
        dest.writeString(this.mLanguage);
        dest.writeString(this.mMaturityRating);
        dest.writeValue(this.mPageCount);
        dest.writeParcelable(this.mPanelizationSummary, flags);
        dest.writeString(this.mPreviewLink);
        dest.writeString(this.mPrintType);
        dest.writeString(this.mPublishedDate);
        dest.writeString(this.mPublisher);
        dest.writeValue(this.mRatingsCount);
        dest.writeParcelable(this.mReadingModes, flags);
        dest.writeString(this.mSubtitle);
        dest.writeString(this.mTitle);
    }

    public VolumeInfo() {
    }

    protected VolumeInfo(Parcel in) {
        this.mAllowAnonLogging = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.mAuthors = in.createStringArrayList();
        this.mAverageRating = (Double) in.readValue(Double.class.getClassLoader());
        this.mCanonicalVolumeLink = in.readString();
        this.mCategories = in.createStringArrayList();
        this.mContentVersion = in.readString();
        this.mDescription = in.readString();
        this.mImageLinks = in.readParcelable(ImageLinks.class.getClassLoader());
        this.mIndustryIdentifiers = new ArrayList<IndustryIdentifier>();
        in.readList(this.mIndustryIdentifiers, IndustryIdentifier.class.getClassLoader());
        this.mInfoLink = in.readString();
        this.mLanguage = in.readString();
        this.mMaturityRating = in.readString();
        this.mPageCount = (Long) in.readValue(Long.class.getClassLoader());
        this.mPanelizationSummary = in.readParcelable(PanelizationSummary.class.getClassLoader());
        this.mPreviewLink = in.readString();
        this.mPrintType = in.readString();
        this.mPublishedDate = in.readString();
        this.mPublisher = in.readString();
        this.mRatingsCount = (Long) in.readValue(Long.class.getClassLoader());
        this.mReadingModes = in.readParcelable(ReadingModes.class.getClassLoader());
        this.mSubtitle = in.readString();
        this.mTitle = in.readString();
    }

    public static final Parcelable.Creator<VolumeInfo> CREATOR = new Parcelable.Creator<VolumeInfo>() {
        @Override
        public VolumeInfo createFromParcel(Parcel source) {
            return new VolumeInfo(source);
        }

        @Override
        public VolumeInfo[] newArray(int size) {
            return new VolumeInfo[size];
        }
    };
}

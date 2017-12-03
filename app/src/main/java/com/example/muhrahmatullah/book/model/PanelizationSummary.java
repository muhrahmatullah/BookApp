
package com.example.muhrahmatullah.book.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class PanelizationSummary implements Parcelable {

    @SerializedName("containsEpubBubbles")
    private Boolean mContainsEpubBubbles;
    @SerializedName("containsImageBubbles")
    private Boolean mContainsImageBubbles;

    public Boolean getContainsEpubBubbles() {
        return mContainsEpubBubbles;
    }

    public Boolean getContainsImageBubbles() {
        return mContainsImageBubbles;
    }

    public static class Builder {

        private Boolean mContainsEpubBubbles;
        private Boolean mContainsImageBubbles;

        public PanelizationSummary.Builder withContainsEpubBubbles(Boolean containsEpubBubbles) {
            mContainsEpubBubbles = containsEpubBubbles;
            return this;
        }

        public PanelizationSummary.Builder withContainsImageBubbles(Boolean containsImageBubbles) {
            mContainsImageBubbles = containsImageBubbles;
            return this;
        }

        public PanelizationSummary build() {
            PanelizationSummary PanelizationSummary = new PanelizationSummary();
            PanelizationSummary.mContainsEpubBubbles = mContainsEpubBubbles;
            PanelizationSummary.mContainsImageBubbles = mContainsImageBubbles;
            return PanelizationSummary;
        }

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.mContainsEpubBubbles);
        dest.writeValue(this.mContainsImageBubbles);
    }

    public PanelizationSummary() {
    }

    protected PanelizationSummary(Parcel in) {
        this.mContainsEpubBubbles = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.mContainsImageBubbles = (Boolean) in.readValue(Boolean.class.getClassLoader());
    }

    public static final Parcelable.Creator<PanelizationSummary> CREATOR = new Parcelable.Creator<PanelizationSummary>() {
        @Override
        public PanelizationSummary createFromParcel(Parcel source) {
            return new PanelizationSummary(source);
        }

        @Override
        public PanelizationSummary[] newArray(int size) {
            return new PanelizationSummary[size];
        }
    };
}

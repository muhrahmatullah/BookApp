
package com.example.muhrahmatullah.book.model;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class SearchInfo {

    @SerializedName("textSnippet")
    private String mTextSnippet;

    public String getTextSnippet() {
        return mTextSnippet;
    }

    public static class Builder {

        private String mTextSnippet;

        public SearchInfo.Builder withTextSnippet(String textSnippet) {
            mTextSnippet = textSnippet;
            return this;
        }

        public SearchInfo build() {
            SearchInfo SearchInfo = new SearchInfo();
            SearchInfo.mTextSnippet = mTextSnippet;
            return SearchInfo;
        }

    }

}

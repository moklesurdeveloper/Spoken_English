package com.spokenenglish.spokenenglish.Class;

public class DetailsInfo
{
    int position;
    String englishText,banglaText;


    public DetailsInfo(int position, String englishText, String banglaText) {
        this.position = position;
        this.englishText = englishText;
        this.banglaText = banglaText;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getEnglishText() {
        return englishText;
    }

    public void setEnglishText(String englishText) {
        this.englishText = englishText;
    }

    public String getBanglaText() {
        return banglaText;
    }

    public void setBanglaText(String banglaText) {
        this.banglaText = banglaText;
    }
}

package com.IndianTech.kumar.dailyweather;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by kumar on 3/7/2015.
 */
public class CurrentWeather {
    private String mIcon;
    private long mTime;
    private  double mTemperature;
    private double mHumidity;
    private double mPricipChance;
    private String mSummary;
    private String mTimeZone;

    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }

    public String getIcon() {
        return mIcon;

    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public double getTemperature() {
        return mTemperature;
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public double getHumidity() {
        return mHumidity;
    }

    public void setHumidity(double humidity) {
        mHumidity = humidity;
    }

    public double getPricipChance() {
        return mPricipChance;
    }

    public void setPricipChance(double pricipChance) {
        mPricipChance = pricipChance;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public String getFormattedDate(){
        SimpleDateFormat format = new SimpleDateFormat("h:mm a");
        format.setTimeZone(TimeZone.getTimeZone(getTimeZone()));
        String timeString = format.format(new Date(getTime()*1000));
        return timeString;
    }

    public int getIconId(){
        int iconId = 0;
        return iconId;
    }
}

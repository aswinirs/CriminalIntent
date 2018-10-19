package com.bignerdranch.android.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {
    public UUID getId() {
        return mId;
    }

    private UUID mId;

    public void setDate(Date date) {
        mDate = date;
    }

    public Date getDate() {
        return mDate;
    }

    private Date mDate;

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    private boolean mSolved;

    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }

    public String getPhotoFilename() {
        return "IMG_" + getId().toString() + ".jpg";
    }

    private String mSuspect;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    private String mTitle;

    public Crime() {
        this(UUID.randomUUID());
    }

    public Crime(UUID id) {
        mId = id;
        mDate = new Date();
    }
}

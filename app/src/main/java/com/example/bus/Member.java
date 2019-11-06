package com.example.bus;

import android.widget.TextView;

public class Member {
private String Name;
private String enrol;
private String  mDisplayDate;
private String date;



    public Member() {


    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEnrol() {
        return enrol;
    }

    public void setEnrol(String enrol) {
        this.enrol = enrol;
    }

    public String getmDisplayDate() {
        return mDisplayDate;
    }

    public void setmDisplayDate(String mDisplayDate) {
        this.mDisplayDate = mDisplayDate;
    }
}

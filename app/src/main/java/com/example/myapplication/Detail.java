package com.example.myapplication;

public class Detail {

    private String mSubject;
    private double mProgress;

    public Detail(String subject, double progress){
        mSubject = subject;
        mProgress = progress;
    }

    public String getmSubject(){
        return mSubject;
    }

    public double getmProgress(){
        return mProgress;
    }
}

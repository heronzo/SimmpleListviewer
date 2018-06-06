package com.example.root.simmplelistviewer;

import android.app.Application;
import android.content.pm.PackageInstaller;

import DataMode.MyObjectBox;
import io.objectbox.BoxStore;

public class MyApp extends Application {
    public static String TAG =MyApp.class.getSimpleName();
    private static MyApp session;
    private static BoxStore boxStore;
    @Override
    public void onCreate() {
        super.onCreate();
        session = MyApp.this;
        boxStore = MyObjectBox.builder().androidContext(MyApp.this).build();
    }
    public static MyApp getSession(){
        return session;
    }
    public BoxStore getMyBoxStore() {
        return boxStore;
    }
}
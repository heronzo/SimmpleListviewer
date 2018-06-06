package com.example.root.simmplelistviewer;

import android.app.Application;
import android.content.pm.PackageInstaller;

import DataMode.MyObjectBox;
import io.objectbox.BoxStore;

public class MyApp extends Application {
    public static String TAG =MyApp.class.getSimpleName();
    private static MyApp session;
    private static BoxStore boxStore;
    public static MyApp getSession(){
        return session;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        session = this;
        boxStore = MyObjectBox.builder().androidContext(MyApp.this).build();
    }
    public BoxStore getMyBoxStore() {
        return boxStore;
    }
}
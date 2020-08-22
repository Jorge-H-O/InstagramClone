package com.flixster.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("7bKDBBGKuVBPc2cXj1X8teA3di4FMWCOHAMp6qzL")
                .clientKey("t8OkdOBEnlGCwZ3jMQXbaulSRDAy2hpZdcJOG6I2")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

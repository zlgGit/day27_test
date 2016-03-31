package com.example.day27_test;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends IntentService {


    public MyService() {
        super("aaaaa");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

    }
}

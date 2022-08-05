package com.lcrnaula04bare; // replace com.your-app-name with your app’s name
import android.os.Build;
import android.util.Log;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;

public class LetsModule extends ReactContextBaseJavaModule {
    LetsModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "LetsModule";
    }

    @ReactMethod
    public void metodoManeiro(String name, Promise promise) {
        Log.d("LetsModule", "Primeiro param: " + Build.MODEL);
        promise.resolve(android.os.Build.MODEL);
    }
}
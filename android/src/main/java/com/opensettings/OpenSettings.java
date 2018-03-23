package com.opensettings;

import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class OpenSettings extends ReactContextBaseJavaModule {

    private ReactContext reactContext;

    public OpenSettings(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNOpenSettings";
    }

    //region React Native Methods
    @ReactMethod
    public void openSettings(String url) {
        final Intent i = new Intent();
        String action = null;
        if (TextUtils.isEmpty(url)){
            action = Settings.ACTION_SETTINGS;
        } else {
            action = "android.settings." + url.toUpperCase();
        }
        Log.i("open", action);
        if (Settings.ACTION_APPLICATION_DETAILS_SETTINGS.equals(action)){
            i.addCategory(Intent.CATEGORY_DEFAULT);
            i.setData(Uri.parse("package:" + reactContext.getPackageName()));
            i.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            i.addFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
        }
        i.setAction(action);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            reactContext.startActivity(i);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //endregion
}

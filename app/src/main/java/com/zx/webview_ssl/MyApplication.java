package com.zx.webview_ssl;

import android.app.Application;
import android.content.Context;

/**
 * Created by zhangxun on 2016/12/1.
 */

public class MyApplication extends Application {

    public static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }
}

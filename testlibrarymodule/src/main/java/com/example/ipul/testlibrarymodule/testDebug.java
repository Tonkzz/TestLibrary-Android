package com.example.ipul.testlibrarymodule;

import android.util.Log;

/**
 * Created by Syaiful on 10/9/2018.
 */

public class testDebug {

    private static final String TAG = "SUPER_AWESOME_API";

    public static void d(String message)
    { 
        Log.d(TAG, message);
    }
}

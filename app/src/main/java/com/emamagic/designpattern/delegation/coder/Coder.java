package com.emamagic.designpattern.delegation.coder;

import android.util.Log;

public class Coder implements WhoCanCode {

    private static final String TAG = "DELEGATION";

    @Override
    public void code() {
        Log.e(TAG, "Coder coding ...");
    }
}

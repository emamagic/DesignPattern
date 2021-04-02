package com.emamagic.designpattern.creational.delegation.designer;

import android.util.Log;

public class Designer2 implements WhoCanDesign {

    private static final String TAG = "DELEGATION";

    @Override
    public void design() {
        Log.e(TAG, "Designer2 designing ... ");
    }
}

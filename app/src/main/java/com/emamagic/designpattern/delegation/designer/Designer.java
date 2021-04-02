package com.emamagic.designpattern.delegation.designer;

import android.util.Log;

public class Designer implements WhoCanDesign {

    private static final String TAG = "DELEGATION";

    @Override
    public void design() {
        Log.e(TAG, "Designer designing ... ");
    }
}

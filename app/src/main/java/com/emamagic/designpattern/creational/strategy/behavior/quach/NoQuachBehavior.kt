package com.emamagic.designpattern.creational.strategy.behavior.quach

import android.util.Log
import com.emamagic.designpattern.creational.strategy.ibehavior.IQuachBehavior

class NoQuachBehavior: IQuachBehavior {

    override fun quach() { Log.e("STRATEGY", "NoQuachBehavior") }
}
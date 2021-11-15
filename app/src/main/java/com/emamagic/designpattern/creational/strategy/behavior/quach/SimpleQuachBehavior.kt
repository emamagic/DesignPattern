package com.emamagic.designpattern.creational.strategy.behavior.quach

import android.util.Log
import com.emamagic.designpattern.creational.strategy.ibehavior.IQuachBehavior

class SimpleQuachBehavior: IQuachBehavior {

    override fun quach() { Log.e("STRATEGY", "SimpleQuachBehavior") }
}
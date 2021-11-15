package com.emamagic.designpattern.creational.strategy.behavior.fly

import android.util.Log
import com.emamagic.designpattern.creational.strategy.ibehavior.IFlyBehavior

class JetFlyBehavior: IFlyBehavior {

    override fun fly() { Log.e("STRATEGY", "JetFlyBehavior") }
}
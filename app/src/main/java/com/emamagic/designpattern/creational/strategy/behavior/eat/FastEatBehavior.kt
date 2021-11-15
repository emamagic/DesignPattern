package com.emamagic.designpattern.creational.strategy.behavior.eat

import android.util.Log
import com.emamagic.designpattern.creational.strategy.ibehavior.IEatBehavior

class FastEatBehavior: IEatBehavior {

    override fun eat() { Log.e("STRATEGY", "FastEatBehavior") }
}
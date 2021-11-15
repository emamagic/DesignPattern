package com.emamagic.designpattern.creational.strategy

import com.emamagic.designpattern.creational.strategy.ibehavior.IEatBehavior
import com.emamagic.designpattern.creational.strategy.ibehavior.IFlyBehavior
import com.emamagic.designpattern.creational.strategy.ibehavior.IQuachBehavior

open class Duck(private val eatBehavior: IEatBehavior, private val flyBehavior: IFlyBehavior, private val quachBehavior: IQuachBehavior) {

    fun eat() { eatBehavior.eat() }
    fun fly() { flyBehavior.fly() }
    fun quach() { quachBehavior.quach() }

}
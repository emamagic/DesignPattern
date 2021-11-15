package com.emamagic.designpattern.creational.strategy.duck

import com.emamagic.designpattern.creational.strategy.Duck
import com.emamagic.designpattern.creational.strategy.behavior.eat.FastEatBehavior
import com.emamagic.designpattern.creational.strategy.behavior.fly.SimpleFlyBehavior
import com.emamagic.designpattern.creational.strategy.behavior.quach.NoQuachBehavior

class CityDuck: Duck(FastEatBehavior(), SimpleFlyBehavior(), NoQuachBehavior()) {

    init {
        eat()
        fly()
        quach()
    }

}
package com.emamagic.designpattern.creational.strategy.duck

import com.emamagic.designpattern.creational.strategy.Duck
import com.emamagic.designpattern.creational.strategy.behavior.eat.SimpleEatBehavior
import com.emamagic.designpattern.creational.strategy.behavior.fly.JetFlyBehavior
import com.emamagic.designpattern.creational.strategy.behavior.quach.SimpleQuachBehavior

class WildDuck: Duck(SimpleEatBehavior(), JetFlyBehavior(), SimpleQuachBehavior()) {

    init {
        eat()
        fly()
        quach()
    }

}
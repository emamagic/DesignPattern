package com.emamagic.designpattern.creational.delegation

import com.emamagic.designpattern.creational.delegation.coder.WhoCanCode
import com.emamagic.designpattern.creational.delegation.designer.WhoCanDesign

class EmployKotlin(private val coder: WhoCanCode, designer: WhoCanDesign): WhoCanCode by coder ,WhoCanDesign by designer
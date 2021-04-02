package com.emamagic.designpattern.delegation

import com.emamagic.designpattern.delegation.coder.WhoCanCode
import com.emamagic.designpattern.delegation.designer.WhoCanDesign

class EmployKotlin(private val coder: WhoCanCode, designer: WhoCanDesign): WhoCanCode by coder ,WhoCanDesign by designer
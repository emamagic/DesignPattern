package com.emamagic.designpattern.creational.delegation;

import com.emamagic.designpattern.creational.delegation.coder.WhoCanCode;
import com.emamagic.designpattern.creational.delegation.designer.WhoCanDesign;

public class EmployJava implements WhoCanDesign , WhoCanCode {

    private WhoCanCode coder;
    private WhoCanDesign designer;

    public EmployJava(WhoCanCode whoCanCode, WhoCanDesign whoCanDesign) {
        this.coder = whoCanCode;
        this.designer = whoCanDesign;
    }

    @Override
    public void code() {
        coder.code();
    }

    @Override
    public void design() {
        designer.design();
    }


}

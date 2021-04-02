package com.emamagic.designpattern.delegation;

import com.emamagic.designpattern.delegation.coder.WhoCanCode;
import com.emamagic.designpattern.delegation.designer.WhoCanDesign;

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

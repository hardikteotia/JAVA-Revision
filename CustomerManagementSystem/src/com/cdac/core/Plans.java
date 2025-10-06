package com.cdac.core;

public enum Plans {
    SILVER(100), GOLD(500) , PLATINUM(1000);

    private int planvalue;

    Plans(int planvalue) {
        this.planvalue = planvalue;
    }

    public int getPlanvalue() {
        return planvalue;
    }

    public void setPlanvalue(int planvalue) {
        this.planvalue = planvalue;
    }
}
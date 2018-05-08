package com.qyf.dubbowechat.config.datasource;

public enum DBTypeEnum {
	oa("oa");
    private String value;

    DBTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

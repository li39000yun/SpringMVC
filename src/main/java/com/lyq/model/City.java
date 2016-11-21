package com.lyq.model;

import java.io.Serializable;

/**
 * 城市模型
 */
public class City implements Serializable {

    private static final long serialVersionUID = 1L;
    private String provinceCode;
    private String cityCode;
    private String cityName;

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}  
package com.example.myweather.model;

import com.google.gson.annotations.SerializedName;

public class Main {
    @SerializedName("temp") private float temp;
    @SerializedName("pressure") private float pressure;
    @SerializedName("humidity") private int humidity;
    @SerializedName("temp_min") private float tempMin;
    @SerializedName("temp_max") private float tempMax;

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public float getTempMin() {
        return tempMin;
    }

    public void setTempMin(float tempMin) {
        this.tempMin = tempMin;
    }

    public float getTempMax() {
        return tempMax;
    }

    public void setTempMax(float tempMax) {
        this.tempMax = tempMax;
    }
}

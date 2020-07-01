package com.example.currencyexchange.data;

import com.google.gson.annotations.SerializedName;

public class GetCentralBank {

    @SerializedName("info")
    private String info;

    @SerializedName("description")
    private String description;

    @SerializedName("timestamp")
    private String timestamp;

    @SerializedName("rates")
    private Rates rates;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Rates getRates() {
        return rates;
    }

    public void setRates(Rates rates) {
        this.rates = rates;
    }
}

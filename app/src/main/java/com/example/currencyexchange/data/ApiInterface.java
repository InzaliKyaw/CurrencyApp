package com.example.currencyexchange.data;

import com.google.gson.JsonElement;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("api/latest")
    Call<JsonElement> getBankData();
}

package com.example.currencyexchange.activities;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.currencyexchange.R;
import com.example.currencyexchange.adapters.CurrencyAdapter;
import com.example.currencyexchange.data.ApiClient;
import com.example.currencyexchange.data.ApiInterface;
import com.example.currencyexchange.data.Rates;
import com.example.currencyexchange.data.deserializer.RatesDeserializer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private List<Rates> ratesList = new ArrayList<>();
    private RecyclerView recyclerView;
    private CurrencyAdapter currencyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerCurrency);
        ratesList = callAPI();


    }

    public void attachRecycler() {
        currencyAdapter = new CurrencyAdapter(ratesList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(currencyAdapter);
    }

    public List<Rates> callAPI() {
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<JsonElement> call = apiService.getBankData();


        call.enqueue(new Callback<JsonElement>() {
            @Override
            public void onResponse(Call<JsonElement> call, Response<JsonElement> response) {
                //JsonParser parser = new JsonParser();
                // JsonElement body = null;
                JsonObject body = null;

                if (response.isSuccessful() == true) {

                    body = response.body().getAsJsonObject();
                    Log.d(TAG, "onResponse: " + body);
                    if (body.isJsonObject()) {
                        Gson gson = new GsonBuilder()
                                .registerTypeAdapter(Rates.class, new RatesDeserializer())
                                .registerTypeAdapter(new TypeToken<List<Rates>>() {
                                }.getType(), new RatesDeserializer())
                                .create();

                        ratesList = gson.fromJson(body.get("rates"), new TypeToken<List<Rates>>() {
                        }.getType());


//                        JsonArray array = new JsonArray();
//                        array.add(body.get("rates"));
//                        for (int i = 0;i<array.size();i++){
//                            ratesList.add(ratesData);
//                        }
                        Log.d(TAG, "onResponse: " + ratesList);
                        attachRecycler();

                    }

                }
                Log.d(TAG, "onResponse: " + body);


            }

            @Override
            public void onFailure(Call<JsonElement> call, Throwable t) {

            }
        });


        return ratesList;
    }

}

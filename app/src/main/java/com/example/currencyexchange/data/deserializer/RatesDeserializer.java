package com.example.currencyexchange.data.deserializer;

import android.util.Log;

import com.example.currencyexchange.data.Rates;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

public class RatesDeserializer implements JsonDeserializer<List<Rates>> {
    @Override
    public List<Rates> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        JsonObject obj = json.getAsJsonObject();
        JsonParser parser = new JsonParser();
        List<Rates> subRatesList = new ArrayList<>();

//        if (obj.get("rates") != null&&!obj.get("rates").isJsonNull()){
//            JsonArray array = (JsonArray) parser.parse(String.valueOf(obj.get("rates").getAsJsonArray()));
//            for (int i= 0;i<array.size();i++){
//                subRatesList = context.deserialize(array.get(i),Rates.class);
//                subRatesList.add(subRatesList.get(i));
//            }
//        }
        if (obj.get("USD") != null && !obj.get("USD").isJsonNull()) {
            Rates rates = new Rates(obj.get("USD").getAsString(), "$", "USD");
            rates.setuSD(obj.get("USD").getAsString());
            subRatesList.add(rates);
        }
        if (obj.get("SAR") != null && !obj.get("SAR").isJsonNull()) {
            Rates rates = new Rates(obj.get("SAR").getAsString(), "", "SAR");
            rates.setsAR(obj.get("SAR").getAsString());
            subRatesList.add(rates);
        }
        if (obj.get("LAK") != null && !obj.get("LAK").isJsonNull()) {
            Rates rates = new Rates(obj.get("LAK").getAsString(), "₭", "LAK");
            rates.setlAK(obj.get("LAK").getAsString());
            subRatesList.add(rates);
        }
        if (obj.get("CNY") != null && !obj.get("CNY").isJsonNull()) {
            Rates rates = new Rates(obj.get("CNY").getAsString(), "¥", "CNY");
            rates.setcNY(obj.get("CNY").getAsString());
            subRatesList.add(rates);
        }
        if (obj.get("CHF") != null && !obj.get("CHF").isJsonNull()) {
            Rates rates = new Rates(obj.get("CHF").getAsString(), "CHF", "CHF");
            rates.setcHF(obj.get("CHF").getAsString());
            subRatesList.add(rates);
        }
        if (obj.get("VND") != null && !obj.get("VND").isJsonNull()) {
            Rates rates = new Rates(obj.get("VND").getAsString(), "₫", "VND");
            rates.setvND(obj.get("VND").getAsString());
            subRatesList.add(rates);
        }

        if (obj.get("LKR") != null && !obj.get("LKR").isJsonNull()) {
            Rates rates = new Rates(obj.get("LKR").getAsString(), "Rs", "LKR");
            rates.setlKR(obj.get("LKR").getAsString());
            subRatesList.add(rates);
        }
        if (obj.get("NZD") != null && !obj.get("NZD").isJsonNull()) {
            Rates rates = new Rates(obj.get("NZD").getAsString(), "$", "NZD");
            rates.setnZD(obj.get("NZD").getAsString());
            subRatesList.add(rates);
        }
        if (obj.get("EGP") != null && !obj.get("EGP").isJsonNull()) {
            Rates rates = new Rates(obj.get("EGP").getAsString(), "£", "EGP");
            rates.seteGP(obj.get("EGP").getAsString());
            subRatesList.add(rates);
        }
        if (obj.get("BDT") != null && !obj.get("BDT").isJsonNull()) {
            Rates rates = new Rates(obj.get("BDT").getAsString(), "Tk", "BDT");
            rates.setbDT(obj.get("BDT").getAsString());
            subRatesList.add(rates);
        }
        if (obj.get("IDR") != null && !obj.get("IDR").isJsonNull()) {
            Rates rates = new Rates(obj.get("IDR").getAsString(), "Rp", "IDR");
            rates.setiDR(obj.get("IDR").getAsString());
            subRatesList.add(rates);
        }
        if (obj.get("KRW") != null && !obj.get("KRW").isJsonNull()) {
            Rates rates = new Rates(obj.get("KRW").getAsString(), "₩", "KRW");
            rates.setkRW(obj.get("KRW").getAsString());
            subRatesList.add(rates);
        }
        if (obj.get("KHR") != null && !obj.get("KHR").isJsonNull()) {
            Rates rates = new Rates(obj.get("KHR").getAsString(), "៛", "KHR");
            rates.setkHR(obj.get("KHR").getAsString());
            subRatesList.add(rates);
        }
        if (obj.get("SGD") != null && !obj.get("SGD").isJsonNull()) {
            Rates rates = new Rates(obj.get("SGD").getAsString(), "$", "SGD");
            rates.setsGD(obj.get("SGD").getAsString());
            subRatesList.add(rates);
        }

        Log.d(TAG, "deserialize: ");
        return subRatesList;
    }
}

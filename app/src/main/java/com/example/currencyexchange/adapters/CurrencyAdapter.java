package com.example.currencyexchange.adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.currencyexchange.R;
import com.example.currencyexchange.data.Rates;

import java.util.List;

public class CurrencyAdapter extends RecyclerView.Adapter<CurrencyAdapter.CurrencyViewHolder> {

    private static final String TAG = "CurrencyAdapter";
    private List<Rates> ratesList;


    public static class CurrencyViewHolder extends RecyclerView.ViewHolder {
        TextView countryName;
        TextView currencyPrice;
        TextView signSymbol;

        public CurrencyViewHolder(@NonNull View itemView) {
            super(itemView);
            countryName = itemView.findViewById(R.id.txtCountry);
            signSymbol = itemView.findViewById(R.id.txtSign);
            currencyPrice = itemView.findViewById(R.id.txtCurrency);
        }
    }

    public CurrencyAdapter(List<Rates> ratesList) {
        this.ratesList = ratesList;
        Log.d(TAG, "CurrencyAdapter: " + ratesList);
    }

    @NonNull
    @Override
    public CurrencyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_currency, parent, false);
        return new CurrencyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CurrencyAdapter.CurrencyViewHolder holder, int position) {
        //GetCentralBank

        for (int i = 0; i < ratesList.size(); i++) {
            if (ratesList.get(i).getuSD() != null) {
                holder.countryName.setText(ratesList.get(position).getCountry());
            }
            holder.signSymbol.setText(ratesList.get(position).getSign() + " ");
            holder.currencyPrice.setText(ratesList.get(position).getJsonElement());
        }


    }

    @Override
    public int getItemCount() {
        return ratesList.size();
    }
}

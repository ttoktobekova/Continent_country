package com.example.continent_country;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.continent_country.databinding.ItemCountryBinding;

import java.util.ArrayList;

public class CountryAdapter1  extends RecyclerView.Adapter <CountryViewHolder>{
    private ArrayList <CountryModel1> countryList;

    public CountryAdapter1(ArrayList<CountryModel1> countryList) {
        this.countryList = countryList;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryViewHolder(ItemCountryBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
holder.onBind(countryList.get(position));
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }
}
class CountryViewHolder extends RecyclerView.ViewHolder {
private ItemCountryBinding binding;


    public CountryViewHolder(@NonNull ItemCountryBinding binding) {
        super(binding.getRoot());
this.binding = binding;
    }


    public void onBind(CountryModel1 country){
        Glide.with(binding.imgItem1).load(country.getImg()).into(binding.imgItem1);

    }
}
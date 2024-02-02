package com.example.continent_country;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.continent_country.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportFragmentManager().beginTransaction().add(R.id.cont_Frame, new ContinentFragment()).commit();
    }
}
package com.example.continent_country;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.continent_country.databinding.FragmentContinentBinding;
import com.example.continent_country.databinding.FragmentCountryBinding;

import java.util.ArrayList;


public class CountryFragment extends Fragment {

    private FragmentCountryBinding binding;
    private ArrayList<CountryModel1> countryList;
    private CountryAdapter1 adapter;
    private int position;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentCountryBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        position = getArguments().getInt("Key");
        checkPosition(position);
        adapter = new CountryAdapter1(countryList);
        binding.rvCountry.setAdapter(adapter);

    }

    public void checkPosition(int position) {
        if (position == 0) {
            loadEurasia();

        } else if (position == 1) {
            loadEurope();
        } else if (position == 2) {
            loadNothAmerica();
        } else if (position == 3) {
            loadSothAmerica();
        } else if (position == 4) {
            loadAfrica();

        } else if (position == 5) {
            loadAustralia();
        }
    }


    private void loadAfrica() {
        countryList = new ArrayList<>();
        countryList.add(new CountryModel1("https://www.nationalflags.shop/WebRoot/vilkasfi01/Shops/2014080403/53E4/B71B/78CA/FB58/38B4/0A28/100A/C09F/Flag_of_Russia_Fotor.jpg"));
        countryList.add(new CountryModel1("https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Flag_of_Kenya.svg/640px-Flag_of_Kenya.svg.png"));
        countryList.add(new CountryModel1("https://flagsystem.ua/tmp/trumb/839f63b0eb57a0ccc0f935dbbce49ea6.png"));
        countryList.add(new CountryModel1("https://upload.wikimedia.org/wikipedia/commons/7/71/Flag_of_Ethiopia.svg"));
        countryList.add(new CountryModel1("https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/Flag_of_Namibia.svg/800px-Flag_of_Namibia.svg.png"));
        countryList.add(new CountryModel1("https://img.freepik.com/premium-vector/flag-of-sudan_628407-626.jpg"));
    }

    private void loadAustralia() {
        countryList = new ArrayList<>();
        countryList.add(new CountryModel1("https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Flag_of_Palau.svg/1200px-Flag_of_Palau.svg.png"));
        countryList.add(new CountryModel1("https://flagof.ru/wp-content/uploads/2018/10/Australia.jpg"));
        countryList.add(new CountryModel1("data:image/png;base64,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"));
        countryList.add(new CountryModel1("https://lh3.googleusercontent.com/proxy/6aeLOFTSwVWYkYi9edgCgVxVRlRfW-IkQ1qYawX8yyas-Wlr7rxyyshuhhvGD0r-RjtguTYciZ7Ln49-dNnUnBvs"));
        countryList.add(new CountryModel1("https://wikiwandv2-19431.kxcdn.com/_next/image?url=https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Flag_of_Kiribati.svg/langru-640px-Flag_of_Kiribati.svg.png&w=640&q=50"));

    }

    private void loadEurope() {
        countryList = new ArrayList<>();
       countryList.add(new CountryModel1("https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Flag_of_Germany.svg/1200px-Flag_of_Germany.svg.png"));
       countryList.add(new CountryModel1("https://lh3.googleusercontent.com/proxy/qVB2Ga43TL-mOYMf0htA9GFxFCl1QZ8_DG6Gjl_-Hw3zdAMsobi0XKEDKZtAtsOz-apiG0XAzAwN9_c5ETBvYKQ612Ce1hcSSVY"));
       countryList.add(new CountryModel1("https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Flag_of_the_United_Kingdom_%283-5%29.svg/640px-Flag_of_the_United_Kingdom_%283-5%29.svg.png"));
       countryList.add(new CountryModel1("https://img.freepik.com/free-vector/illustration-of-uk-flag_53876-18166.jpg?size=626&ext=jpg&ga=GA1.1.1880011253.1701043200&semt=ais"));
       countryList.add(new CountryModel1("https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/Flag_of_Switzerland_%28Pantone%29.svg/250px-Flag_of_Switzerland_%28Pantone%29.svg.png"));
    }

    private void loadEurasia() {
        countryList = new ArrayList<>();
        countryList.add(new CountryModel1("https://www.nationalflags.shop/WebRoot/vilkasfi01/Shops/2014080403/53E4/B71B/78CA/FB58/38B4/0A28/100A/C09F/Flag_of_Russia_Fotor.jpg"));
        countryList.add(new CountryModel1("https://lh3.googleusercontent.com/proxy/UDQCH4yZOG-pdImjSU4-7NBD5IvpSwQGJLvPB1DCPhkNbER5tLbMMyAwYF_be7DnCskfoS7fPLwpACV2IYN1OUM4Iemrs02z6hgPyg"));
        countryList.add(new CountryModel1("https://akorda.kz/assets/media/flag_mediumThumb.jpg"));
        countryList.add(new CountryModel1("https://tolerance-homes.ru/storage/images/pages/l0Ifgk8JbUb7tKmC9LbJA5aukc8XjwzPqvvH9jph.jpeg"));
        countryList.add(new CountryModel1("https://upload.wikimedia.org/wikipedia/commons/thumb/1/10/Flag_of_Scotland.svg/langru-320px-Flag_of_Scotland.svg.png"));
    }

    private void loadSothAmerica() {
        countryList = new ArrayList<>();

        countryList.add(new CountryModel1("https://masterflag.ru/img/info-flagi/world/Brasil.png"));
        countryList.add(new CountryModel1("https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Flag_of_Peru_%28war%29.svg/2560px-Flag_of_Peru_%28war%29.svg.png"));
        countryList.add(new CountryModel1("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/1280px-Flag_of_Argentina.svg.png"));
        countryList.add(new CountryModel1("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Uruguay.svg/2560px-Flag_of_Uruguay.svg.png"));
        countryList.add(new CountryModel1("https://ogeo.info/wp-content/uploads/2023/05/flag-chili-vtoraya-versiya-1817-foto.png"));
    }

    private void loadNothAmerica() {
        countryList = new ArrayList<>();
        countryList.add(new CountryModel1("https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/US_flag_51_stars.svg/300px-US_flag_51_stars.svg.png"));
        countryList.add(new CountryModel1("https://flagof.ru/wp-content/uploads/2018/10/1200px-Flag_of_Canada_1964.svg_.png"));
        countryList.add(new CountryModel1("https://upload.wikimedia.org/wikipedia/commons/b/bd/Flag_of_Cuba.svg"));
        countryList.add(new CountryModel1("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c4/Flag_of_Dominica.svg/800px-Flag_of_Dominica.svg.png"));
        countryList.add(new CountryModel1("https://upload.wikimedia.org/wikipedia/commons/thumb/8/84/Flag_of_Panama_%281903%29.svg/2560px-Flag_of_Panama_%281903%29.svg.png"));

    }
}
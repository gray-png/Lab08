package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    

    // Will be implemented later using TDD (leave blank for now)
    public boolean hasCity(City city) { return cities.contains(city); }

    public void deleteCity(City city) {
        for(int i = 0 ; i < cities.size(); i++){
            if((cities.get(i).getCityName().equals(city.getCityName())) && (cities.get(i).getProvinceName().equals(city.getProvinceName()))) {
                cities.remove(i);
                break;
            }
        }
    }

    public int countCities() {
        return cities.size();
    }
}

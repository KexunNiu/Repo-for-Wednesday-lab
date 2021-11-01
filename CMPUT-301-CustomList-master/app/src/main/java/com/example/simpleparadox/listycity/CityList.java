package com.example.simpleparadox.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */

public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     */
    public void add(City city){
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list
     */

    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This returns a boolean value if the list has city
     * @param city
     * @return
     *      Return boolean value
     */
    public boolean hasCity(City city){
        if (cities.contains(city)) {
            return true;
        }

        return false;
    }

    /**
     * This delete a city if the city is in the list
     * @param city
     *      This is the city to delete
     */

    public void delete(City city){
        if (cities.contains(city)) {
            cities.remove(city);
        }

        else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * This count the cities in the list
     * @return
     *      This returns the number of cities
     */
    public int countCities(){
        int i = 0;

        for(;i<cities.size();i++);

        return i;
    }
}

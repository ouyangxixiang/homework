package com.swufe.javaee.beerV1.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    public List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jali Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
    public List<Beer> getBeers(String color)  {
        List<Beer> beers = new ArrayList<>();
        beers.add(new Beer(1990,"China"));
        beers.add(new Beer( 1991,"America"));
        return beers;
    }
}

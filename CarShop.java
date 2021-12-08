package com.company;

import java.util.*;

public class CarShop {
    public static void main(String[] args) {
        Map<String, Collection<String>> cars = new HashMap<>();
       // List<Collection<String>> allCars = new ArrayList<>();
      //  allCars.add(mercedes());
       // allCars.add(bmw());
       // allCars.add(audi());
        cars.put("Цена",mercedes());
        cars.put("качество",bmw());
        cars.put("цена, качество", audi());
        System.out.println("Варианты для покупки: "+"\n"+cars);
        System.out.println();
        System.out.println("Мой выбор " +cars.get("цена, качество"));
    }

    private static Collection<String> mercedes() {
        Collection<String> mercedes = new ArrayList<>();
        String model = "A-class";
        String yearEdition = "2010";
        String price = "10000 USD";
        mercedes.add(model);
        mercedes.add(yearEdition);
        mercedes.add(price);
        return mercedes;
    }

    private static Collection<String> bmw() {
        Collection<String> bmw = new ArrayList<>();
        String model = "520i Sedan";
        String yearEdition = "2012";
        String price = "11000 USD";
        bmw.add(model);
        bmw.add(yearEdition);
        bmw.add(price);
        return bmw;

    }
    private static Collection<String> audi() {
        Collection<String> audi = new ArrayList<>();
        String model = "Q7";
        String yearEdition = "2013";
        String price = "12000 USD";
        audi.add(model);
        audi.add(yearEdition);
        audi.add(price);
        return audi;
    }

}


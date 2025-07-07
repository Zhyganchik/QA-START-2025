package org.prog.session5;

import java.util.*;

public class CarColor {

    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();

        map.put("Nina", new ArrayList<>());
        map.get("Nina").add("Opel  - " + randomColor());
        map.get("Nina").add("Peugeot - " + randomColor());

        map.put("Max", new ArrayList<>());
        map.get("Max").add("Renault - " + randomColor());

        map.put("Olga", new ArrayList<>());
        map.get("Olga").add("Toyota  - " + randomColor());
        map.get("Olga").add("Chevrolet - " + randomColor());
        map.get("Olga").add("Hyundai  - " + randomColor());

        for (String name : map.keySet()) {
            System.out.println(name + " has cars:");
            for (String car : map.get(name)) {
                System.out.println(" * " + car);
            }
        }
    }
    public static String randomColor() {
        Random random = new Random();
        return switch (random.nextInt(5)) {
            case 0 -> "red";
            case 1 -> "green";
            case 2 -> "blue";
            case 3 -> "yellow";
            case 4 -> "pink";
            default -> "black";
        };
    }
}


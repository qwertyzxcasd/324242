package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(goWalking(25, 20));
        System.out.println(goWalking(95, 70));
        System.out.println(goWalking(26, 23));
        System.out.println(goWalking(15, 50));
        System.out.println(goWalking(22, 21));

        System.out.println();
        System.out.println(goWalking(generateRandomAge(), generateRandomTemperature()));
        System.out.println(goWalking(generateRandomAge(), generateRandomTemperature()));
        System.out.println(goWalking(generateRandomAge(), generateRandomTemperature()));
        System.out.println(goWalking(generateRandomAge(), generateRandomTemperature()));
        System.out.println(goWalking(generateRandomAge(), generateRandomTemperature()));
        System.out.println(goWalking(generateRandomAge(), generateRandomTemperature()));
        System.out.println(goWalking(generateRandomAge(), generateRandomTemperature()));
        System.out.println(goWalking(generateRandomAge(), generateRandomTemperature()));
        System.out.println(goWalking(generateRandomAge(), generateRandomTemperature()));




    }



    public static String goWalking(int age, int temperature) {

        if (age >= 20 && age < 45 && temperature > -20 && temperature < 30) {
            return age+" age you can go for a walk, temperature "+temperature;
        } else if (age < 20 && temperature >= 0 && temperature < 28) {
            return  age+" age you can go for a walk, temperature "+temperature;
        } else if (age > 45 && temperature >= -10 && temperature < 25) {
            return  age+" age you can go for a walk, temperature "+temperature;
        } else {
            return age+" age stay at home temperature "+temperature;
        }

    }

    public static int generateRandomAge(){
        Random zxcursed = new Random();
        return zxcursed.nextInt(60)+1;

    }
    public static int generateRandomTemperature(){
        Random zxcursed = new Random();
        return zxcursed.nextInt(40)-30;

    }
}

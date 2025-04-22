package ParkingLot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Car {

    enum CarType {
        JEEP, BMW, AUDI
    }

    enum Color {
        RED, BLUE, BLACK
    }

    public static void main(String[] args) {

        String mostFreqColor;
        String mostFreqType;

        List<CarType> vehiclesType = new ArrayList<>();
        List<Color>  vehiclesColor = new ArrayList<>();

        List<CarType> carTypeList = List.of(CarType.values());
        List<Color> colorList = List.of(Color.values());

        for (int i = 0; i < 100; i++) {
            int randomIndex = (int) (Math.random()*CarType.values().length);
            vehiclesType.add(carTypeList.get(randomIndex));
        }

        int numOfJeep = 0;
        int numOfBmw = 0;
        int numOfAudi = 0;

        for (CarType car : vehiclesType) {
            if (car == CarType.BMW) {
                numOfBmw++;
            } else if (car == CarType.AUDI) {
                numOfAudi++;
            } else {
                numOfJeep++;
            }
        }

        List<Integer> carTypeFrequency = new ArrayList<>();
        carTypeFrequency.add(numOfAudi);
        carTypeFrequency.add(numOfBmw);
        carTypeFrequency.add(numOfJeep);

        if (carTypeFrequency.get(0) >= carTypeFrequency.get(1)) {
            if (carTypeFrequency.get(0) >= carTypeFrequency.get(2)) {
                mostFreqType = "Audi";
            } else {
                mostFreqType = "Jeep";
            }
        } else if (carTypeFrequency.get(1) >= carTypeFrequency.get(2)) {
            mostFreqType = "BMW";
        } else {
            mostFreqType = "Jeep";
        }

        System.out.println("Jeep : " + numOfJeep);
        System.out.println("BMW : " + numOfBmw);
        System.out.println("Audi : " + numOfAudi);
        System.out.println("----------");

        for (int i = 0; i < 100; i++) {
            int randomIndex = (int) (Math.random()*Color.values().length);
            vehiclesColor.add(colorList.get(randomIndex));
        }

        int numOfRed = 0;
        int numOfBlue = 0;
        int numOfBlack = 0;

        for (Color color : vehiclesColor) {
            if (color == Color.RED) {
                numOfRed++;
            } else if (color == Color.BLACK) {
                numOfBlack++;
            } else {
                numOfBlue++;
            }
        }

        List<Integer> carColorFrequency = new ArrayList<>();
        carColorFrequency.add(numOfRed);
        carColorFrequency.add(numOfBlue);
        carColorFrequency.add(numOfBlack);

        if (carColorFrequency.get(0) >= carColorFrequency.get(1)) {
            if (carColorFrequency.get(0) >= carColorFrequency.get(2)) {
                mostFreqColor = "red";
            } else {
                mostFreqColor = "black";
            }
        } else if (carColorFrequency.get(1) >= carColorFrequency.get(2)) {
            mostFreqColor = "blue";
        } else {
            mostFreqColor = "black";
        }


        System.out.println("Black : " + numOfBlack);
        System.out.println("Blue : " + numOfBlue);
        System.out.println("Red : " + numOfRed);
        System.out.println("----------");


        System.out.println("The most frequently occurring vehicle is the " + mostFreqColor + " " + mostFreqType + ".");
    }
}

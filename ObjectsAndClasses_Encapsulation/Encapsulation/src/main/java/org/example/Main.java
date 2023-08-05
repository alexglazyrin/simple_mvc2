package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Elevator elevator = new Elevator(-3, 26);

        while (true){
            System.out.println("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }*/

        Dimensions dimensions = new Dimensions(450,250,150);
        Cargo cargo = new Cargo(dimensions,25.5,"St.-Petersburg, Solada Korzuna, 26-1",
                true,"ak4302002z00192",false);

        System.out.printf(cargo.toString());


        cargo.setDimensions(dimensions.setHeight(800));
        cargo.setWeight(10.0);
        cargo.setAddres("St.-Petesburg, Ozerkovaja 5-3");
        cargo.getAddres();
        cargo.setWeight(17.5);

        System.out.println(cargo.toString());
    }
}

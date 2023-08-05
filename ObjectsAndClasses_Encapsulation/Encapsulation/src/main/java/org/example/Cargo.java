package org.example;

public class Cargo {
    private final Dimensions dimensions;
    private final double weight;
    private final String addres;
    private final boolean isCanFlip;
    private final String regNumber;
    private final boolean isFragil;

    public Cargo(Dimensions dimensions, double weight, String addres, boolean isCanFlip,
                 String regNumber, boolean isFragil) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.addres = addres;
        this.isCanFlip = isCanFlip;
        this.regNumber = regNumber;
        this.isFragil = isFragil;
    }

    public String toString(){
        return "Размеры: \n" + dimensions.toString() +
                "\nВес: " + weight +
                "\nАдрес доставки: " + addres +
                "\nМожно кантовать: " + isCanFlip +
                "\nРег. номер: " + regNumber +
                "\nХрупкое: " + isFragil;
    }

    public Cargo setAddres(String addres){
        return new Cargo(dimensions, weight, addres, isCanFlip, regNumber, isFragil);
    }

    public Cargo setWeight(Double weight){
        return new Cargo(dimensions, weight, addres, isCanFlip, regNumber, isFragil);
    }

    public Cargo setDimensions(Dimensions dimensions){
        return new Cargo(dimensions, weight, addres, isCanFlip, regNumber, isFragil);
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public String getAddres() {
        return addres;
    }

    public boolean isCanFlip() {
        return isCanFlip;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public boolean isFragil() {
        return isFragil;
    }
}

package org.example;

public class Dimensions {
    private final int lengh;
    private final int width;
    private final int height;

    public Dimensions(int lengh, int width, int height) {
        this.lengh = lengh;
        this.width = width;
        this.height = height;
    }

    public double calculateVolume(int lengh, int width, int height){
        return lengh * width * height;
    }

    public Dimensions setLengh(int lengh){
        return new Dimensions(lengh, width, height);
    }

    public Dimensions setWidth(int width){
        return new Dimensions(lengh, width, height);
    }

    public Dimensions setHeight(int height){
        return new Dimensions(lengh, width, height);
    }

    public String toString(){
        return "L: " + lengh + " cm." + "\nW: " + width + " cm." + "\nH: " + height + " cm."
                + "\nV: " + calculateVolume(lengh,width,height)/100;
    }
}

package org.example;

public class Elevator {

    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor(){
        return currentFloor;
    }

    private void moveDown(){
            currentFloor = currentFloor - 1;

    }

    private void moveUp(){
            currentFloor = currentFloor + 1;

    }

    public void move(int floor){
        if (floor >= minFloor && floor <= maxFloor){
            if (currentFloor < floor){

                while (currentFloor <= floor){
                    System.out.println("Floor: " + currentFloor);
                    if(currentFloor == floor) break;
                    moveUp();
                }
            }else {
                while (currentFloor >= floor){
                    System.out.println("Floor: " + currentFloor);
                    if(currentFloor == floor) break;
                    moveDown();
                }
            }
            }else {
            System.out.println("Этаж задан не верно!");
        }
    }
}

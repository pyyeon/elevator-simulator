package com.v3;

public class Elevator {
    public int id;

    int currFloor;
    public int passNum;

    boolean isAvailable;
    public Elevator(int id, int currFloor) {
        this.id = id;
        this.currFloor = currFloor;
    }

    public int getDistance(int desFloor) {
        return Math.abs(desFloor - this.currFloor);
    }

    public void moveTo(int target) {
        isAvailable = false;

        while (this.currFloor != target) {
            this.currFloor += (target > this.currFloor) ? 1 : -1;
            System.out.println(id + "호기: " + currFloor + "층으로 이동중...");
        }
        isAvailable = true;
    }

}

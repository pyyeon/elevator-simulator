package com.v4;

import com.v3.Elevator;

public class ElevatorTask implements Runnable {
    private final Elevator elevator;
    private final int desFloor;
    private final int passengerNum;

    public ElevatorTask(Elevator elevator,int desFloor,int passengerNum ){
        this.elevator = elevator;
        this.desFloor = desFloor;
        this.passengerNum = passengerNum;
    }
    @Override
    public void run() {
        System.out.println(elevator.id + "호기 엘레베이터가 선택되었습니다.");
        elevator.passNum = passengerNum;
        System.out.println("탑승완료. 이동시작");
        elevator.moveTo(desFloor);
        System.out.println("현재층: "+ desFloor);
        //목적지=위치 > 도착
        System.out.println("도착했습니다.");
    }
}

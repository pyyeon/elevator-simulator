package com.v2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //엘레베이터 위치 > 층
        Elevator firstEl = new Elevator(1, 3);
        Elevator secondEl = new Elevator(2, 7);
        System.out.println("현재 엘리베이터 현황: ");
        System.out.println(firstEl.id +"호기 " + firstEl.currFloor + "층");
        System.out.println(secondEl.id +"호기 " + secondEl.currFloor + "층");
        //현재 위치 > 추후 탑승객으로 나눌 예정
        int passFloor = 2;
        //목적지 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 층으로 호출하시겠습니까? ");
        int desFloor = sc.nextInt();
        if (desFloor < 1) {
            System.out.println("잘못된 입력입니다.");
            return;
        }
        sc.nextLine();
        //엘레베이터 클래스 메서드에 담아도 될듯
        int firDistance = Math.abs(passFloor - firstEl.currFloor);
        int secDistance = Math.abs(passFloor - secondEl.currFloor);
        Elevator calledEl = (firDistance < secDistance) ? firstEl : secondEl;
        System.out.println(calledEl.id + "호기 엘레베이터가 선택되었습니다.");
        //바뀔때마다 현재위치 출력
        // 현재 > 목적지 까지 절댓값으로 1씩 이동
        int current = passFloor;

        while (current != desFloor) {
            current += (desFloor > current) ? 1 : -1;
            System.out.println(current + "층으로 이동중...");
        }

        //목적지=위치 > 도착
        System.out.println(desFloor + "층에 도착했습니다.");


    }

    public static class Elevator {
        int id;

        int currFloor;

        public Elevator(int id,int currFloor ){
            this.id = id;
            this.currFloor = currFloor;
        }

    }
}

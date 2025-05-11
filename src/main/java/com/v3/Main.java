package com.v3;

import java.util.Scanner;

public class Main {
    //엘리베이터는 탑승 인원 제한(예: 4명)을 가진다.
    static int maxNm = 4;
    //정상 탑승 시 이동 과정 출력.

        public static void main(String[] args) {
            //엘레베이터 위치 > 층
          Elevator firstEl = new Elevator(1, 3);
          Elevator secondEl = new Elevator(2, 7);
            int passFloor = 2;
            //목적지 입력
            Scanner sc = new Scanner(System.in);
            System.out.print("몇 층으로 이동하시겠습니까? ");
            int desFloor = sc.nextInt();
            while(desFloor > 1) {
                System.out.println("잘못된 입력입니다.");
                System.out.print("다시 입력하세요: ");
                desFloor = sc.nextInt();
            }
            sc.nextLine();
            //엘리베이터 호출 후 승객 수를 입력받는다.
            System.out.print("몇 명이 탑승합니까? ");
            int passengerNum = sc.nextInt();
            while (passengerNum > maxNm){
            //제한 초과 시 "초과 인원입니다. 탑승할 수 없습니다." 출력
                System.out.println("초과 인원입니다. 탑승할 수 없습니다.");
                System.out.print("다시 입력하세요: ");
                passengerNum = sc.nextInt();
            }

            sc.nextLine();
            ;

            //엘레베이터 클래스 메서드에 담아도 될듯
            int firDistance = firstEl.getDistance(desFloor);
            int secDistance = secondEl.getDistance(desFloor);

            Elevator calledEl = (firDistance < secDistance) ? firstEl : secondEl;
            System.out.println(calledEl.id + "호기 엘레베이터가 선택되었습니다.");
            calledEl.passNum = passengerNum;
            //바뀔때마다 현재위치 출력
            // 현재 > 목적지 까지 절댓값으로 1씩 이동
            System.out.println("탑승완료. 이동시작");
            calledEl.moveTo(passFloor);
            calledEl.moveTo(desFloor);
            System.out.println("현재층: "+ desFloor);
            //목적지=위치 > 도착
            System.out.println("도착했습니다.");


        }



}

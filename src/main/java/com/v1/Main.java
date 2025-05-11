package com.v1;


import java.util.*;
public class Main {
    //엘레베이터 위치 > 층
    //목적지 입력
    //바뀔때마다 현재위치 출력
    //목적지=위치 > 도착

    public static void main(String[] args){
        //엘레베이터 위치 > 층
        int currFloor =  1;
        System.out.println("현재 엘리베이터 위치: " + currFloor);
        //목적지 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 층으로 이동하시겠습니까? ");
        int desFloor = sc.nextInt();
         if(desFloor < 1){
             System.out.println("잘못된 입력입니다.");
             return;
         }
        sc.nextLine();
        int distance = Math.abs(desFloor - currFloor);
        //바뀔때마다 현재위치 출력
        // 현재 > 목적지 까지 절댓값으로 1씩 이동
        for(int i = 0; i < distance; i++){
            int m;
            if(desFloor > currFloor){
                m = desFloor + i;

            }else {
                m = desFloor - i;
            }
            System.out.println(m + "층으로 이동중...");

        }
        //목적지=위치 > 도착
        System.out.println(desFloor + "층에 도착했습니다.");


    }
}

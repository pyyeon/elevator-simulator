package com.v4;

import com.v3.Elevator;

public class Main {
    public static void main(String[] args) {
        Elevator e1 = new Elevator(1, 5);
        Elevator e2 = new Elevator(2, 7);
        Thread t1 = new Thread(new Elevatortask(e1, 4, 4));
        Thread t2 = new Thread(new Elevatortask(e2, 1, 2));
        t1.start();
        t2.start();
    }
}

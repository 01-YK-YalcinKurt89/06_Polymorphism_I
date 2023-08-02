package com.cc.java;

public class App {

    public static void main(String[] args) {
    Drone drone = new Drone();
    Worker worker = new Worker();
    Queen queen = new Queen();
        
    pollObj(queen);
    pollObj(worker);
    pollObj(drone);
    }


    // _____ 3. Iteration :: Overloading _____ //
    private static void pollObj(HoneyBee obj) {
        output(obj.doYourJob());
        output(obj.fly());
        output("---------------------");
    }



    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}


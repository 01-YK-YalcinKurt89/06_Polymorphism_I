package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    Drone drone = new Drone();
    Worker worker = new Worker();
    Queen queen = new Queen();
        

    output(queen.doYourJob());
    output(worker.doYourJob());
    output(drone.doYourJob());
    
    output("---------------------");

    output(queen.fly());
    output(worker.fly());
    output(drone.fly());




    }

   
   
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}


package com.cc.java;

public class App {
    // _____ 2. Iteration :: Overloading _____ //
    
    public static void main(String[] args) {
    Drone drone = new Drone();
    Worker worker = new Worker();
    Queen queen = new Queen();
        
    pollObj(queen);
    pollObj(worker);
    pollObj(drone);
    }


    private static void pollObj(Queen obj) {
        output(obj.doYourJob());
        output(obj.fly());
        output("---------------------");
    }

    private static void pollObj(Worker obj) {
        output(obj.doYourJob());
        output(obj.fly());
        output("---------------------");
    }

    private static void pollObj(Drone obj) {
        output(obj.doYourJob());
        output(obj.fly());
        output("---------------------");
    }

    
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}


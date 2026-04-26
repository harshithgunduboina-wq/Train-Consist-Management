package app;

import model.Coach;

public class Main {
    public static void main(String[] args) {

        Coach c1 = new Coach("S1", "Sleeper");
        Coach c2 = new Coach("AC1", "AC");

        System.out.println(c1);
        System.out.println(c2);
    }
}
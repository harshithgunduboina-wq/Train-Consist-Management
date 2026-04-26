package app;

import java.util.ArrayList;
import java.util.List;

public class UC2_Main {
    public static void main(String[] args) {

        System.out.println("=== UC2: Passenger Bogies Management ===");

        // Create ArrayList
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after adding
        System.out.println("After adding bogies:");
        System.out.println(passengerBogies);

        // Remove one bogie
        passengerBogies.remove("AC Chair");

        System.out.println("After removing AC Chair:");
        System.out.println(passengerBogies);

        // Check existence
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Does Sleeper exist? " + exists);

        // Final state
        System.out.println("Final list:");
        System.out.println(passengerBogies);
    }
}
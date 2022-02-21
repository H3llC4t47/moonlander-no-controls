package cz.educanet.praha;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter altitude: ");
        int altitude = sc.nextInt();
        System.out.println("\nEnter velocity");
        int velocity = sc.nextInt();

        ILanderControls controls = new Fuel();

        // TODO set controls

        try {
            final var lander = new LunarLanding(
                    controls,
                    altitude, // 5000
                    velocity // 500
            );

            System.out.println("Total amount of fuel: " + lander.land());
            System.out.println("Fuel in seconds: " + controls.getSecondsOfFuelBurn(altitude, velocity));
            
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}

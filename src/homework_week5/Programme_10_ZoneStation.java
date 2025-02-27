package homework_week5;

import java.util.Scanner;

/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Programme_10_ZoneStation {
    //main method
    public static void main(String[] args) {
        Programme_10_ZoneStation obj = new Programme_10_ZoneStation();
        obj.southKensington();
    }

    //create method
    public void southKensington() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter line name ");
        String input = scanner.next();
        //Switch
        switch (input) {
            case "Piccadilly":
            case "District":
            case "Circle":
                System.out.println("Line Pass through South Kensington");
                break;
            default:
                System.out.println("Line not passing from South Kensington");
                scanner.close();
        }
    }
}

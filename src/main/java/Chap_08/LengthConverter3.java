package Chap_08;

import java.util.Scanner;

public class LengthConverter3 {
    static class ParseError extends Exception {
        ParseError(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        double inches, feet, yards, miles;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter measurements in inches, feet, yards, or miles.");
        System.out.println("For example:  1 inch   17 feet   2.73 miles");
        System.out.println("You can use abbreviations:   in   ft  yd   mi");
        System.out.println("You can combine measurements, as in:  1 mile 270 yards 17 inches");
        System.out.println("I will convert your input into each of the four units of measure.");
        while(true) {
            System.out.println();
            System.out.println();
            System.out.println("Enter your measurement, or press return to end:");

            if(!sc.hasNextLine())
                break;

            String inputLine = sc.nextLine().trim();
            if(inputLine.isEmpty())
                break;

            try {
                inches = readMeasurement();
            } catch (ParseError e) {
                System.out.println("Error: " + e.getMessage());
                continue;
            }

            feet = inches / 12;
            yards = inches / 36;
            miles = inches / (12*5280);

            System.out.println();
            System.out.println("That's equivalent to:");
            System.out.printf("%12.5g", inches);
            System.out.println(" inches");
            System.out.printf("%12.5g", feet);
            System.out.println(" feet");
            System.out.printf("%12.5g", yards);
            System.out.println(" yards");
            System.out.printf("%12.5g", miles);
            System.out.println(" miles");
        }
        System.out.println();
        System.out.println("OK! Bye for now.");
        sc.close();
    }

    static double readMeasurement() throws ParseError {
        Scanner sc = new Scanner(System.in);

        double inches = 0.0;
        double measurement;
        String units;

        if(!sc.hasNext())
            throw new ParseError("You must enter a valid measurement.");

        while(sc.hasNext()) {
            if(!sc.hasNextDouble())
                throw new ParseError("You must enter a valid measurement.");

            measurement = sc.nextDouble();
            if(!sc.hasNext())
                throw new ParseError("You must enter a valid measurement.");

            units = sc.next().toLowerCase();

            switch(units) {
                case "inch", "inches", "in" -> inches += measurement;
                case "foot", "feet", "ft" -> inches += measurement * 12;
                case "yard", "yards", "yd" -> inches += measurement * 36;
                case "mile", "miles", "mi" -> inches += measurement * 12 * 5280;
                default -> throw new ParseError("Invalid measurement.");
            }
        }
        return inches;
    }
}

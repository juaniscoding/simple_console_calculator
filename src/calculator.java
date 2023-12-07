import java.util.*;
import java.util.concurrent.*;
import java.lang.*;



public class calculator {
    public static void main(String[] args) throws InterruptedException{

        System.out.println("This program is made by JUAN SANTHOSH from class VI E");


        Scanner sc = new Scanner(System.in);
        System.out.println("Choose 1-ADD");
        System.out.println("Choose 2-SUBTRACT");
        System.out.println("Choose 3-MULTIPLICATION");
        System.out.println("Choose 4-DIVISION");
        System.out.println("Choose 0-AREA");
        System.out.println("CHOOSE  5-CONVERSION OF CURRENCY");
        System.out.println("CHOOSE 6 FOR POWER(^)");



        byte mode = sc.nextByte();

        if (mode < 7 && mode >= 0) {


            switch (mode) {

                // ADD //
                case 1:
                    System.out.println("ADD");
                    System.out.println("        -made by juan");
                    System.out.println("Enter first digit");
                    double add1 = sc.nextDouble();
                    System.out.println("Enter second digit");
                    double add2 = sc.nextDouble();
                    double answer;
                    answer = add1 + add2;
                    System.out.println("sum is=" + answer);
                    if (answer < 0) {
                        System.out.println("The sum " + answer + " is not negative");
                    } else System.out.println("The sum " + answer + " is not negative");

                    break;


                //Subtract//

                case 2:

                    System.out.println("SUBTRACT");
                    System.out.println("          -made by juan");
                    System.out.println("Enter first digit");
                    double primDigit = sc.nextDouble();
                    System.out.println("Enter second digit");
                    double Subtractor = sc.nextDouble();
                    double difference;
                    difference = primDigit - Subtractor;
                    System.out.println("difference  is=" + difference);
                    if (difference < 0) {
                        System.out.println("The difference " + difference + " is negative");
                    } else System.out.println("The difference " + difference + " is not negative");
                    break;


                // Multiplication
                case 3:
                    System.out.println("MULTIPLIER");
                    System.out.println("          -made by juan");
                    System.out.println("Enter first digit");
                    double multiply= sc.nextDouble();
                    System.out.println("Enter second digit");
                    double multiply2 = sc.nextDouble();
                    double product;
                    product = multiply* multiply2;
                    System.out.println("The product is " + product);
                    if (product < 0) {
                        System.out.println("The product " + product + " is negative");
                    } else System.out.println("The product " + product + " is not negative");
                    break;


                // Divide
                case 4:
                    System.out.println("DIVIDER");
                    System.out.println("          -made by juan");
                    System.out.println("Enter divisor");
                    double dividend = sc.nextDouble();
                    System.out.println("Enter dividend");
                    double divisor = sc.nextDouble();
                    double quotient;
                    quotient = dividend / divisor;
                    double reminder = dividend % divisor;
                    System.out.println("The quotient is " + quotient);
                    System.out.println("The reminder is " + reminder);
                    if (quotient < 0) {
                        System.out.println("The quotient " + quotient + " is negative");
                    } else System.out.println("The quotient " + quotient + " is not negative");
                    break;

                // area//
                case 0:
                    System.out.println("press 3 for 3d (cubes,cuboids)");
                    System.out.println("press 2 for 2d (squares rectangles )");

                    double areaMode = sc.nextDouble();


                    //Area 2d/3d/circle//
                    if (areaMode == 3) {
                        System.out.println("Enter length");
                        final double length3 = sc.nextDouble();
                        System.out.println("Enter breadth");
                        final double breadth3 = sc.nextDouble();
                        System.out.println("Enter height");
                        final double height3 = sc.nextDouble();
                        System.out.println("The area is " + length3 * breadth3 * height3+" cm^3");


                    } else if (areaMode == 2) {
                        System.out.println("Enter breadth");
                        double b2 = sc.nextDouble();
                        System.out.println("Enter height");
                        double l2 = sc.nextDouble();
                        System.out.println("The area is " + l2 * b2+" cm^2");


                        //Area (circle)//
                    }
                    break;

                case 5:
                    System.out.println("CONVERSION OF CURRENCY");

                    System.out.println("1 = USD to INR");
                    System.out.println("2 = INR to USD");
                    System.out.println("3 = AUD to USD");
                    System.out.println("4 = AUD to INR");
                    System.out.println("5 = INR to AUD");
                    System.out.println("6 = USD to AUD");

                    double mcValue = sc.nextDouble();


                    double finalValue;
                    if (mcValue == 1) {

                        System.out.println("Enter USD to be converted to INR");
                        double USDtoBeConverted = sc.nextDouble();
                        finalValue = USDtoBeConverted * 83.18;

                        System.out.println(USDtoBeConverted + " USD is = " + finalValue + " INR");
                    } else if (mcValue == 2) {
                        System.out.println("Enter INR to be converted to USD");
                        double INRtoBeConverted = sc.nextDouble();
                        finalValue = INRtoBeConverted / 83.18;
                        System.out.println(INRtoBeConverted + " INR is = " + finalValue + " USD");
                    } else if (mcValue == 3) {
                        System.out.println("Enter AUD to be converted to USD");
                        double AUDtoBeConverted = sc.nextDouble();
                        finalValue = AUDtoBeConverted * 0.64;
                        System.out.println(AUDtoBeConverted + " AUD is = " + finalValue + " USD");
                    } else if (mcValue == 4) {
                        System.out.println("Enter AUD to be converted to INR");
                        double AUDtoBeConverted = sc.nextDouble();
                        finalValue = AUDtoBeConverted * 52.64;
                        System.out.println(AUDtoBeConverted + " AUD is = " + finalValue + " rupees");
                    } else if (mcValue == 5) {
                        System.out.println("Enter AUD to be converted to INR");
                        double INRtoBeConverted = sc.nextDouble();
                        finalValue = INRtoBeConverted / 52.64;
                        System.out.println(INRtoBeConverted + " AUD is = " + finalValue + " AUD");
                    } else if (mcValue == 6) {
                        System.out.println("Enter USD to be converted to AUD");
                        double USDtoBeConverted = sc.nextDouble();
                        finalValue = USDtoBeConverted / 0.64;
                        System.out.println(USDtoBeConverted + " USD is = " + finalValue + " AUD");

                    }
                case 6:
                    System.out.println("Enter the base value");
                    double baseValue =sc.nextDouble();
                    System.out.println("Enter the exponent value");
                    double exponentValue =sc.nextDouble();
                    System.out.println(Math.pow(baseValue,exponentValue));
                    break;







            }


            // Program end message//


            System.out.println("Type 1 to end Program now");
            System.out.println("Type 2 to end Program after 30 seconds");


            byte endMessage = sc.nextByte();
            switch (endMessage) {


                case 2:
                    System.out.println("PROGRAM WILL BE AUTO-TERMINATED IN 30 SECONDS-(made by Juan)");
                    TimeUnit.SECONDS.sleep(20);
                    System.out.println("Warning!! program will be AUTO-TERMINATED IN 10 SECONDS ");
                    TimeUnit.SECONDS.sleep(5);
                    System.out.println("Warning!!! program will be AUTO-TERMINATED IN 5 SECONDS ");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Thanks for using this program");
                    System.out.println("Warning!!! program will be AUTO-TERMINATED IN 3 SECONDS ");


                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("Warning!!! program will be AUTO-TERMINATED IN 2 SECONDS ");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("Warning!!! program will be AUTO-TERMINATED IN 1 SECONDS ");
                    TimeUnit.SECONDS.sleep(1);
                    break;

                case 1:
                    System.out.println("Thanks for using this program");
                    TimeUnit.SECONDS.sleep(1);
                    break;

            }


        }




    }
}

// "//To create exe do cmd "jar cvf jcc.jar calculator.class"
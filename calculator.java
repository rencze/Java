package Basic;

import java.util.Scanner;

public class Java1 {
    public static void main (String[] args){

        System.out.println("Hello world");

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Addition");
            System.out.println("Subtraction");
            System.out.println("Multiplication");
            System.out.println("Division");
            System.out.print("Enter your choice: ");
            int calculator = scanner.nextInt();
            switch (calculator) {
                case 1:
                    addition();
                break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                        break;
                    default:
                        System.out.println("Exiting the program...");
                        System.exit(0);
                        break;
                }

            }
        }


    public static void addition() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many number you do want to add?");
        int count = scanner.nextInt();
        scanner.nextLine();

        int sum = 0;

        for(int i = 0; i <= count; i++){
            System.out.print("Enter number: ");
            int number = scanner.nextInt();
            sum +=  number;
        }

        System.out.println("The Total is : " + sum);

    }

    public static void subtraction() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many number do you want to add?");
        int count = scanner.nextInt();
        scanner.nextLine();

        int difference = 0;

        for(int i = 0; i <= count; i++){
            System.out.print("Enter number: ");
            int number = scanner.nextInt();
            difference -= number;
        }
        System.out.println("The difference is: " + difference);

    }

    public static void multiplication() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many number do you want to multiply: ");
        int mul = scanner.nextInt();
        scanner.nextLine();

        int product = 1;

        for (int i = 0; i <= mul; i++) {
            System.out.print("Enter number:");
            int number = scanner.nextInt();
            product *= number;
        }
        System.out.println("The Product is : " + product);
    }

    public  static void division() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many number do you want to divide: ");
         int div = scanner.nextInt();
         scanner.nextLine();

         int quotient = 1;

         for(int i = 0; i <= div; i++){
             System.out.print("Enter number: ");
             int number = scanner.nextInt();

             quotient /= number;
         }
         System.out.println("The quotient is : " + quotient);

    }


}

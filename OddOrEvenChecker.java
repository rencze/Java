package Basic;
import java.util.Scanner;

public class OddOrEvenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number to check: ");
        int check = scanner.nextInt();
        scanner.nextLine();

        if(check %2 ==0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }


    }
}

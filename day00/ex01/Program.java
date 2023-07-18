import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");

        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        
        if (num <= 1) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
        boolean isPrime = true;
        int iterations = 0;

        for (int i = 2; i <= num / 2; i++) {
            iterations++;
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.print(isPrime + " ");  
        System.out.println(iterations);
        }
    }



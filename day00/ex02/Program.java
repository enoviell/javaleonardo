import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        int countercoff = 0;

        while (input!= 42) {
            if (isPrime(sum(input)) == true){
                countercoff++;
            }
            input = scanner.nextInt();
        }
        System.out.println("Count of coffee-request - " + countercoff);
    }

    private static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        else if (num == 2)
            return true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int Sum(int input) {
        int ris = 0;

        while (input != 0) {
            ris += input % 10;
            input /= 10;
        }
        return ris;
    }
}

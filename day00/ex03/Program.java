import java.util.Scanner;

public class Program {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Week = scanner.nextLine();
        int weekNum = 1;
        long grades = 0;

        while (weekNum <= 18 && !Week.equals("42")) {
            if (!Week.equals("Week " + weekNum)) {
                System.err.println("IllegalArgument");
                System.exit(-1);
            }
            grades = packGrade(getMin(scanner), grades, weekNum);
            weekNum++;
            Week = scanner.nextLine();
        }
        for (int i = 1; i < weekNum; i++) {
            System.out.print("Week " + i + " ");
            putSymbol(unpackGrade(i, grades));
        }
    }

    public static long packGrade(int minGrade, long grades, int index) {
        long ret;
        long dex = 1;

        for (int i = 1; i < index; i++) {
            dex *= 10;
        }
        ret = grades + (minGrade * dex);
        return ret;
    }

    public static int unpackGrade(int index, long grades) {
        int ret;

        for (int i = 1; i < index; i++) {
            grades /= 10;
        }
        ret = (int) (grades % 10);
        return ret;
    }

    private static void putSymbol(int minGrade) {
        for (int i = 0; i < minGrade; i++) {
            System.out.print("=");
        }
        System.out.println(">");
    }

    private static int getMin(Scanner scanner) {
        int min = scanner.nextInt();
        int current;

        for (int i = 1; i < 5; i++) {
            current = scanner.nextInt();
            if (current < min) {
                min = current;
            }
        }
        scanner.nextLine();
        return min;
    }
}

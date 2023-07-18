import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[] charCount = getCharOccurrences(input);
        char[] topChar = getTopChars(charCount);
        print(topChar, charCount);
    }

    private static int[] getCharOccurrences(String input) {
        int[] returns = new int[65536];
        char[] inputArray = input.toCharArray();

        for (int i = 0; i < input.length(); i++) {
            returns[inputArray[i]]++;
        }
        return returns;
    }

    private static char[] getTopChars(int[] inputs) {
        char[] returns = new char[10];
        int[] counts = new int[10];

        for (int j = 0; j < 10; j++) {
            int maxIndex = 0;
            for (int i = 0; i < 65536; i++) {
                if (inputs[i] > counts[j]) {
                    boolean exists = false;
                    for (int k = 0; k < j; k++) {
                        if (i == returns[k]) {
                            exists = true;
                            break;
                        }
                    }
                    if (!exists) {
                        maxIndex = i;
                        counts[j] = inputs[i];
                    }
                }
            }
            returns[j] = (char) maxIndex;
        }
        return returns;
    }

    private static void print(char[] topChar, int[] charCount) {
        int max = charCount[topChar[0]];
        int maxHeight = (max <= 10 ? max : 10);
        int totalLines = 2 + maxHeight;
        int[] graphs = new int[10];

        for (int i = 0; i < 10; i++) {
            if (max <= 10) {
                graphs[i] = charCount[topChar[i]];
            } else {
                graphs[i] = charCount[topChar[i]] * 10 / max;
            }
        }
        System.out.println();
        for (int i = 0; i < totalLines; i++) {
            for (int j = 0; j < 10; j++) {
                if (topChar[j] != 0) {
                    if (i + graphs[j] + 2 == totalLines) {
                        System.out.printf("%3d", charCount[topChar[j]]);
                    } else if (i == totalLines - 1) {
                        System.out.printf("%3c", topChar[j]);
                    } else if (i + graphs[j] >= maxHeight) {
                        System.out.printf("%3c", '#');
                    }
                    if (j != 10 - 1 && topChar[j + 1] != 0 && i + graphs[j + 1] >= maxHeight) {
                        System.out.printf("%c", ' ');
                    }
                }
            }
            System.out.println();
        }
    }
}

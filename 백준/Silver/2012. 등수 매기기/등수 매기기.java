import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] expectedRanks = new int[N];

        for (int i = 0; i < N; i++) {
            expectedRanks[i] = scanner.nextInt();
        }

        Arrays.sort(expectedRanks);

        long dissatisfaction = 0;
        for (int i = 0; i < N; i++) {
            dissatisfaction += Math.abs(expectedRanks[i] - (i + 1));
        }

        System.out.println(dissatisfaction);
    }
}

import java.util.Scanner;

public class Main {
    static int N, M;
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        arr = new int[M];
        visited = new boolean[N + 1];

        dfs(0);
        scanner.close();
    }

    private static void dfs(int depth) {
        if (depth == M) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i;
                dfs(depth + 1);
                visited[i] = false; // 백트래킹
            }
        }
    }
}

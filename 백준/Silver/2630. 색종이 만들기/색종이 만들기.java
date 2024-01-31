import java.util.Scanner;

public class Main {
    static int[][] paper;
    static int white = 0;
    static int blue = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        paper = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                paper[i][j] = sc.nextInt();
            }
        }

        partition(0, 0, N);
        System.out.println(white);
        System.out.println(blue);
    }

    static void partition(int x, int y, int size) {
        if (checkColor(x, y, size)) {
            if (paper[x][y] == 0) white++;
            else blue++;
            return;
        }

        int newSize = size / 2;//절반 사이즈
        partition(x, y, newSize);//2사분면
        partition(x, y + newSize, newSize);//1사분면
        partition(x + newSize, y, newSize);//3사분면
        partition(x + newSize, y + newSize, newSize);//4사분면
    }

    //현재 파티션의 컬러가 같은지 체크 
    static boolean checkColor(int x, int y, int size) {
        int color = paper[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (paper[i][j] != color) return false;
            }
        }
        return true;
    }
}

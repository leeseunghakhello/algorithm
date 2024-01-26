import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//대량의 데이터 처리에는 ButteredReader
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//대량의 데이터 처리에는 BufferedWriter
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numbers);

        for (int num : numbers) {
            bw.write(num + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

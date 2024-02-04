import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
            sum += numbers[i];
            frequencyMap.put(numbers[i], frequencyMap.getOrDefault(numbers[i], 0) + 1);
        }

        Arrays.sort(numbers);

        // 산술평균
        System.out.println(Math.round((double) sum / N));
        // 중앙값
        System.out.println(numbers[N / 2]);

        // 최빈값
        int maxFrequency = Collections.max(frequencyMap.values());
        List<Integer> modes = new ArrayList<>();
        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) == maxFrequency) {
                modes.add(key);
            }
        }
        Collections.sort(modes);
        if (modes.size() > 1) {
            System.out.println(modes.get(1));
        } else {
            System.out.println(modes.get(0));
        }

        // 범위
        System.out.println(numbers[N - 1] - numbers[0]);
    }
}

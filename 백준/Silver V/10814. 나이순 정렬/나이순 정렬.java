import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // 숫자 입력 후 남은 줄바꿈 문자 제거
        
        String[][] members = new String[N][3]; // 나이, 이름, 가입 순서 저장
        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            members[i][0] = parts[0]; // 나이
            members[i][1] = parts[1]; // 이름
            members[i][2] = String.valueOf(i); // 가입 순서
        }
        
        // 정렬: 나이를 기준으로 오름차순 정렬, 나이가 같으면 가입 순서(입력 순서)로 오름차순 정렬
        Arrays.sort(members, (a, b) -> {
            int ageCompare = Integer.compare(Integer.parseInt(a[0]), Integer.parseInt(b[0]));
            if (ageCompare == 0) {
                return Integer.compare(Integer.parseInt(a[2]), Integer.parseInt(b[2]));
            }
            return ageCompare;
        });
        
        // 결과 출력
        for (String[] member : members) {
            System.out.println(member[0] + " " + member[1]);
        }
        
        scanner.close();
    }
}

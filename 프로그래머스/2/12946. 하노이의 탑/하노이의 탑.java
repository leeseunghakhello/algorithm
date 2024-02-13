import java.util.ArrayList;
import java.util.List;

public class Solution {
    // 이동 순서를 저장할 리스트
    private List<int[]> moves = new ArrayList<>();

    public List<int[]> solution(int n) {
        hanoi(n, 1, 3, 2); // n개의 원판을 1번 기둥에서 3번 기둥으로 옮김
        return moves;
    }

    private void hanoi(int n, int start, int to, int via) {
        if (n == 1) {
            // 기저 조건: 원판이 1개일 때는 바로 옮기면 됨
            moves.add(new int[]{start, to});
        } else {
            // 1단계: n-1개의 원판을 시작 기둥에서 보조 기둥으로 옮김
            hanoi(n - 1, start, via, to);
            // 2단계: 가장 큰 원판을 시작 기둥에서 목표 기둥으로 옮김
            moves.add(new int[]{start, to});
            // 3단계: n-1개의 원판을 보조 기둥에서 목표 기둥으로 옮김
            hanoi(n - 1, via, to, start);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<int[]> result = solution.solution(2);
        for (int[] move : result) {
            System.out.println("[" + move[0] + ", " + move[1] + "]");
        }
    }
}

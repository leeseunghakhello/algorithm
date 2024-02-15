import java.util.HashMap;

public class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> clothesMap = new HashMap<>();

        // 옷의 종류별로 개수를 세어서 저장
        for (String[] cloth : clothes) {
            String type = cloth[1];
            clothesMap.put(type, clothesMap.getOrDefault(type, 0) + 1);
        }

        // 조합의 수 계산
        int answer = 1;
        for (int count : clothesMap.values()) {
            answer *= (count + 1); // 각 종류별로 옷을 입거나 안 입는 경우의 수
        }
        
        // 모두 안 입는 경우를 제외하고 반환
        return answer - 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[][] clothes1 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution.solution(clothes1)); // 5

        String[][] clothes2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        System.out.println(solution.solution(clothes2)); // 3
    }
}

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == student1[i % student1.length]) score[0]++;
            if (answers[i] == student2[i % student2.length]) score[1]++;
            if (answers[i] == student3[i % student3.length]) score[2]++;
        }

        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (score[i] == maxScore) {
                list.add(i + 1);
            }
        }
        //list를 스트림으로 변환 후, mapToInt메서드가 Integer요소를 int로 변환후, 스트림 배열로           변환
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] answers1 = {1, 2, 3, 4, 5};
        int[] result1 = sol.solution(answers1);
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] answers2 = {1, 3, 2, 4, 2};
        int[] result2 = sol.solution(answers2);
        for (int num : result2) {
            System.out.print(num + " ");
        }
    }
}
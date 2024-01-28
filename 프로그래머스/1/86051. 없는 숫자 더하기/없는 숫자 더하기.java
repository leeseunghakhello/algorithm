class Solution {
    public int solution(int[] numbers) {
        int sum = 45; 

        for (int number : numbers) {
            sum -= number; // 배열에 있는 숫자들을 빼줌
        }

        return sum;
    }
}

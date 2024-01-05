class Solution {
    public int[] solution(int n, int m) {
     int gcd = gcd(n, m);
        int lcm = (n * m) / gcd;
        return new int[]{gcd, lcm};
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] result1 = sol.solution(3, 12);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]");

        int[] result2 = sol.solution(2, 5);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]");
    }
}
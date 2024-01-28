class Solution {
    public int solution(int[][] dots) {
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if (k == i || k == j) continue;
                    for (int l = k + 1; l < 4; l++) {
                        if (l == i || l == j) continue;
                        if (parallel(dots[i], dots[j], dots[k], dots[l])) {
                            return 1;
                        }
                    }
                }
            }
        }
        return 0;
    }

    
    private boolean parallel(int[] dot1, int[] dot2, int[] dot3, int[] dot4) {
        int dx1 = dot2[0] - dot1[0];
        int dy1 = dot2[1] - dot1[1];
        int dx2 = dot4[0] - dot3[0];
        int dy2 = dot4[1] - dot3[1];
        return dx1 * dy2 == dx2 * dy1;//기울기 비교(실수 연산을 피하기 위해 교차 곱을 사용)
    }
}

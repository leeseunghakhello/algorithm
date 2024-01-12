class Solution {
    public String solution(String s, int n) {
    StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == ' ') {
                sb.append(ch);
                continue;
            }

            if (Character.isLowerCase(ch)) {
                ch = (char) ((ch - 'a' + n) % 26 + 'a');//알파벳 범위를 넘어가는 경우 처리
            } else if (Character.isUpperCase(ch)) {
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            }

            sb.append(ch);
        }

        return sb.toString();
    }
}
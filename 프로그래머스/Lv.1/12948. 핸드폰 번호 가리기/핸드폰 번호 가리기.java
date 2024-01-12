class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < phone_number.length() - 4; i++) {
            sb.append('*');
        }
        sb.append(phone_number.substring(phone_number.length() - 4));//뒷 4자리 substring메서드로 추출

        return sb.toString();
    }
}
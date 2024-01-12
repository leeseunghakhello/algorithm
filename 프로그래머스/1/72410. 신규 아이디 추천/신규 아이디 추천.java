class Solution {
    public String solution(String new_id) {
         String answer = new_id;

        // 1단계: 모든 대문자를 대응되는 소문자로 치환
        answer = answer.toLowerCase();

        // 2단계: 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
        answer = answer.replaceAll("[^-_.a-z0-9]", ""); //replaceAll(a,b)일때 a를 b로 대체해주는 메서드

        // 3단계: 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        answer = answer.replaceAll("[.]{2,}", ".");

        // 4단계: 마침표(.)가 처음이나 끝에 위치한다면 제거
        answer = answer.replaceAll("^[.]|[.]$", "");

        // 5단계: 빈 문자열이라면, new_id에 "a"를 대입
        if (answer.equals("")) {
            answer = "a";
        }

        // 6단계: 길이가 16자 이상이면, 처음 15개의 문자를 제외한 나머지 문자들을 모두 제거
        // 만약 제거 후 마침표(.)가 끝에 위치한다면 마침표(.) 문자를 제거
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$", "");
        }

        // 7단계: 길이가 2자 이하라면, 마지막 문자를 길이가 3이 될 때까지 반복해서 끝에 붙임
        while (answer.length() <= 2) {
            answer += answer.charAt(answer.length() - 1);
        }

        return answer;
    }
}
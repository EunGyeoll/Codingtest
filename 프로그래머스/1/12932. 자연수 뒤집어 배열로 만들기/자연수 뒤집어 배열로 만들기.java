class Solution {
    public int[] solution(long n) {

        String strN = Long.toString(n); // 숫자를 문자열로 변환
        int count = strN.length(); // 문자열 길이 (자릿수)

        int[] answer = new int[count]; // 자릿수만큼 배열 선언

        for (int i = 0; i < count; i++) {
            answer[i] = strN.charAt(count - 1 - i) - '0'; // 뒤집어서 저장
        }

        return answer; // 배열 출력
    }
}
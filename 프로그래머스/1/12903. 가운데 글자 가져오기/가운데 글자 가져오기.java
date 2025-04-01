class Solution {
    public String solution(String s) {
        int len = s.length();
        if (len % 2 == 0) {
            // 짝수일 때: 가운데 두 글자
            return s.substring(len / 2 - 1, len / 2 + 1);
        } else {
            // 홀수일 때: 가운데 한 글자
            return s.substring(len / 2, len / 2 + 1);
        }
    }
}

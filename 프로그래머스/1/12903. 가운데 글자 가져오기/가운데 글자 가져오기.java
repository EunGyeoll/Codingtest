class Solution { 
    public String solution(String s) {
        String answer = "";
        
        // 길이가 홀수일 때
        if(s.length() % 2 != 0) {
            answer = String.valueOf(s.charAt(s.length() / 2)); 
        }
        // 길이가 짝수일 때
        else {
            answer = s.charAt(s.length() / 2 - 1) + "" + s.charAt(s.length() / 2);  
        }
        
        return answer;
    }
}

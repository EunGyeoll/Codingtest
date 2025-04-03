class Solution { 
    public String solution(String phone_number) {
        String answer = "";
        
        String star = "";
        for (int i = 0; i < phone_number.length() - 4; i++) {
            star += "*";
        }

        // 뒷 4자리
        String lastFour = phone_number.substring(phone_number.length() - 4);

        // 별 + 뒷 4자리
        answer = star + lastFour;

        return answer;
    }
}

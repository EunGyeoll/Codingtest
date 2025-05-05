class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;
        
        String[] sArr = s.split("");
        
        for(int i=0; i<sArr.length; i++) {
            if(sArr[i].equals(" ")) {
                idx = 0;
            } else {
                if(idx % 2 == 0) {
                    sArr[i] = sArr[i].toUpperCase();
                } else {
                    sArr[i] = sArr[i].toLowerCase();
                }
                idx++;
            }  
            
        answer += sArr[i];
            
        }
        return answer;
    }
}
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int pCount = 0;
        int yCount = 0;
        
        for(int i = 0; i<s.length(); i++) {
            char charS = Character.toLowerCase(s.charAt(i));
            
            if(charS=='p'){
                pCount++;
            } else if(charS == 'y'){
                yCount++;
            }
            
            // if(s.charAt(i) == 'p'){
            //     pCount++;
            // } else if (s.charAt(i) == 'y'){
            //     yCount++;
            // }
        }
        
        if(pCount==yCount){
            answer = true;
        } else{
            answer = false;
        }
        
        
        return answer;
    }
}
import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
    
        int answer = 0;
            
        Arrays.sort(sides);
        
        if(sides[2]<sides[0]+sides[1]){
            answer = 1;
        } else{
            answer = 2;
        }
//         int max =sides[0];

//         for(int i = 0; i<3; i++) {
//             if(sides[i]>max){
//                 max=sides[i]
//             }
//         }
        ;
        return answer;
    }
}
class Solution {
    public int[] solution(int[] num_list) {
        // Collections.reverse 는 List<Integer> 타입에서만 동작함.

        int[] answer = new int[num_list.length];
        
        for(int i=0; i<num_list.length; i++) {
            // answer[0] = num_list[4] , answer[1] = num_list[3]
            
            answer[i] = num_list[num_list.length -i -1];
            
        }
        
        return answer;
    }
}
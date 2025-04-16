class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        
        int row = arr1.length;	// 행의 개수 (바깥 배열의 길이)
        int col = arr1[0].length;	// 한 행 안에 있는 값 개수 (0번째 행의 열 갯수)
        
        int[][] answer = new int[row][col];
        
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        return answer;
    }
}
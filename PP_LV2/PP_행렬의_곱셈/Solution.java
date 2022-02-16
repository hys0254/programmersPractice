package PP_LV2.PP_행렬의_곱셈;

public class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        int n = arr1.length;
        int m = arr2[0].length;
        answer=new int[n][m];
        for(int i =0; i<n;i++){
            for(int j=0;j<m;j++){
                answer[i][j]=arr1[i][j]*arr2[j][i];
            }
        }
        return answer;
    }
}

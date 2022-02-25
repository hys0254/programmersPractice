package PP_LV2.PP_땅따먹기;

import java.util.Arrays;

class Solution {
    int solution(int[][] land) {
        int answer = 0;
        for(int i=1; i<land.length;i++){
            for(int j=0;j<4;j++){
                int temp=Integer.MIN_VALUE;
                int tempPos=-1;
                for(int k=0; k<4;k++){
                    if(k==j) continue;
                    if(land[i-1][k]>temp){
                        temp=land[i-1][k];
                        tempPos=k;
                    }
                }
                land[i][j]+=land[i-1][tempPos];
            }
        }
        int temp = Integer.MIN_VALUE;
        for(int i=0;i<4;i++){
            if(land[land.length-1][i]>temp){
                temp=land[land.length-1][i];
            }
        }
        answer=temp;
        return answer;
    }
}
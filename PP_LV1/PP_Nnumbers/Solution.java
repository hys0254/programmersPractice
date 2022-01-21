package PP_LV1.PP_Nnumbers;
import java.util.Scanner;



class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i=0;i<n;i++){
            answer[i]=(long)x+(long)i*(long)x;
        }
        return answer;
    }
}
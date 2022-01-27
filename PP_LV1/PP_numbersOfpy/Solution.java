package PP_LV1.PP_numbersOfpy;

import java.util.Collection;

public class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCnt=0, yCnt =0;

        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i) =='p'){
                pCnt++;
            }else if(s.charAt(i)=='y'){
                yCnt++;
            }
        }

        return answer;
    }
}

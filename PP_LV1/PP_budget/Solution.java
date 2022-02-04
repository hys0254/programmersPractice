package PP_LV1.PP_budget;

import java.util.*;

public class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        ArrayList<Integer> requestArr = new ArrayList<>();
        for (int i = 0; i < d.length; i++) {
            requestArr.add(d[i]);
        }
        Collections.sort(requestArr);
       
        for(int i=0; i<requestArr.size();i++){
            budget=budget-requestArr.get(i);
            if(budget>=0){
                answer=i;
            }
        }
        return answer;
    }
}

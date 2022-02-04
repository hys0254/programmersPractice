package PP_LV1.PP_pickTwoNumAndPlus;

import java.util.HashSet;
import java.util.*;

public class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> intSet = new HashSet<Integer>();
        
        for(int i=0;i<numbers.length;i++){
            for(int j=numbers.length-i;j>i;j--){
                intSet.add(numbers[i]+numbers[j]);
            }
        }
       ArrayList<Integer> intArr= new ArrayList<>(intSet);
       Collections.sort(intArr);
       int[] answer= new int[intArr.size()];
       for(int i=0; i<intArr.size();i++){
        answer[i]=intArr.get(i);
       }
        return answer;
    }
}

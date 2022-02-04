package PP_LV1.PP_pocketmon;

import java.util.*;
import java.util.stream.Collectors;



public class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashSet<Integer> var = new HashSet<Integer>(Arrays.stream(nums).boxed().collect(Collectors.toSet()));
        if(var.size()>=nums.length/2){
            answer=nums.length/2;
        }else{
            answer=var.size();
        }
        return answer;
    }
}

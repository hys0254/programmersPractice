package PP_LV1.PP_소수만들기;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        boolean[] isPrime = new boolean[3000];
        Arrays.fill(isPrime, false);
        ArrayList<Integer> intArr =new ArrayList<>(); 
        for(int i=0; i<nums.length-2;i++){
            for(int j=i+1; j<nums.length-1;j++){
                for(int k=j+1; k<nums.length;k++){
                    intArr.add(nums[i]+nums[j]+nums[k]);
                }
            }
        }

        for(Integer num : intArr){
            answer++;
            for(int i=2;i<Math.sqrt(num);i++){
                if(num%i==0){
                    answer--;
                    break;
                }
            }
        }

        
        

        return answer;
    }

    // int pickThree (int[] nums, int pos,int cnt ){
    //     if(cnt==1||pos>=nums.length-2){

    //     }
    //     return pickThree(nums, pos+1,cnt+1) +nums[pos];
    // }
}

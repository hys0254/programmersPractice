package PP_LV2.PP_구명보트;
import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int start =0;
        int end = people.length-1;
        while(start<=end){
           
            if(people[start]+people[end]>limit){
                
                answer++;
                end--;
            } else if(people[start]+people[end]<=limit){
                
                answer++;
                start++;
                end--;
            } else{
                answer++;
                start++;
                break;
            }
        }
        return answer;
    }
}
package PP_LV2.PP_점프와_순간이동;

import java.util.*;

public class Solution {
    
    public int solution(int n) {
        int ans = 0;
        while(n!=0){
            if(n%2==1){
                n=n-1;
                ans++;
            } 
            n/=2;            
        }
        

        return ans;
    }
    
}
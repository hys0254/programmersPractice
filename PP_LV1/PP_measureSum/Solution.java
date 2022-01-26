package PP_LV1.PP_measureSum;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int sqrt=(int)Math.sqrt(n);
       
        for(int i=1;i<=sqrt;i++){
            if(n%i==0){
              if(i==n/i){
                  answer+=i;
                  continue;
                }
                 answer+=(i+n/i); 
              }  
        }
        return answer;
    }
}

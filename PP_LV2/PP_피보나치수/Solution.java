package PP_LV2.PP_피보나치수;



public class Solution {
    public int solution(int n) {
        int answer = 0;
        int a =0;
        int b =1;
        for(int i=2; i<=n ; i++){
            int c = (a+b)%1234567;
            a=b;
            b=c;
            answer=c;
        }
        return answer;
    }
    
}

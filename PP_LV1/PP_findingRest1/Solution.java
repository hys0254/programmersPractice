package PP_LV1.PP_findingRest1;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=2; i<=Math.sqrt(n-1);i++){
            if((n-1)%i==0){
                answer=i;
                return answer;
            }
        }
        answer=n-1;
        return answer;
    }
}

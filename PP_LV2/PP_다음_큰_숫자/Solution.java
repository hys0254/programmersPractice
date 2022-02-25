package PP_LV2.PP_다음_큰_숫자;

class Solution {
    public int solution(int n) {
        int answer = n+1;
        int nCnt=0;
        
        while(n!=0){
            if(n%2==1) nCnt++;
            n/=2;
        }
        while(true){
            int temp =answer;
            int tempCnt=0;
            while(temp!=0){
                if(temp%2==1) tempCnt++;
                temp/=2;
            }
            if(tempCnt==nCnt){
                return answer;
            }
            answer++;
        }
        
    }
}
    
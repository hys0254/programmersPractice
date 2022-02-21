package PP_LV2.PP_k진수에서_소수_개수_구하기;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String temp ="";
        while(n!=0){
            temp+=n%k;
            n/=k;
        }
        StringBuffer sb = new StringBuffer(temp);
        temp=sb.reverse().toString();
        String[] tempArr =temp.split("0");
        for(String s : tempArr){
            
            if(isPrime(Integer.parseInt(s))){
                answer++;
            }
        }
        return answer;
    }
    public boolean isPrime(int n ){
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}

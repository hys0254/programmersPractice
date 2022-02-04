package PP_LV1.PP_findingPrimeNum;



public class Solution {
    static public int solution(int n) {
        int answer = 0;
        boolean[] primeArr= new boolean[n+1];
        primeArr[0]=true;
        primeArr[1]=true;
        
        for(int i=2;i<=Math.sqrt(n);i++){
            if(primeArr[i]){
                continue;
            }
            for(int j=i*i;j<primeArr.length;j=j+i){
                primeArr[j]=true;
            }
        }
        for(int i =0; i<primeArr.length;i++){
            if(!primeArr[i]) answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
       
    }
}

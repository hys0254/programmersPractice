package PP_LV1.PP_minMax;

public class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min, max;
        if(n>m){
            min=Euclidean(n, m);
        }else{
            min=Euclidean(m, n);
        }
        max =n*m/min;
        answer[0]=min;
        answer[1]=max;
        return answer;
    }
    static public int Euclidean(int a, int b){
        int temp = a%b;
        if(temp==0){
            return b;
        }else{
            return Euclidean(b, temp);
        }
    }
}

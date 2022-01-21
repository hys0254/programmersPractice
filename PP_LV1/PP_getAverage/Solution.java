package PP_LV1.PP_getAverage;

public class Solution {
    public double solution(int[] arr) {

        double answer ;
        int total=0;
        for(int i=0; i<arr.length;i++){
            total+=arr[i];
        }
        answer=(double)total/(double)arr.length;
        return answer;
    }
}

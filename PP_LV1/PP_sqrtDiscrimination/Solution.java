package PP_LV1.PP_sqrtDiscrimination;
class Solution {
    // public double solution(double n) {
    //     double answer;
    //     if(Math.pow(Math.sqrt(n),2)-n ==0d){
        
    //         answer= Math.pow(Math.sqrt(n)+1, 2);
    //     }else{
    //         answer=-1;
    //     }
    //     return answer;
    // }
   
    public double solution(double n) {
        double answer;
        Double sqrt = Math.sqrt(n);
        if(sqrt==sqrt.intValue()){
        
            answer= Math.pow(Math.sqrt(n)+1, 2);
        }else{
            answer=-1;
        }
        return answer;
    }
   
}
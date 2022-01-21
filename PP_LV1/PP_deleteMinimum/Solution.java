package PP_LV1.PP_deleteMinimum;

public class Solution {
    public int[] solution(int[] arr) {

        if(arr.length==1){
            int[] answer = new int[1];
            answer[0]=-1;
            return answer;
        }else{
            int[] answer =new int[arr.length-1];
            int min = arr[0];
            int targetNum =0;
            for(int i =1; i<arr.length;i++){
                if(arr[i]<min){
                    min = arr[i];
                    targetNum=i;
                }
            }
           
            int j=0;
            for(int i=0;i<arr.length;i++){
                if(i==targetNum){
                    continue;
                }
                answer[j]=arr[i];
               
                j++;

            }
           
            return answer;
            
        }
        
    }
}

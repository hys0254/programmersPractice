package PP_LV1.PP_iHateSameNum;
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> intArr = new ArrayList<>();
        int exNum=arr[0];
        intArr.add(arr[0]);
        for(int i =1; i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                intArr.add(arr[i]);
            }
            //exNum=arr[i];
        }
        answer=new int[intArr.size()];
        for(int i=0; i<intArr.size();i++){
            answer[i]=intArr.get(i);
        }
        

        return answer;
    
    }
}
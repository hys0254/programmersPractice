package PP_LV1.PP_deleteMinimum(re);

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
//https://www.daleseo.com/java-min-max/

// vector<int> solution(vector<int> arr) {
//     vector<int> answer = arr;
    
//     int nMin = *min_element(arr.begin(), arr.end());
//     int pos = find(arr.begin(), arr.end(), nMin) - arr.begin();
    
//     arr.erase(arr.begin() + pos);
//     if(arr.size() == 0) arr.push_back(-1);
//     return arr;
// }
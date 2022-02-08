package PP_LV1.PP_신고_결과_받기;
import java.util.*;
public class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, ArrayList<String>> reportMap = new HashMap<>();
        HashMap<String, Integer> resultMap =new HashMap<>();

        for(String s: id_list){
            resultMap.put(s, 0);
        }
        //0 신고자 1 신고당한사람
        for(String s : report){
            String[] reportLog= s.split(" ");
            ArrayList<String> reportingList=
            reportMap.getOrDefault(reportLog[1], new ArrayList<String>());
            
            if(reportingList.contains(reportLog[0])){
                continue;
            }
            
            reportingList.add(reportLog[0]);
            reportMap.put(reportLog[1],reportingList);
            
        }
        
        for(String s: reportMap.keySet()){
            ArrayList<String> reportingList=
            reportMap.getOrDefault(s, new ArrayList<String>());
            if(reportingList.size()>=k){
                for(String s1 : reportingList){
                    resultMap.put(s1, resultMap.get(s1)+1);
                }
            }
        }
        for(int i =0; i<id_list.length;i++){
            answer[i]=resultMap.get(id_list[i]);
        }
        
        return answer;
    }
}

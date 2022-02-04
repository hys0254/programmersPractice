package PP_LV1.PP_noFinishRunner;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> player = new HashMap<>();
        for(String str : participant){
        player.put(str, player.getOrDefault(str, 0)+1);
        }
        for(String str : completion){
           player.put(str,player.get(str)-1);
            
        }
        for(String key : player.keySet()){
            if(player.get(key)!=0){
                answer =key;
            }
        }
        return answer;
    }
}

package PP_LV2.PP_1차_캐시;

import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        // ArrayList<String> cache = new ArrayList<>();
        Queue<String> cache = new LinkedList<>();
        for (String str : cities) {
            str = str.toLowerCase();
            if(cacheSize==0){
                answer+=5;
            }else if (cache.peek() == null || (cache.size() < cacheSize&&!cache.contains(str))) {
                cache.add(str);
                answer += 5;
                
            } else {
                if (cache.contains(str)) {
                    
                    cache.remove(str);
                     
                    cache.add(str);
                      
                    answer += 1;
                    
                } else {
                    cache.poll();
                    cache.add(str);
                    answer += 5;
                    
                }
            }
        }
        return answer;
    }
}
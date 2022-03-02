package PP_LV2.PP_방금_그곡;
import java.util.*;
class Solution {
    static int longestPlayTime = -1;

    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        ArrayList<String> heardSong = new ArrayList<>();
         String[] noteList = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
        ArrayList<String> noteListAL = new ArrayList<>(Arrays.asList(noteList));
        for(int j=0; j<m.length();j++){
                String s ="";
                s+= m.charAt(j);
                if(j+1<m.length()&&m.charAt(j+1)=='#'){
                    s+=m.charAt((j+1));
                    j++;
                }
                
                heardSong.add(s);
                System.out.print(s+" ");
            }
            System.out.println();
        for (int i = 0; i < musicinfos.length; i++) {
            
            String[] temp = musicinfos[i].split(",");
            int totalPlayTime = getTime(temp), playTime = temp[3].length(),constTotalPlayTime=totalPlayTime;;
            String codes= temp[3], title = temp[2];
            System.out.println(title);
            ArrayList<String> playedSong = new ArrayList<>();
            System.out.println(totalPlayTime);
            
           for(int j=0; j<totalPlayTime;j++){
                String s ="";
                s+= (codes.charAt(j%playTime)+"");
                if((j+1)%playTime<=totalPlayTime&&codes.charAt((j+1)%playTime)=='#'){
                    s+=codes.charAt((j+1)%playTime);
                    j++;
                    totalPlayTime+=1;
                }
               
                playedSong.add(s);
               System.out.print(s+" ");
            }
            System.out.println();
           if(longestPlayTime>=constTotalPlayTime) continue;
            for(int j=0;j<playedSong.size();j++){
                if(playedSong.get(j).equals(heardSong.get(0))){
                    int tempindex=j;
                    boolean check = true;
                    for(String s : heardSong){
                        if(j<playedSong.size()&&s.equals(playedSong.get(j))){
                            j++;
                        }else{
                            check=false;
                            j=tempindex;
                            break;
                        }
                    }
                    if(check){
                        longestPlayTime=constTotalPlayTime;
                        answer=title;
                    }
                    
                }    
            }
       System.out.println("logest : "+longestPlayTime);
        }

        return answer;
    }

   public int getTime(String[] temp) {
        String[] timeA = temp[0].split(":");
        String[] timeB = temp[1].split(":");
        return (Integer.parseInt(timeB[0])*60+Integer.parseInt(timeB[1]))
        -(Integer.parseInt(timeA[0])*60+Integer.parseInt(timeA[1]));
    }
}
package PP_LV2.PP_방문길이;
import java.util.*;
class Solution {
    static int travelCnt =0;
    static boolean[][] upDown =new boolean[10][11];
    static boolean[][] leftRight =new boolean[11][10];
    public int solution(String dirs) {
        
        int[] startPos ={0,0};
        for(String s:dirs.split("")){
            System.out.print("start Pos ");
            System.out.print("X : "+startPos[0]);
            System.out.print(" Y : "+startPos[1]);
            System.out.println();
            if(s.equals("U")){
                up(startPos);
            }else if(s.equals("D")){
                down(startPos);
            }else if(s.equals("L")){
                left(startPos);
            }else if(s.equals("R")){
                right(startPos);
            }
            System.out.print("end Pos");
            System.out.print(" X : "+startPos[0]);
            System.out.print(" Y : "+startPos[1]);
            System.out.println();
            System.out.println(travelCnt);
            System.out.println();
            
        }
        return travelCnt;
    }
    public void up(int[] locate){
        if(locate[1]+1>5) return;
        if(!upDown[locate[1]+5][locate[0]+5]){
            travelCnt++;
            upDown[locate[1]+5][locate[0]+5]=true;
        } 
        locate[1]+=1;
        
    }
    public void down(int[] locate){
        if(locate[1]-1<-5) return;
        if(!upDown[locate[1]+4][locate[0]+5]){
            travelCnt++;
            upDown[locate[1]+4][locate[0]+5]=true;
        } 
        locate[1]-=1;
        
    }
    public void left(int[] locate){
        if(locate[0]-1<-5) return;
        if(!leftRight[locate[1]+5][locate[0]+4]){
            travelCnt++;
            leftRight[locate[1]+5][locate[0]+4]=true;
        }
        locate[0]-=1;
        
    }
    public void right(int[] locate){
        if(locate[0]+1>5) return;
        if(!leftRight[locate[1]+5][locate[0]+5]){
            travelCnt++;
            leftRight[locate[1]+5][locate[0]+5]=true;
        }
        locate[0]+=1;
        
    }
}
package PP_LV2.PP_주차요금계산;

//입차 == -(시각*60+분)
//출차 == +(시각*60+분)
//시간 기록이 음수 == 아직 출차 안함
//시간 기록이 양수 == 출차 함
import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int[] answer;
        HashMap<String,Integer> carTimeMap = new HashMap<>();
        for(String s : records){
            recordsAnalyze(s, carTimeMap);
        }
        parkingLotEnd(carTimeMap);
        calculateFee(carTimeMap,fees);
        TreeSet<String> sortedCarNumSet = new TreeSet<>();
        
        for(String s : carTimeMap.keySet()){
            
            sortedCarNumSet.add(s);
        }
        ArrayList<String> sortedCarNumArr= new ArrayList<>(sortedCarNumSet);
       answer=new int[sortedCarNumSet.size()];
        for(int i =0; i<sortedCarNumArr.size();i++){
            
            answer[i]=carTimeMap.get(sortedCarNumArr.get(i));
        }
        return answer;
    }
    
    public void recordsAnalyze(String record, HashMap<String,Integer> carTimeMap ){
        String[] temp = record.split(" ");
        String[] timeTemp = temp[0].split(":");
        int time=0;
        if(temp[2].equals("IN")){
            time-=(Integer.parseInt(timeTemp[0])*60+Integer.parseInt(timeTemp[1]));
        }else if(temp[2].equals("OUT")){
            time+=(Integer.parseInt(timeTemp[0])*60+Integer.parseInt(timeTemp[1]));
        }
        carTimeMap.put(temp[1], carTimeMap.getOrDefault(temp[1],0)+time);
        
        return;
    }
    
    public void parkingLotEnd(HashMap<String,Integer> carTimeMap){
        Set<String> carNum=carTimeMap.keySet();
        for(String s : carNum){
            int time = carTimeMap.get(s);
            if(time<=0){
                carTimeMap.put(s,carTimeMap.get(s)+(23*60+59));
            }
            
        }
    }

    public void calculateFee(HashMap<String,Integer> carTimeMap,int[] fees){
        Set<String> carNum = carTimeMap.keySet();
        for(String s: carNum){
            int time = carTimeMap.get(s);
            if(time<=fees[0]){
                carTimeMap.put(s, fees[1]);
            }else if(time>fees[0]){
                int feeTemp=fees[1];
                time-=fees[0];
                feeTemp+= ((int)Math.ceil((double)time/fees[2]))*fees[3];
                carTimeMap.put(s, feeTemp);
            }
        }
        return;
    }

}
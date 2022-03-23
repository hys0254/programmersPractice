package PP_LV2.PP_1차_프렌즈4블록;

class Solution {
    static int height;
    static int width;
    static int[][] checkBoard;
    static String[] b;
    static int ans;
    public int solution(int m, int n, String[] board) {
        ans=0;
        height =m;
        width =n;
        b=board;
        checkBoard=new int[m][n];
        while(checkingBoard()){
            for(String s : board){
                System.out.println(s);
            }
            
            correctBoard();
            
        }
        
        return ans;
    }
    Boolean checkingBoard(){
        Boolean checkFlag = false;
        for(int i=0;i<height-1;i++){
            for(int j=0;j<width-1;j++){
                if(b[i].charAt(j)==' '){
                    checkBoard[i][j]=1;
                    continue;
                }
                if(b[i].charAt(j)==b[i].charAt(j+1)&&
                b[i+1].charAt(j)==b[i].charAt(j+1)&&
                b[i+1].charAt(j+1)==b[i+1].charAt(j)){
                    checkFlag =true;
                    checkBoard[i][j]= -1 ;
                    checkBoard[i][j+1]=-1;
                    checkBoard[i+1][j]=-1;
                    checkBoard[i+1][j+1]=-1;
                }
            }
        }

        return checkFlag;
    }
    void correctBoard(){
        for(int i=0;i<height;i++){
            StringBuilder sb =new StringBuilder();
            for(int j=0;j<width;j++){
                if(checkBoard[i][j]==-1){
                    sb.append(" ");
                    checkBoard[i][j]=1;
                    ans++;
                    if(i>0){
                        checkBoard[i][j]=checkBoard[i-1][j];
                        checkBoard[i-1][j]=1;
                        sb.deleteCharAt(j);
                        sb.append(b[i-1].charAt(j));
                        b[i]
                    }
                    
                }else if (checkBoard[i][j]==0){
                    sb.append(b[i].charAt(j));
                }else{
                    sb.append(" ");
                }
            }
            b[i]=sb.toString();
        }
        

    }
}
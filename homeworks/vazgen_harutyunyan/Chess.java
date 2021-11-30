public class Chess {
    public static void main(String[] args){
        char[][] chessDesk=new char[9][9];
        char[] numbers={'1','2','3','4','5','6','7','8',' '};
        char[] letters={'A','B','C','D','E','F','G','H',' '};


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(j!=8 && i!=8){
                    if((i+j)%2==0){
                        chessDesk[i][j]='*';
                    }
                    else {
                        chessDesk[i][j]='#';
                    }
                }
                if(j==8){
                    chessDesk[i][j]=numbers[i];
                }
                if(i==8){
                    chessDesk[i][j]=letters[j];
                }

            }

        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(chessDesk[i][j]);
            }
            System.out.print("\n");
        }



    }
}

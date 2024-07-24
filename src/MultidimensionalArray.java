public class MultidimensionalArray {
    public static void main(String[] args){
        char [][] multi=new char[3][3];
        char c='x';
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                multi[i][j]=c;
                if((i+j)%2==0)
                c='o';
                else c='x';
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                 System.out.print(multi[i][j]);
            }
            System.out.println();
        }

    }
}

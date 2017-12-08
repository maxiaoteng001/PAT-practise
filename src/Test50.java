import java.util.Arrays;
import java.util.Scanner;

public class Test50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] array = new int[N];
        for(int i=0;i<N;i++){
            array[i] = input.nextInt();
        }
        int m = (int) Math.sqrt(N);
        int n=0;
        for(;m>0;m--){
            if(N%m == 0){
                n = N/m;
                break;
            }
        }
        if(m<n){
            int temp = n;
            n = m;
            m = temp;
        }
        int o = m, p = n;
        int[][] dArray = new int[m][n];
        int k=array.length-1;
        int x=0,y=0;
        Arrays.sort(array);
        while( n>=2 ) {
            for (int i = 0, j = 0; j < n-1; j++) {
                dArray[i+x][j+y] = array[k--];
            }

            for (int i = 0, j = n -1; i < m-1; i++) {
                dArray[i+x][j-y] = array[k--];
            }

            for (int i = m-1, j = n -1; j > 0; j--) {
                dArray[i-x][j-y] = array[k--];
            }

            for(int i=m-1,j=0;i>0;i--){
                dArray[i-x][j+y] = array[k--];
            }
            x++;
            y++;
            m = m-2;
            n = n-2;
        }
        if(n==1){
            for(int i=0;i<m;i++)
                dArray[x+i][y] = array[k--];
        }

        for(int i=0;i<o;i++){
            for(int j=0;j<p;j++){
                System.out.print(dArray[i][j]);
                if(j!=p-1)
                    System.out.print(" ");
            }
            if(i!=o-1)
                System.out.print("\n");
        }
    }
}

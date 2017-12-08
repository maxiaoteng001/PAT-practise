import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test68 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        String[] as = s.split("\\s+");
        int n = Integer.parseInt(as[0]);
        int m = Integer.parseInt(as[1]);
        int yu = Integer.parseInt(as[2]);
        long[][] array = new long[m][n];
        for(int i=0;i<m;i++){
            s = input.readLine();
            as = s.split("\\s+");
            for(int j=0;j<n;j++){
                array[i][j] = Long.parseLong(as[j]);
            }
        }
        int x=0, y=0;
        long temp =0;
        int count =0;
        for(int i=1;i<m-1;i++){
            for(int j=1;j<n-1;j++){
                if(count>1)
                    break;
                temp = array[i][j];
                if(temp-array[i-1][j-1]>yu &&
                        temp-array[i-1][j]>yu &&
                        temp-array[i-1][j+1]>yu &&
                        temp-array[i+1][j-1]>yu &&
                        temp-array[i+1][j]>yu &&
                        temp-array[i+1][j+1]>yu &&
                        temp-array[i][j-1]>yu &&
                        temp-array[i][j+1]>yu){
                    x = j;
                    y = i;
                    count++;
                }else if(array[i-1][j-1]-temp>yu &&
                        array[i-1][j]-temp>yu &&
                        array[i-1][j+1]-temp>yu &&
                        array[i+1][j-1]-temp>yu &&
                        array[i+1][j]-temp>yu &&
                        array[i+1][j+1]-temp>yu &&
                        array[i][j-1]-temp>yu &&
                        array[i][j+1]-temp>yu){
                    x = j;
                    y = i;
                    count++;
                }
            }
        }
        if(count ==0)
            System.out.print("Not Exist");
        else if(count ==1){
            System.out.printf("(%d, %d): %d",x+1, y+1, array[y][x]);
        }else
            System.out.print("Not Unique");
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test19 {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(input.readLine());
        int second =0;
        int[] array = new int[4];
        if(first%1111 ==0){
            System.out.printf("%04d - %04d = 0000",first,first);
        }else if(first == 6174){
            System.out.print("7641 - 1467 = 6174");
        }
        else {
            while(first!=6174){
                for (int i = 0; i < 4; i++) {
                    array[i] = first % 10;
                    first = first / 10;
                }
                Arrays.sort(array);
                for(int i=0;i<4;i++){
                    first += array[i]*Math.pow(10,i);
                    second +=array[i]* Math.pow(10,3-i);
                }
                System.out.printf("%04d - %04d = %04d\n",first,second,first-second);
                first = first-second;
                second=0;
            }
        }

    }

}

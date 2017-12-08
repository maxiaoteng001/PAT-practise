import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test49 {
    /*使用Scanner发现3,4超时，试一下BufferedReader*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        double result = 0;
        for(int i=0;i<n;i++){
            if(i==0 || (i==n-1)){
                result += input.nextDouble()*n;
            }else
                result += input.nextDouble()*2*(n-1);
        }
        System.out.printf("%.2f",result);
    }
}

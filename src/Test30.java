import java.util.Arrays;
import java.util.Scanner;

public class Test30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p = input.nextInt();
        int result =0;
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = input.nextInt();
        }
        Arrays.sort(array);
        for(int i=0;i<n;i++){
            for(int j=i+result;j<n;j++){
                if(array[j]<=array[i]*p)
                    result=j-i+1;
            }
        }
        System.out.print(result);
    }
}

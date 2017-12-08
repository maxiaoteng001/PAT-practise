import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test60 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        int n = Integer.parseInt(s);
        String[] as = input.readLine().split(" ");
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = Integer.parseInt(as[i]);
        }
        Arrays.sort(array);
        int k =n-1;
        while(k>=0 && array[k]>n-k){
            k--;
        }
        System.out.print(array[k]);
    }
}

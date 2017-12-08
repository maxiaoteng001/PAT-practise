import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test70 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        int n = Integer.parseInt(s);
        s = input.readLine();
        String[] as = s.split(" ");
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = Integer.parseInt(as[i]);
        }
        Arrays.sort(array);
        double temp = array[0];
        for(int i=1;i<n;i++){
            temp = (temp+array[i])/2;
        }
        System.out.printf("%d",(int)temp);
    }

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test63 {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        int n = Integer.parseInt(s);
        double result =0.0;
        double temp;
        for(int i=0;i<n;i++){
            s = input.readLine();
            String[] as = s.split(" ");
            temp = Math.sqrt(Math.pow(Integer.parseInt(as[0]),2)+Math.pow(Integer.parseInt(as[1]),2));
            if(result<temp)
                result = temp;
        }
        System.out.printf("%.2f",result);
    }
}


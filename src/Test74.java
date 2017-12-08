import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test74{
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        String s1 = input.readLine();
        String s2 = input.readLine();
        String result = "";
        int sum =0;
        int jinwei=0;
        int d =0;
        if(s1.length()<s.length()){
            int t =s.length()-s1.length();
            for(int i=0;i<t;i++){
                s1 = '0' +s1;
            }
        }
        if(s2.length()<s.length()){
            int t =s.length()-s2.length();
            for(int i=0;i<t;i++){
                s2 = '0' +s2;
            }
        }
        for(int i=s.length()-1;i>=0;i--){
            d = s.charAt(i)-'0';
            if(d==0)
                d = 10;
            sum = s1.charAt(i)+s2.charAt(i) - 2*'0' +jinwei;
            jinwei = sum/d;
            result = (sum%d)+result;
        }
        if(jinwei!=0)
            result = jinwei+result;
        while(result.length()>0){
            if(result.charAt(0)=='0'){
                result = result.substring(1);
            }else
                break;
        }
        System.out.print(result);
    }
}

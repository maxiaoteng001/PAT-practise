import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test17 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(
                new InputStreamReader(System.in));

        String s = input.readLine();
        String[] as = s.split(" ");
        s = as[0];
        int dividend = Integer.parseInt(as[1]);
        int reminder = 0;
        int divisor =0;
        for(int i=0;i<s.length();i++){
            divisor = ((s.charAt(i))-'0')+reminder*10;
            if(divisor>=dividend){
                System.out.print(divisor/dividend);
                reminder = divisor%dividend;
            }else if(i!=s.length()-1){
                if(i!=0)
                    System.out.print(0);
                i++;
                divisor = divisor*10+ (s.charAt(i)-'0');
                System.out.print(divisor/dividend);
                reminder = divisor%dividend;
            }else if(i==s.length()-1){
                reminder = divisor;
                System.out.print(0);
            }
        }
        System.out.print(" "+reminder);
    }
}

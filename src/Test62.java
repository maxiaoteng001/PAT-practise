import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test62 {
    public static int gcd(int a, int b){
        return b==0? a : gcd(b,a%b);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        s = s.replace("/"," ");
        String[] as = s.split(" ");
        int n1 = Integer.parseInt(as[0]);
        int m1 = Integer.parseInt(as[1]);
        int n2 = Integer.parseInt(as[2]);
        int m2 = Integer.parseInt(as[3]);
        int k = Integer.parseInt(as[4]);
        List<Integer> list = new ArrayList<>();
        int t =0;
        if(n1*m2>n2*m1){
            t = n1;
            n1 = n2;
            n2 = t;
            t = m1;
            m1= m2;
            m2 = t;
        }

        t = n1*k/m1+1;
        while(t*m2<k*n2){
            if(gcd(t,k)==1){
                list.add(t);
            }
            t++;
        }

        for(int i=0;i<list.size();i++){
            System.out.printf("%d/%d",list.get(i),k);
            if(i!=list.size()-1)
                System.out.print(" ");
        }
    }
}

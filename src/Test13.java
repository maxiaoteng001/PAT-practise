import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test13 {
    public static void main(String[] args){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int m=0,n=0;
        try {
            String s = input.readLine();
            String[] sa = s.split(" ");
            m = Integer.parseInt(sa[0]);
            n = Integer.parseInt(sa[1]);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int primeCount=0;
        int index=0;
        for(int i=2;;i=i+1){
            if(isPrime(i)) {
                primeCount++;
                if (primeCount >= m && primeCount < n) {
                    System.out.print(i);
                    index++;
                    if (index < 10) {
                        System.out.print(" ");
                    }else{
                        index=0;
                        System.out.print("\n");
                    }
                }
                else if(primeCount == n)
                    System.out.print(i);
                else if(primeCount>n)
                    break;
            }
        }
    }

    public static boolean isPrime(int k){
        boolean result = true;
        if(k==2)
            result = true;
        else if(k%2==0)
            result =false;
        else
            for(int i=2;i<=Math.sqrt(k);i++){
                if(k%i ==0){
                    result = false;
                    break;
                }
            }
        return result;
    }
}

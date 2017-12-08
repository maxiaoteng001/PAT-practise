import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
public class Test59 {
    public static boolean isPrime(int k){
        if(k==1)
            return false;
        else if (k==2)
            return true;
        else if (k%2==0)
            return false;
        else if(k==3)
            return true;
        else if(k%3==0)
            return false;
        else{
            for(int i=3;i<Math.sqrt(k);i++){
                if(k%i==0)
                    return false;
            }
            return true;
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s= input.readLine();
        int n = Integer.parseInt(s);
        Map<String, Integer> map= new HashMap<>();
        String temp;
        for(int i=1;i<=n;i++){
            map.put(input.readLine(),i);
        }
        s = input.readLine();
        n = Integer.parseInt(s);
        for(int i=0;i<n;i++){
            temp = input.readLine();
            if(map.containsKey(temp)){
                if(map.get(temp)==-1){
                    System.out.printf("%s: Checked",temp);
                } else if(map.get(temp)==1){
                    System.out.printf("%s: Mystery Award",temp);
                    map.put(temp,-1);
                } else if(isPrime(map.get(temp))){
                    System.out.printf("%s: Minion",temp);
                    map.put(temp,-1);
                } else if(!isPrime(map.get(temp))){
                    System.out.printf("%s: Chocolate",temp);
                    map.put(temp,-1);
                }

            }else
                System.out.printf("%s: Are you kidding?",temp);
            if(i!=n-1){
                System.out.println();
            }
        }
    }
}

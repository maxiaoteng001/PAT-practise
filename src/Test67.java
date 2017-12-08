import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test67 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        String[] as = s.split(" ");
        String passWord = as[0];
        int n = Integer.parseInt(as[1]);
        int count =0;
        boolean pass = false;
        do {
            s = input.readLine();
            if(s.equals("#")){
                break;
            }else if(s.equals(passWord)) {
                pass = true;
                break;
            }else
                System.out.printf("Wrong password: %s\n",s);
            count++;
        }while(count<n);
        if(count == n)
            System.out.print("Account locked");
        else if(pass)
            System.out.print("Welcome in");
    }
}

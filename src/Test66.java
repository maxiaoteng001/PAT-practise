import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test66 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        int rep = input.nextInt();
        int temp =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                temp = input.nextInt();
                if(temp>=a && temp<=b){
                    temp = rep;
                }
                System.out.printf("%03d",temp);
                if(j!=n-1)
                    System.out.print(" ");
                if(j==n-1)
                    System.out.print("\n");
            }
        }
    }
    /*public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        String[] as = s.split(" ");
        int m = Integer.parseInt(as[0]);
        int n = Integer.parseInt(as[1]);
        int a = Integer.parseInt(as[2]);
        int b = Integer.parseInt(as[3]);
        int rep = Integer.parseInt(as[4]);
        int temp =0;
        for(int i=0;i<m;i++){
            s = input.readLine();
            as = s.split(" ");
            for(int j=0;j<n;j++){
                temp = Integer.parseInt(as[j]);
                if(temp>=a && temp<=b){
                    temp = rep;
                }
                System.out.printf("%03d",temp);
                if(j!=n-1)
                    System.out.print(" ");
                if(j==n-1)
                    System.out.print("\n");
            }
        }
    }*/
}

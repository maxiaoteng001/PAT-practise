import java.util.ArrayList;
import java.util.Scanner;


public class Test22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int d = input.nextInt();
        a = a+b;
        ArrayList<Integer> result = new ArrayList<>();
        while(a!=0){
            result.add(a%d);
            a = a/d;
        }
        for(int i=result.size()-1;i>=0;i--)
            System.out.print(result.get(i));
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test64 {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        int n = Integer.parseInt(s);
        int[] array = new int[40];
        int temp=0;
        int count=0;
        s = input.readLine();
        String[] as = s.split(" ");
        for(int i=0;i<n;i++){
            temp =0;
            for(int j=0;j<as[i].length();j++){
                temp += as[i].charAt(j)-'0';
            }
            array[temp]++;
        }
        for(int i=0;i<array.length;i++){
            if(array[i]>=1)
                count++;
        }
        System.out.println(count);
        for(int i=0;i<array.length;i++){
            if(array[i]>=1) {
                System.out.print(i);
                count--;
                if (count > 0)
                    System.out.print(" ");
                if (count == 0)
                    break;
            }
        }

    }
}

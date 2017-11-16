import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test29 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s1 = input.readLine();
        String s2 = input.readLine();
        /*使用StringBuilder也可以*/
        List<Character> result = new ArrayList<>();
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();
        for(int i=0;i<s1.length()-1;i++){
            if(result.contains(s1.charAt(i)))
                continue;
            else if(s2.indexOf(s1.charAt(i))==-1){
                System.out.print(s1.charAt(i));
                result.add(s1.charAt(i));
            }
        }

    }
}

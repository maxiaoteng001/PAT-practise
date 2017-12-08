import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test65 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        int n= Integer.parseInt(s);
        String[] as;
        Map<String,String> map = new HashMap<>();
        for(int i=0;i<n;i++){
            s = input.readLine();
            as = s.split(" ");
            map.put(as[0],as[1]);
            map.put(as[1],as[0]);
        }
        s = input.readLine();
        n = Integer.parseInt(s);
        s = input.readLine();
        as = s.split(" ");
        List<String> list = new ArrayList<>();
        String temp;
        for(int i=0;i<n;i++){
            if(map.containsKey(as[i])){
                temp = map.get(as[i]);
                if(list.contains(temp))
                    list.remove(temp);
                else
                    list.add(as[i]);
            }
            else
                list.add(as[i]);
        }
        n = list.size();
        System.out.println(n);
        Collections.sort(list);
        for(int i=0;i<n;i++){
            System.out.print(list.get(i));
            if(i!=n-1)
                System.out.print(" ");
        }
    }
}

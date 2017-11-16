
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test32 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        Map<String,Integer> map = new HashMap<>();
        String[] as;
        String id;
        int score;
        for(int i=0;i<n;i++){
            as = input.readLine().split(" ");
            id = as[0];
            score = Integer.parseInt(as[1]);
            if(map.containsKey(id))
                map.put(id,map.get(id)+score);
            else
                map.put(id,score);
        }
        int maxScore=0;
        String maxId=null;
        for (Map.Entry<String,Integer> e:map.entrySet()) {
            if(e.getValue()>maxScore){
                maxScore = e.getValue();
                maxId = e.getKey();
            }
        }
        System.out.print(maxId +" "+maxScore);
    }
}

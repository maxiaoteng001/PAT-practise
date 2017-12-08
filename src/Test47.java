import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Test47 {

    /*使用映射保存结果，导致超时，尝试使用数列保存*/
    /*
    public static void main(String[] args)throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        int n = Integer.parseInt(s);
        Map<String, Integer> result = new HashMap<>();
        for(int i=0;i<n;i++){
            s = input.readLine();
            s = s.replace('-',' ');
            String[] as = s.split(" ");
            if(result.containsKey(as[0])){
                result.put(as[0],result.get(as[0])+Integer.parseInt(as[2]));
            }else
                result.put(as[0],Integer.parseInt(as[2]));
        }
        String winner =null;
        int maxScore=0;
        for(String e:result.keySet()){
            if(result.get(e)>maxScore){
                maxScore = result.get(e);
                winner = e;
            }
        }
        System.out.printf("%s %d",winner, maxScore);

    }
    */

    public static void main(String[] args)throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        int n = Integer.parseInt(s);
        int[] result = new int[1001];
        int team;
        for(int i=0;i<n;i++){
            s = input.readLine();
            s = s.replace('-',' ');
            String[] as = s.split(" ");
            team = Integer.parseInt(as[0]);
            result[team] += Integer.parseInt(as[2]);
        }
        int winner=0;
        int maxScore=0;
        for(int i=0;i<1001;i++) {
            if (result[i] > maxScore) {
                winner = i;
                maxScore = result[i];
            }
        }
        System.out.printf("%d %d",winner, maxScore);

    }


}

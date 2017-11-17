import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer,Integer> scores = new HashMap<>();
        int n = input.nextInt();
        int score =0;
        for(int i=0;i<n;i++){
            score = input.nextInt();
            if(scores.containsKey(score))
                scores.put(score,scores.get(score)+1);
            else
                scores.put(score,1);
        }
        n = input.nextInt();
        for(int i=0;i<n;i++){
            score = input.nextInt();
            if(i==n-1){
                if(scores.containsKey(score))
                    System.out.print(scores.get(score));
                else
                    System.out.print(0);
            }else{
                if(scores.containsKey(score))
                    System.out.print(scores.get(score)+" ");
                else
                    System.out.print(0+" ");
            }
        }

    }
}
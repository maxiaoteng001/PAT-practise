import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test72 {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        String[] as = s.split(" ");
        int n = Integer.parseInt(as[0]);
        int m = Integer.parseInt(as[1]);
        s = input.readLine();
        as = s.split(" ");
        int stuCount=0, thingCount=0;
        Set<String> things = new HashSet<>();
        for(int i=0;i<m;i++){
            things.add(as[i]);
        }
        String name ;
        int count =0;
        boolean isHas ;
        List<String> temp = new ArrayList<>();
        for(int i=0;i<n;i++){
            isHas = false;
            s = input.readLine();
            as = s.split(" ");
            name = as[0];
            count = Integer.parseInt(as[1]);
            for(int j=0;j<count;j++){
                if(things.contains(as[j+2])){
                    isHas = true;
                    thingCount++;
                    temp.add(as[j+2]);
                }
            }
            if(isHas){
                stuCount++;
                System.out.printf("%s: ", name);
                for(int j=0;j<temp.size();j++){
                    System.out.print(temp.get(j));
                    if(j!=temp.size()-1)
                        System.out.print(" ");
                    else if(j==temp.size()-1)
                        System.out.print("\n");
                }
            }
            temp.clear();
        }
        System.out.printf("%d %d",stuCount, thingCount);
    }
}

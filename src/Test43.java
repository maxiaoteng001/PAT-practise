import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        char c = ' ';
        Map<Character, Integer> map = new HashMap<>();
        map.put('P', 0);
        map.put('A', 0);
        map.put('T', 0);
        map.put('e', 0);
        map.put('s', 0);
        map.put('t', 0);
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (map.keySet().contains(c))
                map.put(c, map.get(c) + 1);
        }
        while (true) {
            int count =0;
            count += outputc('P',map);
            count += outputc('A',map);
            count += outputc('T',map);
            count += outputc('e',map);
            count += outputc('s',map);
            count += outputc('t',map);
            if(count==0)
                break;
        }
    }
    private static int outputc(char c1, Map<Character, Integer> map){
        if(map.get(c1)!=0){
            System.out.print(c1);
            map.put(c1,map.get(c1)-1);
            return map.get(c1);
        }
        return 0;
    }
}

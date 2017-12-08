import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s= input.nextLine();
        int most =0;
        s = s.toLowerCase();
        boolean isFirst = true;
        Map<Character, Integer> map = new HashMap<>();
        char c = ' ';
        for(int i=0;i<s.length();i++){
            c = s.charAt(i);
            if(c>='a' && c<='z'){
                if(map.keySet().contains(c)){
                    map.put(c,map.get(c)+1);
                }else
                    map.put(c,1);
            }
        }
        for(Character item :map.keySet()){
            if(isFirst){
                c = item;
                most = map.get(item);
                isFirst = false;
            }else if(map.get(item)>most){
                most = map.get(item);
                c = item;
            }else if(map.get(item)==most){
                c = c>item ? item :c;
            }
        }
        System.out.printf("%c %d",c,most);
    }
}

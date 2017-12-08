import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        int num;
        String s;
        String[] array = {"tret", "jan", "feb", "mar", "apr", "may", "jun", "jly", "aug", "sep",
                "oct", "nov", "dec" };
        String[] jinzhi = {"tam", "hel", "maa", "huh", "tou", "kes", "hei", "elo", "syy", "lok", "mer",
                "jou" };
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);
        }
        for (int i = 0; i < jinzhi.length; i++) {
            map.put(jinzhi[i], (i+1)*13);
        }


        for (int i = 0; i < n; i++) {
            s = input.nextLine();
            if (s.charAt(0) >= '1' && s.charAt(0) <= '9') {
                num = Integer.parseInt(s);
                String s1 = "";
                if (num < 13) {
                    s1 = array[num];
                } else {
                    s1 += jinzhi[num/13-1];
                    num = num % 13;
                    if (num != 0)
                        s1 += " " + array[num];
                }
                System.out.print(s1);
            } else {
                int result = 0;
                String[] as;
                if (!s.contains(" ")) {
                    result = map.get(s);
                } else {
                    as = s.split(" ");
                    result = map.get(as[0]) + map.get(as[1]);
                }
                System.out.print(result);
            }
            if (i < (n - 1))
                System.out.print("\n");
        }
    }
}
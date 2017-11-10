import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test14 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s1 = input.readLine();
        String s2 = input.readLine();
        String s3 = input.readLine();
        String s4 = input.readLine();
        char week = ' ';
        char hourc = ' ';
        int hour =0;
        int minute = 0;
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (count == 0 && s2.charAt(i) == s1.charAt(i) && s1.charAt(i)>='A' && s1.charAt(i)<='G' ) {
                week = s1.charAt(i);
                count++;
            } else if (count == 1 &&
                    s2.charAt(i) == s1.charAt(i) &&
                    (s1.charAt(i)>='A' && s1.charAt(i)<='N' || s1.charAt(i)>='0' && s1.charAt(i)<='9')) {
                    hourc = s2.charAt(i);
                    break;
                }
            }
        for (int i = 0; i < s3.length(); i++) {
            if (s3.charAt(i) == s4.charAt(i) &&
                    ((s3.charAt(i)>='A' && s3.charAt(i)<='Z') || (s3.charAt(i)>='a' &&s3.charAt(i)<='z'))){
                minute = i;
                break;
            }
        }
        String[] weeks = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        if(hourc>='A' && hourc<='N')
            hour = hourc +10 -'A';
        else
            hour = hourc -'0';

        System.out.printf("%s %02d:%02d",weeks[week-'A'],hour,minute);
    }
}

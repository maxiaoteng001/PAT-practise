import java.util.Scanner;

public class Test57 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        s = s.toUpperCase();
        int total = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
                total += s.charAt(i)+1-'A';
        }
        int zero =0, one =0;
        while(total!=0){
            if(total %2 ==0){
                zero++;
            }
            else{
                one++;
            }
            total = total/2;
        }
        System.out.print(zero+" "+one);
    }
}

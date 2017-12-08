import java.util.Scanner;

public class Test40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        long count =0;
        for(int p=0;p<s.length();p++){
            if(s.charAt(p)=='P'){
                for(int a=p+1;a<s.length();a++){
                    if(s.charAt(a)=='A'){
                        for(int t = a+1;t<s.length();t++){
                            if(s.charAt(t)=='T') {
                                count = (count % 1000000007) + 1;
                            }
                        }
                    }
                }
            }
        }
        System.out.print(count);

    }
}

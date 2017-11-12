import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test24 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s= input.readLine();
        if(s.charAt(0)=='-'){
            System.out.print('-');
        }
        int eIndex = s.indexOf('E');
        String s1=s.substring(1,eIndex);
        String news1 = s1.replace(".","");
        int sign = eIndex+1;
        String s2=s.substring(eIndex+2);
        int power = Integer.parseInt(s2);
        if(power==0){
            System.out.print(s1);
        }else {
            if(s.charAt(sign)=='+'){
                if(power >=news1.length()-1){
                    System.out.print(news1);
                    for(int i=0;i<power-news1.length()+1;i++)
                        System.out.print(0);
                }else if(power<news1.length()-1){
                    System.out.print(news1.substring(0,power+1));
                    System.out.print('.');
                    System.out.print(news1.substring(power+1));
                }

            }else if(s.charAt(sign)=='-'){
                System.out.print("0.");
                for(int i=0;i<power-1;i++){
                    System.out.print(0);
                }
                System.out.print(news1);
            }
        }
    }
}

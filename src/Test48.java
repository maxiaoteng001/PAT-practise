
import java.util.Scanner;

public class Test48 {
    //使用将长的字符串切掉，后两个示例是错误，试试补零
    //发现不行
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        String s2 = input.next();

        if(s1.length()<s2.length()){
            System.out.print(s2.substring(0,s2.length()-s1.length()));
            s2 = s2.substring(s2.length()-s1.length());
        }else if(s1.length()>s2.length()){
            s1 = s1.substring(0,s1.length()-s2.length());
        }
        char[] first = s1.toCharArray();
        char[] second = s2.toCharArray();
        int temp;
        for(int i=s1.length()-1,j=1;i>=0;i--,j++){
            if(j%2==0){
                temp = second[i]-first[i];
                if(temp<0)
                    temp +=10;
                second[i] = (char) (temp+'0');
            }else {
                temp = (first[i]+second[i]-'0'-'0')%13;
                if(temp ==10)
                    second[i] ='J';
                else if(temp ==11)
                    second[i] ='Q';
                else if(temp ==12)
                    second[i] = 'K';
                else
                    second[i] = (char) (temp+'0');
            }
        }
        for(int i=0;i<first.length;i++)
            System.out.print(second[i]);

    }

}

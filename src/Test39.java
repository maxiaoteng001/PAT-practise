import java.util.Scanner;

public class Test39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        char[] as = s1.toCharArray();
        int yIndex =0;
        String s2 = input.nextLine();
        int noCount = 0;
        for(int i=0;i<s2.length();i++){
            yIndex =-1;
            char c = s2.charAt(i);
            for(int j=0;j<as.length;j++){
               if(as[j]==c){
                   yIndex = j;
                   break;
               }
            }
            if(yIndex== -1)
                noCount++;
            else{
                as[yIndex] = ' ';
            }
        }
        if(noCount==0){
            System.out.printf("%s %d","Yes",s1.length()-s2.length());
        }else
            System.out.printf("%s %d","No",noCount);
    }
}

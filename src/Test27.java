import java.util.Scanner;

public class Test27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        char sign = input.next().charAt(0);
        n = n-1;
        int i=1;
        while(n>=(i+2)*2){
            i += 2;
            n = n-2*i;
        }
        for(int j=i;j>0;j=j-2)
            printLine(sign,i,j);
        for(int j=3;j<=i;j=j+2)
            printLine(sign,i,j);
        System.out.print(n);
    }
    public static void printLine(char sign,int leng, int count){
        int k = (leng-count)/2;
        printSign(' ',k);
        printSign(sign,count);
        System.out.print("\n");
    }
    public static void printSign(char sign,int count){
        for(int i=0;i<count;i++)
            System.out.print(sign);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test12 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


        String s=input.readLine();
        String[] sa = s.split(" ");
        int n=Integer.parseInt(sa[0]);
        int[] array = new int[n];
        for(int i=0;i<n;i++)
            array[i] =Integer.parseInt(sa[i+1]);
        int A1=0;
        int A2=0,count2=0;
        int A3=0;
        int A4=0,count4=0;
        int A5=0;
        int num;
        for(int i=0;i<n;i++){
            num = array[i];
            if(num%10==0)
                A1 += num;
            else if(num%5==1){
                A2 += num*Math.pow(-1,count2++);
            } else if(num%5 ==2)
                A3++;
            else if(num%5 ==3){
                count4++;
                A4 += num;
            }else if(num%5 ==4){
                if(num>A5){
                    A5 = num;
                }
            }
        }
        if(A1 ==0)
            System.out.printf("N ");
        else
            System.out.printf("%d ",A1);

        if(count2==0)
            System.out.printf("N ");
        else
            System.out.printf("%d ",A2);

        if(A3 ==0)
            System.out.printf("N ");
        else
            System.out.printf("%d ",A3);

        if(count4==0)
            System.out.printf("N ");
        else
            System.out.printf("%.1f ",(double)A4/count4);

        if(A5 ==0)
            System.out.printf("N");
        else
            System.out.printf("%d",A5);

        input.close();
    }
}

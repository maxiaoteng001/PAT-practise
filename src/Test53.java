import java.util.Scanner;

public class Test53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Double e = input.nextDouble();
        int d = input.nextInt();
        int mayBe = 0;
        int sure = 0;
        int days ;
        int lowDays;
        for(int i=0;i<n;i++){
            days = input.nextInt();
            lowDays =0;
            for(int j=0;j<days;j++){
                if(input.nextDouble()<e)
                    lowDays++;
            }
            if(days>d && lowDays>days/2)
                sure++;
            else if(days<=d && lowDays>days/2)
                mayBe++;
        }
        input.close();
        Double mayRate = (double)mayBe*100.0/n;
        Double sureRate = (double)sure*100.0/n;
        System.out.printf("%.1f%% %.1f%%",mayRate,sureRate);
    }
}

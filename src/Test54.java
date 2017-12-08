import java.util.Scanner;

public class Test54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String temp;
        Double tempDou;
        int legalCount = 0;
        Double total = 0.0;
        Double leverage = 0.0;
        for (int i = 0; i < n; i++) {
            temp = input.next();
            try {
                tempDou = Double.parseDouble(temp);
                if(temp.contains(".") && temp.length()-temp.indexOf('.')>3)
                    throw new Exception();
                if (tempDou < -1000 || tempDou > 1000 )
                    throw new Exception();
                total += tempDou;
                legalCount++;
            } catch (Exception e) {
                System.out.printf("ERROR: %s is not a legal number\n", temp);
            }
        }
        if (legalCount == 0) {
            System.out.printf("The average of 0 numbers is Undefined\n");
        } else {
            leverage = total / legalCount;
            System.out.printf("The average of %d numbers is %.2f", legalCount, leverage);
        }
    }
}

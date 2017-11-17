import java.util.Scanner;

public class Test37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String[] as = s.split("\\.");
        int gall =Integer.parseInt(as[0]);
        int sick = Integer.parseInt(as[1]);
        int knut = Integer.parseInt(as[2]);
        int total1 = (gall*17+sick)*29+knut;

        s = input.next();
        as = s.split("\\.");
        gall =Integer.parseInt(as[0]);
        sick = Integer.parseInt(as[1]);
        knut = Integer.parseInt(as[2]);
        int total2 = (gall*17+sick)*29+knut;
        total1 = total2-total1;
        if(total1<0){
            System.out.print("-");
            total1 *= -1;
        }
        knut = total1%29;
        sick = total1/29;
        gall = sick/17;
        sick = sick%17;
        System.out.print(gall+"."+sick+"."+knut);
    }
}

import java.util.Scanner;

public class Test34 {
    private static class Fraction{
        private int numerator;
        private int denominator;

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }

        public int getNumerator() {
            return numerator;
        }

        public int getDenominator() {
            return denominator;
        }

        //最小公约数
        private int getGCD(int a, int b){
            if(b==0) return a;
            return getGCD(b,a%b);
        }

        //约分
        public void reduceResult(){
            int s = getGCD(numerator,denominator);
            numerator=numerator/s;
            denominator= denominator/s;
            if(denominator<0){
                numerator *=-1;
                denominator *=-1;
            }
        }

        @Override
        public String toString() {
            String result=null;
            if(denominator==0)
                result = "Inf";
            else if(numerator==0)
                result = "0";
            else if(denominator==1){
                if(numerator<0)
                    result = "("+numerator +")";
                else
                    result = numerator+"";
            }
            else {
                if(Math.abs(numerator)>denominator && numerator<0)
                    result = "(-"+Math.abs(numerator/denominator) +" " +Math.abs(numerator%denominator) +"/"
                            +denominator+ ")";
                else if(numerator<0)
                    result = "("+numerator +"/" + denominator+")";
                else if(numerator>denominator)
                    result = numerator/denominator +" " +numerator%denominator +"/" +denominator;
                else
                    result =  numerator +"/" + denominator;
            }
            return result;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String[] as = s.split(" ");
        String[] as1 = as[0].split("/");
        Fraction first = new Fraction(Integer.parseInt(as1[0]),Integer.parseInt(as1[1]));
        as1 = as[1].split("/");
        Fraction second = new Fraction(Integer.parseInt(as1[0]),Integer.parseInt(as1[1]));
        first.reduceResult();
        second.reduceResult();
        plus(first,second);
        minus(first,second);
        multiply(first,second);
        divide(first,second);
    }

    public static void plus(Fraction first, Fraction second){
        Fraction third = new Fraction(
                first.getNumerator()*second.getDenominator()+second.getNumerator()*first.getDenominator(),
                first.getDenominator()*second.getDenominator());
        third.reduceResult();
        System.out.println(first+" + "+second+" = "+third);

    }
    public static void minus(Fraction first, Fraction second){
        Fraction third = new Fraction(
        first.getNumerator()*second.getDenominator()-second.getNumerator()*first.getDenominator(),
                first.getDenominator()*second.getDenominator());
        third.reduceResult();
        System.out.println(first+" - "+second+" = "+third);

    }

    public static void multiply(Fraction first, Fraction second){
        Fraction third = new Fraction(
                first.getNumerator()*second.getNumerator(),
                second.getDenominator()*first.getDenominator());
        third.reduceResult();
        System.out.println(first+" * "+second+" = "+third);
    }

    public static void divide(Fraction first, Fraction second){
        Fraction third = new Fraction(
                first.getNumerator()*second.getDenominator(),
                second.getNumerator()*first.getDenominator());
        third.reduceResult();
        System.out.print(first+" / "+second+" = "+third);
    }
}

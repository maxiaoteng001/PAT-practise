import java.util.Scanner;

public class Test52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        s = s.replace('[',' ');
        s = s.replace(" ","");
        s = s.trim();
        String[] handSigns = s.split("]");
        s = input.nextLine();
        s = s.replace('[',' ');
        s = s.trim();
        s = s.replace(" ","");
        String[] eyeSigns = s.split("]");
        s = input.nextLine();
        s = s.replace('[',' ');
        s = s.trim();
        s = s.replace(" ","");
        String[] mouthSigns = s.split("]");

        int n=input.nextInt();
        int temp =0;
        String result;
        for(int i=0;i<n;i++){
            result ="";
            temp = input.nextInt();
            if(temp>handSigns.length){
                System.out.print("Are you kidding me?@\\/@");
                break;
            }
            result += handSigns[temp-1]+"(";

            temp = input.nextInt();
            if(temp>eyeSigns.length){
                System.out.print("Are you kidding me? @\\/@");
                break;
            }
            result += eyeSigns[temp-1];

            temp = input.nextInt();
            if(temp>mouthSigns.length){
                System.out.print("Are you kidding me? @\\/@");
                break;
            }
            result += mouthSigns[temp-1];

            temp = input.nextInt();
            if(temp>eyeSigns.length){
                System.out.print("Are you kidding me? @\\/@");
                break;
            }
            result += eyeSigns[temp-1];

            temp = input.nextInt();
            if(temp>handSigns.length){
                System.out.print("Are you kidding me? @\\/@");
                break;
            }
            result += ")"+handSigns[temp-1];

            System.out.print(result);

            if(i!=n-1)
                System.out.println();
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test71 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        String[] as = s.split(" ");
        int total = Integer.parseInt(as[0]);
        int k = Integer.parseInt(as[1]);
        int first =0;
        int second =0;
        int b = 0;
        int tt=0;
        for(int i=0;i<k;i++){
            s = input.readLine();
            as = s.split(" ");
            first = Integer.parseInt(as[0]);
            b = Integer.parseInt(as[1]);
            tt = Integer.parseInt(as[2]);
            second = Integer.parseInt(as[3]);
            if(total<=0){
                System.out.print("Game Over.");
                break;
            }else if(tt>total){
                System.out.printf("Not enough tokens.  Total = %d.",total);
            }else if((b==0 && second<first) || (b==1 && second>first)){
                total = total+tt;
                System.out.printf("Win %d!  Total = %d.", tt, total);
            }else {
                total = total -tt;
                System.out.printf("Lose %d.  Total = %d.", tt, total);
            }

            if(i!=k-1){
                System.out.print("\n");
            }
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test69 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        String[] as = s.split(" ");
        int M = Integer.parseInt(as[0]);
        int N = Integer.parseInt(as[1]);
        int S = Integer.parseInt(as[2]);
        String[] array = new String[M];
        List<String> hasChecked = new ArrayList<>();
        for(int i=0;i<M;i++){
            array[i] = input.readLine();
        }
        for(int i=S-1;i<array.length;i +=N){
            if(!hasChecked.contains(array[i])){
                if(hasChecked.size()!=0)
                    System.out.print("\n");
                System.out.print(array[i]);
                hasChecked.add(array[i]);
            }else
                i -= N-1;
        }
        if(hasChecked.size()==0)
            System.out.print("Keep going...");
    }
}

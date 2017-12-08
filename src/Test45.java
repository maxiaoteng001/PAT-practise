
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test45 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
        String s = input.readLine();
        int n = Integer.parseInt(s);
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        s = input.readLine();
        String[] as = s.split(" ");
        boolean isZhuYuan;
        for(int i=0;i<n;i++){
            array1[i] = Integer.parseInt(as[i]);
            array2[i] = array1[i];
        }
        Arrays.sort(array2);
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            isZhuYuan = true;
            if(array1[i]!=array2[i])
                isZhuYuan = false;
            else {
                if (i != 0 && array1[i]<array2[i-1]) {
                    isZhuYuan = false;
                }
                if (isZhuYuan && i != n - 1) {
                    if (array1[i] > array2[i+1]) {
                        isZhuYuan = false;
                    }
                }
            }
            if (isZhuYuan) {
                result.add(array1[i]);
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i));
            if(i!=result.size()-1){
                System.out.print(" ");
            }
        }
    }
}

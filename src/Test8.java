import java.util.Scanner;

public class Test8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int remove = input.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++)
            array[i] = input.nextInt();

        for(int i=0;i<remove;i++){
            int temp = array[n-1];
            for(int j=n-1;j>0;j--){
                array[j] = array[j-1];
            }
            array[0] = temp;
        }

        for(int i=0;i<n-1;i++){
            System.out.print(array[i]+" ");
        }
        System.out.print(array[n-1]);
    }
}

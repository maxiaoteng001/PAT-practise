import java.util.Scanner;

public class Test23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        for(int i=0;i<10;i++){
            array[i] = input.nextInt();
        }
        for(int i=1;i<10;i++){
            if(array[i]!=0){
                System.out.print(i);
                array[i]--;
                break;
            }
        }
        for(int i=0;i<10;i++){
            if(array[i]==0)
                continue;
            for(int j=0;j<array[i];j++) {
                System.out.print(i);
            }
        }
    }
}

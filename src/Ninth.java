import java.util.LinkedList;
import java.util.Scanner;

public class Ninth {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] array ;
        String temp = input.nextLine();
        array = temp.split(" ");
        for(int i=array.length-1;i>0;i--)
            System.out.print(array[i]+" ");
        System.out.print(array[0]);
    }
}

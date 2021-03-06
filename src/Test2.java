/*读入一个自然数n，计算其各位数字之和，用汉语拼音写出和的每一位数字。
        输入格式：每个测试输入包含1个测试用例，即给出自然数n的值。这里保证n小于10100。
        输出格式：在一行内输出n的各位数字之和的每一位，拼音数字间有1 空格，但一行中最后一个拼音数字后没有空格。
        输入样例：
        1234567890987654321123456789
        输出样例：
        yi san wu
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String num = input.nextLine();
        char[] charArray = num.toCharArray();
        int result = 0;
        try {
            for(char e:charArray){
                if( Character.isDigit(e)) {
                    result += e-48;
                }
                else
                    throw new Exception();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<Integer> numToChar = new ArrayList<Integer>();
        while(result != 0){
            numToChar.add(result%10);
            result = result/10;
        }
        for(int i=numToChar.size()-1;i>=0;i--){
            switch(numToChar.get(i)) {
                case 1:
                    System.out.print("yi");
                    break;
                case 2:
                    System.out.print("er");
                    break;
                case 3:
                    System.out.print("san");
                    break;
                case 4:
                    System.out.print("si");
                    break;
                case 5:
                    System.out.print("wu");
                    break;
                case 6:
                    System.out.print("liu");
                    break;
                case 7:
                    System.out.print("qi");
                    break;
                case 8:
                    System.out.print("ba");
                    break;
                case 9:
                    System.out.print("jiu");
                    break;
                case 0:
                    System.out.print("ling");
                    break;
            }
            if(i !=0 )
                System.out.print(" ");

        }


    }

}

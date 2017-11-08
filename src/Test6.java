

/*让我们用字母B来表示“百”、字母S表示“十”，用“12...n”来表示个位数字n（<10），换个格式来输出任一个不超过3位的正整数。例如234应该被输出为BBSSS1234，因为它有2个“百”、3个“十”、以及个位的4。
输入格式：每个测试输入包含1个测试用例，给出正整数n（<1000）。
输出格式：每个测试用例的输出占一行，用规定的格式输出n。
输入样例1：
234
输出样例1：
BBSSS1234
输入样例2：
23
输出样例2：
SS123
*/
import java.util.Scanner;
public class Test6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num>0 && num<1000){
            if(num/100 !=0){
                int j = num/100;
                num = num%100;
                for(int i= 0;i<j;i++){
                    System.out.print("B");
                }
            }
            if(num/10 !=0){
                int j = num/10;
                num = num%10;
                for(int i= 0;i<j;i++){
                    System.out.print("S");
                }
            }
            if(num!=0){
                for(int i= 1;i<=num;i++){
                    System.out.print(i);
                }
            }
        }
    }
}

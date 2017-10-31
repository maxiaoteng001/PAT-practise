/*美国总统奥巴马不仅呼吁所有人都学习编程，甚至以身作则编写代码，成为美国历史上首位编写计算机代码的总统。2014年底，为庆祝“计算机科学教育周”正式启动，奥巴马编写了很简单的计算机代码：在屏幕上画一个正方形。现在你也跟他一起画吧！

输入格式：

输入在一行中给出正方形边长N（3<=N<=20）和组成正方形边的某种字符C，间隔一个空格。

输出格式：

输出由给定字符C画出的正方形。但是注意到行间距比列间距大，所以为了让结果看上去更像正方形，我们输出的行数实际上是列数的50%（四舍五入取整）。

输入样例：
10 a
输出样例：
aaaaaaaaaa
a        a
a        a
a        a
aaaaaaaaaa
*/

import java.util.Scanner;

public class Thirty_sixth {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        char c = input.next().charAt(0);
        printHead(n,c);
        printMid(n,c);
        printHead(n,c);

    }
    public static void printHead(int n, char c){
        for(int i=0;i<n;i++){
            System.out.print(c);
        }
        System.out.print("\n");
    }

    public static void printMid(int n,char c){
        int x =n;
        if(x%2 !=0){
            x += 1;
        }
        for(int j=0;j<Math.round((double)n/2)-2;j++) {
            System.out.print(c);
            for (int i = 0; i < n-2; i++) {
                System.out.print(" ");
            }
            System.out.print(c + "\n");
        }
    }
}

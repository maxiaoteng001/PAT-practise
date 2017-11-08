/*复数可以写成(A + Bi)的常规形式，其中A是实部，B是虚部，i是虚数单位，满足i2 = -1;也可以写成极坐标下的指数形式(R*e(Pi))，其中R是复数模，P是辐角，i是虚数单位，其等价于三角形式 R(cos(P) +
isin(P))。

现给定两个复数的R和P，要求输出两数乘积的常规形式。

输入格式：

输入在一行中依次给出两个复数的R1, P1, R2, P2，数字间以空格分隔。

输出格式：

在一行中按照“A+Bi”的格式输出两数乘积的常规形式，实部和虚部均保留2位小数。注意：如果B是负数，则应该写成“A-|B|i”的形式。

输入样例：
2.3 3.5 5.2 0.4
输出样例：
-8.68-8.23i
*/


import java.util.Scanner;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Test51 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
/*
        double R1= input.nextDouble();
        double P1 = input.nextDouble();
        double R2 = input.nextDouble();
        double P2 = input.nextDouble();

        double a = R1*R2*(cos(P1)*cos(P2)-sin(P1)*sin(P2));
        double b = R1*R2*(sin(P1)*cos(P2)+sin(P2)*cos(P1));
*/
        if(a==0 && b==0)
            System.out.print("0.00");
        else if(a==0) {
            System.out.printf("%.2fi",b);
        }else {
            if (b < 0) {
                System.out.printf("%.2f-%.2fi", a, Math.abs(b));
            } else if(b>0)
                System.out.printf("%.2f+%.2fi", a, b);
            else
                System.out.printf("%.2f",a);
        }
    }
}

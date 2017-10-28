/*
* 给定一个k位整数N = dk-1*10k-1 + ... + d1*101 + d0 (0<=di<=9, i=0,...,k-1, dk-1>0)，请编写程序统计每种不同的个位数字出现的次数。例如：给定N = 100311，则有2个0，3个1，和1个3。

输入格式：

每个输入包含1个测试用例，即一个不超过1000位的正整数N。

输出格式：

对N中每一种不同的个位数字，以D:M的格式在一行中输出该位数字D及其在N中出现的次数M。要求按D的升序输出。

输入样例：
100311
输出样例：
0:2
1:3
3:1
*/

//题目说了1000位，故要采用字符串
//使用toArray（）造成了超时，故采用string.charAt()
import java.util.Scanner;

public class Twenty_First {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String x = input.next();
        int[] result = new int[10];
        int temp = 0;
        for(int i=0;i<x.length();i++) {
            char k =x.charAt(i);
            result[k-48]++;
        }
//        for(char e: x.toCharArray()){
//            result[(int)e-48]++;
//        }
        for(int i=0;i<result.length;i++){
            if(result[i]!=0)
                System.out.println(i+":"+result[i]);
        }
    }
}

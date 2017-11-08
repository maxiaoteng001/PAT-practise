/*
给定N个非0的个位数字，用其中任意2个数字都可以组合成1个2位的数字。要求所有可能组合出来的2位数字的和。例如给定2、5、8，则可以组合出：25、28、52、58、82、85，它们的和为330。

输入格式：

输入在一行中先给出N（1<N<10），随后是N个不同的非0个位数字。数字间以空格分隔。

输出格式：

输出所有可能组合出来的2位数字的和。

输入样例：
3 2 8 5
输出样例：
330
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fifty_sixth {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] all = new int[n];
        for(int i=0;i<n;i++){
            all[i]=input.nextInt();
        }
        List<Integer> numbers = new ArrayList<>();
        int total=0;
        int temp = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(all[i]==all[j]){
                    temp=all[i]*11;
                    if(!numbers.contains(temp)){
                        total += temp;
                        numbers.add(temp);
                    }
                }else{
                    temp = all[i]*10+all[j];
                    if(!numbers.contains(temp)) {
                        total += (all[i] + all[j]) * 11;
                        numbers.add(temp);
                        temp = all[i] + all[j] * 10;
                        numbers.add(temp);
                    }
                }
            }
        }
        System.out.print(total);
    }
}

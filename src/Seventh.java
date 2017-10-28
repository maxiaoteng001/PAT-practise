/*让我们定义 dn 为：dn = pn+1 - pn，其中 pi 是第i个素数。显然有 d1=1 且对于n>1有 dn 是偶数。“素数对猜想”认为“存在无穷多对相邻且差为2的素数”。

现给定任意正整数N (< 105)，请计算不超过N的满足猜想的素数对的个数。

输入格式：每个测试输入包含1个测试用例，给出正整数N。

输出格式：每个测试用例的输出占一行，不超过N的满足猜想的素数对的个数。

输入样例：
20
输出样例：
4
*/

//提交的问题：1，判断素数的算法，挨个判断导致运行时间太长，选择判断到n的平方根
//2，求素数集时，没有使用<=导致如果输入的是素数，则最后一个没有被包括
import java.util.LinkedList;
import java.util.Scanner;

public class Seventh {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        LinkedList<Integer> primes = new LinkedList<>();
        for(int i = 2;i<n;i=i+1){
            //if(i is prime )  add i into primes
            if(isPrime(i))
                primes.add(i);
        }
        int result = 0;
        for(int i=1;i<primes.size();i++){
            if(primes.get(i)-primes.get(i-1)==2){
                result++;
            }
        }
        System.out.println(result);
    }

    public static boolean isPrime(int n){
        if(n==1)
            return false;
        else if(n==2 || n==3)
            return true;
        else if(n%2==0)
            return false;
        else {
            for (int i = 2; i*i<= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}


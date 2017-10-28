/*给定区间[-231, 231]内的3个整数A、B和C，请判断A+B是否大于C。

        输入格式：

        输入第1行给出正整数T(<=10)，是测试用例的个数。随后给出T组测试用例，每组占一行，顺序给出A、B和C。整数间以空格分隔。

        输出格式：

        对每组测试用例，在一行中输出“Case #X: true”如果A+B>C，否则输出“Case #X: false”，其中X是测试用例的编号（从1开始）。

        输入样例：
        4
        1 2 3
        2 3 4
        2147483647 0 2147483646
        0 -2147483648 -2147483647
        输出样例：
        Case #1: false
        Case #2: true
        Case #3: true
        Case #4: false*/

//力求简洁，刚开始用了数组来保存，然后计算，结果第三例变运行超时
import java.util.Scanner;

public class Eleventh {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=0;i<n;i++) {
             long a = input.nextLong();
             long b = input.nextLong();
             long c = input.nextLong();
             System.out.println("Case #"+ (i+1) +": "+isPass(a,b,c));
        }
    }
    public static boolean isPass(Long a,Long b, Long c){
        if(a+b>c){
            return true;
        }
        return false;
    }
}



/*
import java.util.LinkedList;
import java.util.Scanner;

public class Eleventh {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        LinkedList<ABC> ls = new LinkedList<>();
        for(int i=0;i<n;i++) {
            ABC e = new ABC(input.nextInt(),input.nextInt(),input.nextInt());
            ls.add(e);
        }
        for(int i=0;i<ls.size();i++){
            System.out.println("Case #"+ i+1 +": "+ABC.isPass(ls.get(i)));
        }
    }
}
class ABC{
    int a,b,c;

    public ABC(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public static boolean isPass(ABC e){
        if(e.getA()+e.getB()>e.getC())
            return true;
        else
            return false;
    }
}*/

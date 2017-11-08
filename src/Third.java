/*“答案正确”是自动判题系统给出的最令人欢喜的回复。本题属于PAT的“答案正确”大派送 —— 只要读入的字符串满足下列条件，系统就输出“答案正确”，否则输出“答案错误”。
        得到“答案正确”的条件是：
        1. 字符串中必须仅有P, A, T这三种字符，不可以包含其它字符；
        2. 任意形如 xPATx 的字符串都可以获得“答案正确”，其中 x 或者是空字符串，或者是仅由字母 A 组成的字符串；
        3. 如果 aPbTc 是正确的，那么 aPbATca 也是正确的，其中 a, b, c 均或者是空字符串，或者是仅由字母 A 组成的字符串。
        现在就请你为PAT写一个自动裁判程序，判定哪些字符串是可以获得“答案正确”的。

        输入格式： 每个测试输入包含1个测试用例。第1行给出一个自然数n (<10)，是需要检测的字符串个数。接下来每个字符串占一行，字符串长度不超过100，且不包含空格。
        输出格式：每个字符串的检测结果占一行，如果该字符串可以获得“答案正确”，则输出YES，否则输出NO。
        输入样例：
        8
        PAT
        PAAT
        AAPATAA
        AAPAATAAAA
        xPATx
        PT
        Whatever
        APAAATAA
        输出样例：
        YES
        YES
        YES
        YES
        NO
        NO
        NO
        NO
*/

import java.util.Scanner;

public class Third {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        input.nextLine();
        String[] test = new String[count];
        for(int i=0;i<count;i++){
            test[i] = input.nextLine();
        }
        String temp;
        for(int i=0;i<count;i++){
            int countP=0,countT=0;
            int indexP=0,indexT=0;
            temp = test[i];
            boolean result = true;
            for(int j=0;j<temp.length();j++){
                char m=temp.charAt(j);
                if(m!='P' && m!='A' && m!='T'){
                    result = false;
                    break;
                }
                else if(m =='P'){
                    countP++;
                    indexP =j;
                }
                else if(m =='T'){
                    countT++;
                    indexT = j;
                }
                if(countP>1 || countT>1){
                    result = false;
                    break;
                }
            }
            if(result) {
                if(temp.indexOf('P')== -1 || temp.indexOf('A')== -1 || temp.indexOf('T')==-1){
                    result = false;
                }
                else if ((temp.length() - indexT - 1) == (indexP * (indexT - 1 - indexP))) {
                    result = true;
                } else {
                    result = false;
                }
            }
            if(result)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

/*判断题的评判很简单，本题就要求你写个简单的程序帮助老师判题并统计学生们判断题的得分。

输入格式：

输入在第一行给出两个不超过100的正整数N和M，分别是学生人数和判断题数量。第二行给出M个不超过5的正整数，是每道题的满分值。第三行给出每道题对应的正确答案，0代表“非”，1代表“是”。随后N行，每行给出一个学生的解答。数字间均以空格分隔。

输出格式：

按照输入的顺序输出每个学生的得分，每个分数占一行。

输入样例：
3 6
2 1 3 3 4 5
0 0 1 0 1 1
0 1 1 0 0 1
1 0 1 0 1 0
1 1 0 0 1 1
输出样例：
13
11
12
*/

import java.util.Scanner;

public class Sixty_first {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int studentNum = input.nextInt();
        int questionNum = input.nextInt();
        int[] scores = new int[questionNum];
        for(int i =0;i<questionNum;i++){
            scores[i]=input.nextInt();
        }
        int[] answer = new int[questionNum];
        for(int i=0;i<questionNum;i++){
            answer[i] = input.nextInt();
        }
        int[] studentAns = new int[questionNum];
        for(int i=0;i<studentNum;i++){
            int result =0;
            for(int j=0;j<questionNum;j++){
                studentAns[j]=input.nextInt();
            }
            for(int j=0;j<questionNum;j++){
                if(studentAns[j]==answer[j])
                    result += scores[j];
            }
            System.out.println(result);
        }
    }
}

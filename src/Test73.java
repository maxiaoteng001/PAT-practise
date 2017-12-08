import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test73 {

    /*这个类的包括
    * num  题号
    * score 满分
    * result 存放正确答案，有为1，没有为0，
    * errorCount  记录错误的次数
    * stat  记录错误的选项，0-4对应a-e
    * 实现Comparable接口，对组成的链表实现升序排列*/
    private static class Question implements Comparable<Question>{
        int num;
        int score;
        int[] result;
        int errorCount;
        int[] stat ;

        public Question(int num) {
            this.num = num;
            score =0;
            result =new int[5];
            errorCount =0;
            stat = new int[5];
        }

        public void setStat(int k){
            stat[k]++;
        }

        public int[] getStat() {
            return stat;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public void setResult(int[] k) {
            result =k;
        }

        public void setErrorCount() {
            this.errorCount++;
        }

        public int getNum() {
            return num;
        }

        public int getScore() {
            return score;
        }

        public int[] getResult() {
            return result;
        }

        public int getErrorCount() {
            return errorCount;
        }


        @Override
        public int compareTo(Question o) {
            return this.getErrorCount() - o.getErrorCount()!=0 ?
                    this.getErrorCount() - o.getErrorCount() :
                    -this.num + o.getNum() ;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        String[] as = s.split("\\s");
        /*n 学生的个数
        * m 问题的数量
        * questions 存放问题的链表*/
        int n= Integer.parseInt(as[0]);
        int m = Integer.parseInt(as[1]);
        List<Question> questions = new ArrayList<>();
        Question temp;
        int[] resultTemp ;
        /*标记是否为全对，一旦出错，赋值false*/
        boolean isAllRight= true;
        for(int i=0;i<m;i++){
            s = input.readLine();
            as = s.split("\\s");
            temp = new Question(i+1);
            temp.setScore(Integer.parseInt(as[0]));
            resultTemp = new int[5];
            /*setResult 方法接收一个大小为5的整型数组*/
            for(int j=0;j<Integer.parseInt(as[2]);j++){
                if(as[3+j].equals("a")){
                    resultTemp[0] = 1;
                }else if(as[3+j].equals("b")){
                    resultTemp[1] = 1;
                }else if(as[3+j].equals("c")){
                    resultTemp[2] = 1;
                }else if(as[3+j].equals("d")){
                    resultTemp[3] = 1;
                }else if(as[3+j].equals("e")){
                    resultTemp[4] = 1;
                }
            }
            temp.setResult(resultTemp);
            questions.add(temp);
        }
        /*接收每个学生的回答*/
        for(int i=0;i<n;i++){
            double total =0.0;
            s = input.readLine();
            s = s.replace("(","");
            s = s.replace(")","%");
            as = s.split("%");
            String[] ass ;
            /*每道题依次处理*/
            for(int j=0;j<m;j++){
                boolean isPass = true;//不全对，漏选
                boolean right = true;//全对
                ass = as[j].trim().split(" ");
                temp = questions.get(j);
                //第一道题的答案
                resultTemp = temp.getResult();
                int[] resultNow = new int[5];
                int k=0;
                /*获得当前题目的输入内容*/
                for(int z =0;z<Integer.parseInt(ass[0]);z++){
                    if(ass[1+z].equals("a")){
                        k=0;
                    }else if(ass[1+z].equals("b")){
                        k=1;
                    }else if(ass[1+z].equals("c")){
                        k=2;
                    }else if(ass[1+z].equals("d")){
                        k=3;
                    }else if(ass[1+z].equals("e")){
                        k=4;
                    }
                    resultNow[k] = 1;
                }
                for(int q=0;q<5;q++){
                    //答案遗漏
                    if(resultNow[q] < resultTemp[q]){
                        isPass = false;
                        temp.setStat(q);
                    }//答案错选
                    else if(resultNow[q]>resultTemp[q]){
                        right = false;
                        temp.setStat(q);
                        isAllRight = false;
                    }
                }
                if(!right){
                    temp.setErrorCount();
                }else if(right && !isPass){
                    total += temp.getScore()/2.0;
                }else if(right && isPass)
                    total += temp.getScore();
            }
            System.out.printf("%.01f\n",total);
        }
        List<String> output = new ArrayList<>();
        if(isAllRight){
            System.out.print("Too simple");
        }else {
            Collections.sort(questions);
            //记下最大的错题数
            int max = questions.get(m - 1).getErrorCount();
            for (int i = m-1; i >=0; i--) {
                temp = questions.get(i);
                if(temp.getErrorCount()<max){
                    break;
                }
                resultTemp = temp.getStat();
                int maxChar = 0;
                for(int j=0;j<5;j++){
                    if(resultTemp[j]>maxChar)
                        maxChar = resultTemp[j];
                }
                String[] xuanxiang = {"a","b","c","d","e"};
                for(int j=0;j<5;j++){
                    if(resultTemp[j]==maxChar) {
                        s = String.format("%d %d-%s", temp.getErrorCount(), temp.getNum(), xuanxiang[j]);
                        output.add(s);
                    }
                }
            }
            for(int i=0;i<output.size();i++){
                System.out.print(output.get(i));
                if(i!=output.size()-1)
                    System.out.print("\n");
            }
        }

    }
}

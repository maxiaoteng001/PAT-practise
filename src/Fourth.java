/*
* 读入n名学生的姓名、学号、成绩，分别输出成绩最高和成绩最低学生的姓名和学号。
输入格式：每个测试输入包含1个测试用例，格式为
  第1行：正整数n
  第2行：第1个学生的姓名 学号 成绩
  第3行：第2个学生的姓名 学号 成绩
  ... ... ...
  第n+1行：第n个学生的姓名 学号 成绩
其中姓名和学号均为不超过10个字符的字符串，成绩为0到100之间的一个整数，这里保证在一组测试用例中没有两个学生的成绩是相同的。

输出格式：对每个测试用例输出2行，第1行是成绩最高学生的姓名和学号，第2行是成绩最低学生的姓名和学号，字符串间有1空格。
输入样例：
3
Joe Math990112 89
Mike CS991301 100
Mary EE990830 95
输出样例：
Mike CS991301
Joe Math990112
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fourth {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        List<Student> students = new ArrayList<>();
        for(int i =0;i<count;i++){
            students.add(new Student(input.next(),input.next(),input.nextInt()));
        }
        Student first = students.get(0),last= students.get(0);
        //The last student's grade is the highest.
        //The first student's grade is the lowest.
        for(int i = 1;i<students.size();i++){
            Student S = students.get(i);
            if (S.compareTo(first) < 0) {
                first = S;
            }
            if(S.compareTo(last)>0){
                last = S;
            }
        }

        System.out.println(last);
        System.out.println(first);


    }
}

class Student implements Comparable<Student>{
    private String name ="";
    private String id = "";
    private int grade = 0;

    public Student(String name, String id, int grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public int compareTo(Student o) {
        if(this.getGrade()>o.getGrade()){
            return 1;
        }else if(this.getGrade()<o.getGrade())
            return -1;
        return 0;
    }

    @Override
    public String toString() {
        return name + " " + id ;
    }
}
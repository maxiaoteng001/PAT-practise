import java.util.*;

public class Test58 {
    private static class Question implements Comparable<Question>{
        int score;
        int errorCount ;
        String result;
        int num;


        public Question(int num) {
            this.score = 0;
            this.errorCount = 0;
            this.result = "";
            this.num = num;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getErrorCount() {
            return errorCount;
        }

        public void setErrorCount() {
            this.errorCount ++;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        @Override
        public int compareTo(Question o) {
            return o.errorCount-this.getErrorCount();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        input.nextLine();
        List<Question> questions = new ArrayList<>();
        String temp;
        String s;
        String[] as;
        int totalScore;
        for(int i=0;i<m;i++){
            s = input.nextLine();
            as = s.split(" ");
            Question q = new Question(i+1);
            q.setScore(Integer.parseInt(as[0]));
            temp = q.getResult();
            for(int j=0;j<Integer.parseInt(as[2]);j++){
                temp += as[3+j];
            }
            q.setResult(temp);
            questions.add(q);
        }
        for(int i=0;i<n;i++){
            s = input.nextLine();
            s = s.replace("(","");
            s = s.replace(")","%");
            as = s.split("%");
            String[] as1 ;
            totalScore =0;
            int k=0;
            for(int z=0;z<m;z++) {
                as1 = as[z].trim().split(" ");
                temp = "";
                for (int j = 1; j <= Integer.parseInt(as1[0]); j++) {
                    temp += as1[j];
                }
                if(temp.equals(questions.get(z).getResult())){
                    totalScore += questions.get(z).getScore();
                }else
                    questions.get(z).setErrorCount();
            }
            System.out.println(totalScore);
        }
        Collections.sort(questions);
        if(questions.get(0).getErrorCount()==0)
            System.out.print("Too simple");
        else{
            System.out.print(questions.get(0).getErrorCount());
            for(int i=0;i<m;i++){
                if(questions.get(i).getErrorCount()==questions.get(0).getErrorCount())
                    System.out.print(" "+questions.get(i).getNum());
                else
                    break;
            }
        }
    }
}

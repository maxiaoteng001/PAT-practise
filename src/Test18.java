import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test18 {

    private static class Score{
        private int win;
        private int lose;
        private int draw;
        private int[] gesture;

        public Score() {
            this.win = 0;
            this.lose = 0;
            this.draw = 0;
            /*0--C  1--J  2--B*/
            this.gesture = new int[]{0, 0, 0};
        }
        public void setWin() {
            this.win ++;
        }

        public void setLose() {
            this.lose ++;
        }

        public void setDraw() {
            this.draw ++;
        }
        public void setGesture(int i) {
            if(i=='B')
                this.gesture[0]++;
            else if(i=='C')
                this.gesture[1]++;
            else if(i=='J')
                this.gesture[2]++;
        }
        @Override
        public String toString() {
            return win+" "+draw+" "+lose+"\n";
        }

        public char getMostWinGesture(){
            int max =0;
            int result =0;
            for(int i=0;i<3;i++){
                if(gesture[i]>max){
                    max=gesture[i];
                    result =i;
                }
            }
            /*for(int i=0;i<3;i++){
                if(gesture[i]==max){
                    if(i==0)
                        result ='B';
                    else if(i==1)
                        result ='C';
                    else
                        result ='J';
                    break;
                }
            }*/
            //此处代码重构
            return result==0?'B':result==1?'C':'J';
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(input.readLine());
        Score as = new Score();
        Score bs = new Score();
        int aGesture,bGesture;
        String s ;
        String[] temp ;
        for(int i=0;i<n;i++){
            s = input.readLine();
            temp = s.split(" ");
            aGesture = temp[0].charAt(0);
            bGesture = temp[1].charAt(0);
            if(aGesture==bGesture){
                as.setDraw();
                bs.setDraw();
            }else if(aGesture=='C' && bGesture=='J' ||
                    aGesture=='J' && bGesture=='B' ||
                    aGesture=='B' && bGesture=='C'){
                as.setWin();
                as.setGesture(aGesture);
                bs.setLose();
            }else if(bGesture=='C' && aGesture=='J' ||
                    bGesture=='J' && aGesture=='B' ||
                    bGesture=='B' && aGesture=='C'){
                bs.setWin();
                bs.setGesture(bGesture);
                as.setLose();
            }
        }
        System.out.print(as+""+bs);
        System.out.print(as.getMostWinGesture()+" "+bs.getMostWinGesture());
    }
}

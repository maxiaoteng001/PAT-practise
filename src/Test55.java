import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test55 {
    private static class People implements Comparable<People>{
        String name;
        int height;

        public People(String name, int height) {
            this.name = name;
            this.height = height;
        }

        public String getName() {
            return name;
        }

        public int getHeight() {
            return height;
        }

        @Override
        public int compareTo(People o) {
            return this.getHeight()==o.getHeight()? this.name.compareTo(o.name) : -this.getHeight() + o.getHeight();
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        String[] as = s.split(" ");
        int n = Integer.parseInt(as[0]);
        int k = Integer.parseInt(as[1]);
        List<People> list = new ArrayList<>();
        People temp;
        for(int i=0;i<n;i++){
            s = input.readLine();
            as = s.split(" ");
            temp = new People(as[0], Integer.parseInt(as[1]));
            list.add(temp);
        }
        Collections.sort(list);
        String line;
        int pn = n/k;
        int lastNum=pn+n%k;
        int lineLength =0;
        int z=0;
        for(int i=0;i<k;i++){
            line="";
            if(i==0){
                lineLength = lastNum;
            }else
                lineLength = pn;
            for(int j=0;j<lineLength;j++){
                if(j==0)
                    line += list.get(z++).getName();
                else if(j%2!=0){
                    line = list.get(z++).getName()+" "+line;
                }else
                    line = line + " " +list.get(z++).getName();
            }
            System.out.print(line);
            if(i!=pn-1){
                System.out.println();
            }
        }
    }
}

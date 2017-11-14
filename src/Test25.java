import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test25 {
    private static class Node implements Comparable<Node>{
        private String current;
        private String next;
        private int ID;

        public Node(String current, int ID, String next) {
            this.current = current;
            this.next = next;
            this.ID = ID;
        }

        public String getCurrent() {
            return current;
        }

        public String getNext() {
            return next;
        }

        public int getID() {
            return ID;
        }

        @Override
        public String toString() {
            return this.getCurrent()+" "+this.getID()+" "+this.getNext();
        }

        @Override
        public int compareTo(Node o) {
            return this.ID-o.ID;
        }
    }
    public static void main(String[] args) throws IOException {
        /*Scanner input = new Scanner(System.in);
        String first = input.next();
        int n = input.nextInt();
        int k = input.nextInt();*/
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        String[] as = s.split(" ");
        String first = as[0];
        int n = Integer.parseInt(as[1]);
        int k = Integer.parseInt(as[2]);
        List<Node> all = new ArrayList<>();
        Node temp;
        for(int i=0;i<n;i++){
            s= input.readLine();
            as = s.split(" ");
            temp = new Node(as[0],Integer.parseInt(as[1]),as[2]);
            all.add(temp);
        }

        Collections.sort(all);
        for(int i=0;i<all.size()-1;i++){
            temp = all.get(i);
            Node temp2 = all.get(i+1);
            if(temp.getID()==1 && !temp.getCurrent().equals(first)){
                all.remove(i--);
            }
            else if(!temp.getNext().equals(temp2.getCurrent())){
                all.remove(i+1);
                i--;
            }
        }
        List<Node> result = new ArrayList<>();
        if(n<k){
            result = all;
        }else {
            while (all.size() > k ) {
                first = all.get(k).getCurrent();
                for (int i = k - 1; i >= 0; i--) {
                    temp = all.get(i);
                    if (i == 0)
                        result.add(new Node(temp.getCurrent(), temp.getID(), first));
                    else
                        result.add(new Node(temp.getCurrent(), temp.getID(), all.get(i - 1).getCurrent()));
                    all.remove(i);
                }
            }

            if(all.size()<k){
                for (int i = 0; i <all.size(); i++) {
                    result.add(all.get(i));
                }
            }else{
                for (int i = k-1; i >= 0; i--) {
                    temp = all.get(i);
                    if (i == 0)
                        result.add(new Node(temp.getCurrent(), temp.getID(), "-1"));
                    else
                        result.add(new Node(temp.getCurrent(), temp.getID(), all.get(i - 1).getCurrent()));
                    all.remove(i);
                }
            }
        }
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i));
            if(i!=n-1)
                System.out.print("\n");
        }
    }
}

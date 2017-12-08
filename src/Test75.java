import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test75{
    private static class Node{
        String address ;
        int data;
        String next;

        public Node(String address, int data, String next) {
            this.address = address;
            this.data = data;
            this.next = next;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public String getNext() {
            return next;
        }

        public void setNext(String next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return address + " " + data + " " + next;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        String[] as = s.split(" ");
        String first = as[0];
        int n = Integer.parseInt(as[1]);
        int k = Integer.parseInt(as[2]);
        Map<String,Node> map = new HashMap<>();
        for(int i=0;i<n;i++){
            s = input.readLine();
            as = s.split(" ");
            map.put(as[0],new Node(as[0],Integer.parseInt(as[1]),as[2]));
        }
        List<Node> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(map.get(first));
            if(map.get(first).getNext()!="-1")
                first = map.get(first).getNext();
            else
                break;
        }
        List<Node> result = new ArrayList<>();
        Node temp;
        for(int i=0;i<list.size();i++){
            temp = list.get(i);
            if(temp.getData()<0){
                result.add(temp);
            }
        }
        for(int i=0;i<list.size();i++){
            temp = list.get(i);
            if(temp.getData()>=0&&temp.getData()<=k){
                result.add(temp);
            }
        }
        for(int i=0;i<list.size();i++){
            temp = list.get(i);
            if(temp.getData()>k){
                result.add(temp);
            }
        }
        String next ;
        for(int i=0;i<result.size();i++){
            if(i!=result.size()-1){
                next = result.get(i+1).getAddress();
                result.get(i).setNext(next);
                System.out.println(result.get(i));
            }else if(i==result.size()-1){
                result.get(i).setNext("-1");
                System.out.print(result.get(i));
            }
        }
    }
}

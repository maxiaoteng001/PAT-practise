import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test28 {
    private static class Person implements Comparable<Person>{
        private String name;
        private String date;

        public Person(String name, String date) {
            this.name = name;
            this.date = date;
        }

        public String getName() {
            return name;
        }

        public String getDate() {
            return date;
        }

        @Override
        public int compareTo(Person o) {
            return this.getDate().compareTo(o.getDate());
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(input.readLine());
        String s ;
        String youngestDate ="2014/09/06";
        String oldestDate = "1814/09/06";
        String[] as;
        Person young=null,old =null;
        List<Person> all = new ArrayList<>();
        Person temp;
        for(int i=0;i<n;i++){
            s=input.readLine();
            as = s.split(" ");
            if(as[1].compareTo(oldestDate)<0 ||
                    as[1].compareTo(youngestDate)>0)
                continue;
            temp = new Person(as[0],as[1]);
            all.add(temp);
        }
        Collections.sort(all);
        System.out.print(all.size()+" "+all.get(0).getName()+" "+all.get(all.size()-1).getName());
    }
}

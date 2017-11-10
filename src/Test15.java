import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Test15 {
    private static class Student implements Comparable<Student>{
        private String ID;
        private int ability;//德
        private int integrity;//才
        /*--0 代表德才兼备（both ability and integrity）
        ----1代表德胜于才
        ----2代表德才兼亡
        ----3代表其他考生---*/
        private int isBoth;

        public Student(String ID, int ability, int integrity) {
            this.ID = ID;
            this.ability = ability;
            this.integrity = integrity;
        }

        public void setIsBoth(int isBoth) {
            this.isBoth = isBoth;
        }

        public String getID() {
            return ID;
        }

        public int getAbility() {
            return ability;
        }

        public int getIntegrity() {
            return integrity;
        }

        public int getTotal() {
            return ability+integrity;
        }

        public int getIsBoth() {
            return isBoth;
        }

        @Override
        public String toString() {
            return ID+" "+ability+" "+integrity;
        }

        //Descending order
        @Override
        public int compareTo(Student o) {
            if(this.getTotal()>o.getTotal())
                return -1;
            else if(this.getTotal()<o.getTotal())
                return 1;
            else if(this.getTotal()==o.getTotal()){
                if(this.getAbility()>o.getAbility())
                    return -1;
                else if(this.getAbility()<o.getAbility())
                    return 1;
                else
                    return this.getID().compareTo(o.getID());
            }
            return 0;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(
                new InputStreamReader(System.in));
        String s = input.readLine();
        String[] as = s.split(" ");
        int N = Integer.parseInt(as[0]);
        int L = Integer.parseInt(as[1]);
        int H = Integer.parseInt(as[2]);
        ArrayList<Student> all0 = new ArrayList<>();
        ArrayList<Student> all1 = new ArrayList<>();
        ArrayList<Student> all2 = new ArrayList<>();
        ArrayList<Student> all3 = new ArrayList<>();
        int passCount =0;
        Student temp;
        for(int i=0;i<N;i++){
            s = input.readLine();
            as = s.split(" ");
            temp = new Student(as[0],Integer.parseInt(as[1]),Integer.parseInt(as[2]));
            if(temp.getAbility()>=L && temp.getIntegrity()>=L) {
                if(temp.getAbility()>=H && temp.getIntegrity()>=H){
                    temp.setIsBoth(0);
                    all0.add(temp);
                }
                else if(temp.getAbility()>=H && temp.getIntegrity()<H) {
                    temp.setIsBoth(1);
                    all1.add(temp);
                }
                else if(temp.getAbility()<H && temp.getIntegrity()<H && temp.getAbility()>=temp.getIntegrity()){
                    all2.add(temp);
                    temp.setIsBoth(2);
                }
                else{
                    temp.setIsBoth(3);
                    all3.add(temp);
                }
            }
        }
        passCount = all0.size()+all1.size()+all2.size()+all3.size();
        System.out.println(passCount);
        Collections.sort(all0);
        Collections.sort(all1);
        Collections.sort(all2);
        Collections.sort(all3);

        for(int i=0;i<all0.size();i++){
            System.out.println(all0.get(i));
        }
        for(int i=0;i<all1.size();i++){
            System.out.println(all1.get(i));
        }
        for(int i=0;i<all2.size();i++){
            System.out.println(all2.get(i));
        }
        for(int i=0;i<all3.size();i++){
            System.out.println(all3.get(i));
        }

    }

}

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test20 {
    private static class Mooncake implements Comparable<Mooncake>{
        private int stock;
        private int price;
        private double everge;

        public Mooncake(int stock) {
            this.stock = stock;
            this.price = 0;
            this.everge = 0;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void setEverge() {
            everge = (double)price/stock;
        }

        public int getStock() {
            return stock;
        }

        public int getPrice() {
            return price;
        }

        public double getEverge() {
            return everge;
        }

        @Override
        public int compareTo(Mooncake o){
            int result =0;
            if(this.getEverge()>o.getEverge())
                result=-1;
            else if(this.getEverge()<o.getEverge()){
                result=1;
            }else {
                if(this.getStock()>o.getStock())
                    result = -1;
                else
                    result = 1;
            }
            return result;
        }

    }
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int total = input.nextInt();
        ArrayList<Mooncake> all = new ArrayList<Mooncake>();
        Mooncake temp;
        for(int i=0;i<n;i++){
            temp = new Mooncake(input.nextInt());
            all.add(temp);
        }
        for(int i=0;i<n;i++){
            all.get(i).setPrice(input.nextInt());
            all.get(i).setEverge();
        }
        Collections.sort(all);
        double result =0;
        while(total>0){
            temp=all.get(0);
            if(temp.getStock()<total){
                result += temp.getPrice();
                total -= temp.getStock();
                all.remove(temp);
            }else if(temp.getStock()>total){
                result += total * temp.getEverge();
                total =0;
            }else{
                total =0;
                result += temp.getPrice();
            }
        }
        System.out.printf("%.02f",result);
    }
}

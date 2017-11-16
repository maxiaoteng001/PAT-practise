import java.util.Scanner;

public class Test33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1=input.nextLine();
        String s2=input.nextLine();
        //大写无法输出
        if(s1.contains("+")){
            /*for(int i=0;i<s2.length();i++){
                if(s2.charAt(i)>='A'&&s2.charAt(i)<='Z'){
                    s2 = s2.replace(s2.charAt(i),' ');
                }

            }*/
            s2 = s2.replaceAll("[A-Z]","");
            s1 =s1.replace("+","");
        }
        for(char e:s1.toCharArray()) {
            e = Character.toUpperCase(e);//多转换一次，少判断语句
            if (e >='A' && e <= 'Z') {
                s2 = s2.replace((char) (e - 'A' + 'a'), ' ');
                s2 = s2.replace(e, ' ');
            } else
                s2 = s2.replace(e,' ');
        }
        s2 = s2.replace(" ","");
        System.out.print(s2);
    }
}

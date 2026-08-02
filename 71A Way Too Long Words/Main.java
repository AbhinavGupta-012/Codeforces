import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0){
            String s = sc.next();
            if (s.length() <= 10){
                System.out.println(s);
            }
            else{
                int length = s.length();
                System.out.println(s.charAt(0) + "" + (length - 2) + "" + s.charAt(length - 1));
            }
            n--;
        }
    }
}
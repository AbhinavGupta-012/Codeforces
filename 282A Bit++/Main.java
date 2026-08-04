import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int n = sc.nextInt();
        while (n > 0){
            String s = sc.next();
            if (s.charAt(1) == '-'){
                x--;
            }
            else{
                x++;
            }
            n--;
        }
        System.out.println(x);
    }
}
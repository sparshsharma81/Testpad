// package Decode Enemy Message;
import java.util.*;
public class Decode {
    public static void check(String s){
        String[] s1 = s.split("\\s+");
        for(String a : s1){
            StringBuilder sb = new StringBuilder(a);
            System.out.println(sb.reverse());
            
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n--!=0){
            String s1 = sc.nextLine();
            // System.out.prointln(check(s1));
        }
    }
}

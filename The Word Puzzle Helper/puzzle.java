// package The Word Puzzle Helper;
import java.util.*;
public class puzzle {
    public static void perm(String s, String up,PriorityQueue<String>a1){
       
        if(up.length() == 0){
            // System.out.print(s+" ");
            a1.add(s);
        return;
     }
        char ch = up.charAt(0);
        for(int i =0;i<=s.length();i++){
            String f = s.substring(0,i);
            String s1 = s.substring(i);
            perm(f+ch+s1,up.substring(1),a1);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // HashSet<String>a1 = new HashSet<>();
        PriorityQueue<String>a1 = new PriorityQueue<>();

        perm("",s,a1);
        System.out.println(a1);
    }
}

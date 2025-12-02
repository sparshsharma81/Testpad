// package Heena counting characters;
import java.util.*;
public class heena {
    public static void main(String args[]){
        String s = "helloworld";
        HashMap<Character,Integer>h1 = new HashMap<>();
        for(char c : s.toCharArray()){
            h1.put(c,h1.getOrDefault(c,0)+1);
        }
        ArrayList<Map.Entry<Character,Integer>>map = new ArrayList<>(h1.entrySet());
        Collections.sort(map,(a,b)->a.getKey() - b.getKey());
        String s4 = "";
        for(Map.Entry<Character,Integer>h : map){
            s+=h.getKey();
            s+=h.getValue();
            s+=" ";
        }      
        System.out.println(s4.substring(0,s4.length()-1));

    }
}

// package Make a group of competition;
import java.util.*;
public class group {
    public static void perm(int[] nums, ArrayList<Integer>h,ArrayList<ArrayList<Integer>>h1,int i){
        if(i == nums.length){
            h.add(nums[i]);
        }

        int a = nums[i];
        perm(nums,h,h1,i+1);
        h.add(a);
        perm(nums,h,h1,i+1);      
        h.remove(h.size()-1);  
    }
    public static void main(String[] args) {
        //in this quetion..we basically need to create permutations
        int[] nums = {1,2,3};
        //we need to form all the permutations of all the subsets
        ArrayList<ArrayList<Integer>>h1 = new ArrayList<>();
        ArrayList<Integer>h = new ArrayList<>();
        perm(nums,h,h1,0);
    }
}

// package The Shoe Show Inventory;

import java.util.*;
public class shoe {
    public static int solve(int[] arr, int n){
        
        Arrays.sort(arr);
        ArrayList<Integer>h1 = new ArrayList<>();
        int a = arr[0];
        int b = arr[arr.length-1];
        if(n < a || n > b)return -1;
        for(int i : arr)h1.add(i);
        int n1 = Collections.binarySearch(h1, n);

        if(h1.size() == 0)return -1;

        if(n1 >0)return h1.get(n1);

        if(n1 < 0)n1 = -n1 +1;
        //this n1 will give upper bound 
        int k1;
        if(n1 > h1.size()){
            return -1;
            // k1 = h1.get(h1.size()-1);
        }
        else k1 =  h1.get(n1);

        int min = Integer.MAX_VALUE;
        int before = Math.abs(k1 - n);
        int after = Math.abs(k1 - n1);
        return Math.max(before,after);
        // min = Math.min(min,Math.abs(k1))
        // return 1;

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        while(a-- !=0){
            int b = sc.nextInt();
            int[] arr = new int[b];

            for(int i =0;i<b;i++){
                arr[i] = sc.nextInt();
            }
            int n = sc.nextInt();
            System.out.println(solve(arr,n));
            

        }
    }
}

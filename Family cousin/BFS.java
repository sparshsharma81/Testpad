package Exam;

import java.util.ArrayList;
 

public class BFS {
    
    
    static class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}
    public static ArrayList<Integer> bfs(Node root,java.util.ArrayList<ArrayList<Integer>>result,int target){
        if(root == null)return new ArrayList<>();
        //nikal pehli fursat me 
        java.util.Queue<Node>q = new java.util.ArrayDeque<>();
        ArrayList<ArrayList<Integer>>fin = new ArrayList<>();
        //we will note the brohter of target node 
        int bro = -1;
        q.add(root);
        int level =1;
        int req = level;
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> h1 = new ArrayList<>();
            
            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                if (curr == null) continue;
                h1.add(curr.data);

                

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
                if(curr.left !=null && curr.left.data == target){
                    bro = (curr.right != null) ? curr.right.data : -1;
                    req = level;
                }
                if(curr.right !=null && curr.right.data == target){
                    bro = (curr.left != null) ? curr.left.data : -1;
                    req = level;
                }
            }
            // add the level we built into the caller-provided result list
            result.add(h1);
            level++;
        
        }
        ArrayList<Integer>ans = new ArrayList<>();
            if(bro != -1){
                //now we have noted the thing...
                for(ArrayList<Integer>h : result){
                    if(req ==0){
                        //this is our requred row
                        for(int i : h){
                            if(i != target && i!= bro){
                                ans.add(i);
                            }
                        }

                    }
                    req--;
                }
               
            }
            return ans;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        java.util.ArrayList<ArrayList<Integer>>result = new java.util.ArrayList<>();
        ArrayList<Integer>an1 = new ArrayList<>();
        int target = 6; //we need to return all the cousions of 6
        an1 = bfs(root, result, target); //now we will write code to print the bfs of this
        //now in this question..we need to search for a particular element and return all its cousions

        System.out.println(an1);


        //this will give the answer

    }
    
}

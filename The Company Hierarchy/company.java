// package The Company Hierarchy;/

public class company {
    class Node {
        int data;
        Node left, right;
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    public static void count(Node root, int[] count) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            count[0]++; // Leaf node (Worker)
        } else {
            count[1]++; // Non-leaf node (Manager)
        }
        count(root.left, count);
        count(root.right, count);
    }
    public static void main(String args[]){
        /*
         Q1.  The Company Hierarchy
 You have the organization chart of a company.
 Managers (Non-Leaf Nodes): These are employees who manage at least one other person (they have subordinates below them).
 Workers (Leaf Nodes): These are the "boots on the ground" employees who do not manage anyone (they are at the bottom of the chart).
 Your task is to analyze the chart and count exactly how many Workers (Leaves) and how many Managers (Non-Leaves) are in the company.
 Input Format:
 First line contains the total number of employees. Second line contains the employee IDs listed level by level.
 Output Format:
 Print the number of Workers followed by the number of Managers.
 Sample Input
 6
 1 2 3 4 5 6
 Sample Output
 3 3
 Explanation
 The above tree is:
        1
       / \
      2    3
     / \  /
    4  5 6
 ANSWER

         */
    }
}

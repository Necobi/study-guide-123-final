public class FinalPractice {
    public static void main(String[] args) {
        // Feel free to call your methods here to experiment

        // YOU MUST ALSO MAKE THOROUGH TESTS FOR EVERY METHOD 
    }

    /**
     * Return the sum of the values at odd indexes in a linked list.
     * 
     * Assumes head is at index 0.
     * 
     * If passed a null head, returns 0.
     * 
     * @param head the head of the linked list
     * @return the sum of the values at odd indexes
     */
    public static int oddIndexSum(ListNode head) {
        // TODO: implement this AND MAKE MORE UNIT TESTS FOR IT
        ListNode current = head;
        int sum =0;
        int count =0;
        while(current!=null){
            count++;
            current=current.next;
        }
        ListNode toAdd = head;
        for(int i =0; i<count; i++){
            if(i%2!=0){
                toAdd=toAdd.next;
                sum+=toAdd.data;
                
            }
        }
        return sum;
    }

    // TODO: implement the rest of the study guide AND MAKE GOOD UNIT TESTS
    public static int largestOfLast3Values(ListNode head){
        ListNode current = head;
        if(head.next==null) return head.data;
       // int count =0;
        int biggest =0;
        while(current.next.next.next!=null){
            current=current.next;
        }
        if(current.data>biggest){
            biggest=current.data;
        }
        return biggest;
    }
    public static int evenLeafNodeSum(TreeNode root){
        if(root==null) return 0;
        int sum =0;
        int sumLeft = evenLeafNodeSum(root.left);
        int sumRight = evenLeafNodeSum(root.right);
        if(root.left==null&&root.right==null){
            if(root.data%2==0){
                sum+=root.data;
            }else{
                return 0;
            }
        }
        return sum+sumLeft+sumRight;
    }

    public static int oddBranchSum(TreeNode root){
        if(root==null) return 0;
        int sum =0;
        int sumLeft= oddBranchSum(root.left);
        int sumRight =oddBranchSum(root.right);
        if(root.left!=null||root.right!=null){
            if(root.data%2!=0){
                sum+=root.data;
            }
        }
        return sum+sumLeft+sumRight;
    }
}

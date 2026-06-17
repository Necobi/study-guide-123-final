import java.util.HashMap;
import java.util.Map;

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
        int index =0;
        while(current!=null){
            if(index%2!=0){
                sum+=current.data;
            }
            current=current.next;
            index++;
        
            
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
        biggest=current.data;
        if(current.next.data>biggest){
            biggest=current.next.data;
        }
        if(current.next.next.data> biggest){
            biggest = current.next.next.data;
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

    public static Map<Integer,Integer> valueCount(ListNode head){
        Map<Integer,Integer> count = new HashMap<>();
        ListNode current = head;
        //int oldValue = 0;
        while(current!=null){
            if(!count.containsKey(current.data)){
                count.put(current.data,1);
                //oldValue=1;

            }else{
                int oldCount = count.get(current.data);
                int newCount=oldCount+1;
                count.put(current.data,newCount );
            }
            current=current.next;
        }
        return count;
        
    }
}

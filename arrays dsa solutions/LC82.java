import java.lang.classfile.components.ClassPrinter.ListNode;

public class LC82 {
    
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy =new ListNode(0);
        dummy.next=head;
        ListNode pre = dummy;
        while (head!=null){
            if( head.next!=null && head.next.val==head.val ){
                while( head.next!=null && head.next.val==head.val ){
                    head=head.next;
                }
                pre.next=head.next;
            }else{
                pre=pre.next;
            }
            head=head.next;
        }
        return dummy.next;
        


    }
}

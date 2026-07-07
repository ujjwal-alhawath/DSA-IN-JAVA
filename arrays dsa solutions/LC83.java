import java.lang.classfile.components.ClassPrinter.ListNode;

public class LC83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pre = head;
      while(pre!=null && pre.next!=null){
        if(pre.next.val==pre.val){
            pre.next=pre.next.next;
        }
        else{
            pre=pre.next;
        }
      }
      return head;
        
    }
  
    public static void main(String[] args) {
        LC83 obj = new LC83();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        ListNode result = obj.deleteDuplicates(head);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

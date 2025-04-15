public class _203_Remove_Linked_List_Elements {
    
    //solution 1 new head O(n)
    // public ListNode removeElements(ListNode head, int val) {
    //     ListNode head2 = null;
    //     ListNode tall = null;
    //     while(head != null){
    //         if (head.val != val) {
    //         ListNode newNode = new ListNode(head.val); 
    //         if(head2 == null){
    //             head2 = newNode;
    //             tall = newNode;
    //         }else{
    //             tall.next = newNode;
    //             tall = tall.next;
    //         }
    //         }
    //         head = head.next;
    //     }
    // return head2;
    // }

    //solution 2 prev, cur, next
    // public ListNode removeElements(ListNode head, int val) {
    //     ListNode dummy = new ListNode(-1);
    //     dummy.next = head;
    //     ListNode prev = dummy;
    //     ListNode cur = head;
    //     ListNode next = null;

    //     while(cur != null){
    //         if(cur.val == val){
    //             next = cur.next;
    //             prev.next = next;
    //         }else{
    //             prev = prev.next;
    //         }

    //         cur = cur.next;
    //     }
    //     return dummy.next;
    // }
}

public class _83_Remove_Duplicates_from_Sorted_List {
    // public ListNode deleteDuplicates(ListNode head) {
    //     ListNode curN = head;
    //     ListNode temp = null;

    //     while(curN != null && curN.next != null){
    //         if(curN.val == curN.next.val){
    //             temp = curN.next.next;
    //             curN.next = temp;
    //         }else{
    //             curN = curN.next;
    //         }
    //     }
    //     return head;
    // }

    // public ListNode deleteDuplicates(ListNode head) {
    //     ListNode current = head;

    //     while (current != null && current.next != null) {
    //         if (current.val == current.next.val) {
    //             current.next = current.next.next; 
    //         } else {
    //             current = current.next; 
    //         }
    //     }

    //     return head;
    // }
}

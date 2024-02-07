class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode previous = null; 

        while(head != null){
            ListNode temp = head.next; 
            head.next = previous; 
            previous = head; 
            head = temp; 

        }

        return previous; 
    }
}

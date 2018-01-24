public class Solution {

     public class ListNode {
         int val;
        ListNode next;
        ListNode(int x) { val = x; }
        }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current1 = l1;
        ListNode current2 = l2;
        ListNode prev = null;
        ListNode head = null;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        int carry = 0;
        while (current1 != null && current2 != null) {
            int sum = current1.val + current2.val + carry;
            carry = sum / 10;
            sum = sum % 10;
            ListNode result = new ListNode(sum);
            if (prev == null) {
                head = result;
                prev = result;
            } else {
                prev.next = result;
                prev = prev.next;
                result.next = null;
            }

            current1 = current1.next;
            current2 = current2.next;
        }
        while (current1 != null) {
            int sum = current1.val + carry;
            carry = sum / 10;
            sum = sum % 10;
            ListNode result = new ListNode(sum);
            prev.next = result;
            prev = prev.next;
            current1 = current1.next;
        }
        while (current2 != null) {
            int sum = current2.val + carry;
            carry = sum / 10;
            sum = sum % 10;
            ListNode result = new ListNode(sum);
            prev.next = result;
            prev = prev.next;
            current2 = current2.next;
        }
        if (carry == 1) {
            prev.next = new ListNode(carry);
            prev = prev.next;
        }
        return head;

    }
}
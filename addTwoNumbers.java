//LeetCode Problem N0. 2

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {  // Base case: if all are null and no carry, return null
            return null;
        }

        int sum = carry;  // Start with the carry value
        if (l1 != null) {
            sum += l1.val;  // Add the value of the current node in l1, if present
            l1 = l1.next;  // Move to the next node in l1
        }
        if (l2 != null) {
            sum += l2.val;  // Add the value of the current node in l2, if present
            l2 = l2.next;  // Move to the next node in l2
        }

        ListNode result = new ListNode(sum % 10);  // Create a new node with the digit value
        result.next = addTwoNumbers(l1, l2, sum / 10);  // Recursive call with the next nodes and carry
        return result;  // Return the result node
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);  // Initial call with carry 0
    }
}

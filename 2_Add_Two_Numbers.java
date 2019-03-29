/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum = 0;
        ListNode result = new ListNode(0);
        ListNode Result = result;        
        int a, b;        
        while (true){
            a = l1.val;
            b = l2.val;
            sum = a + b + carry;
            carry = 0;                            
            if (sum > 9){
                carry = 1;
                result.next = new ListNode(sum%10);
            }else{
                result.next = new ListNode(sum);
            }                  
            result = result.next;                
            if(l1.next==null && l2.next==null){
                if (carry == 0)
                    break;
            }   
            l1 = (l1.next == null)? new ListNode(0):l1.next;
            l2 = (l2.next == null)? new ListNode(0):l2.next;                        
        }        
        return Result.next;
    }
}

//Runtime: 2 ms, faster than 99.64% of Java online submissions for Add Two Numbers.
//Memory Usage: 45.8 MB, less than 55.97% of Java online submissions for Add Two Numbers.
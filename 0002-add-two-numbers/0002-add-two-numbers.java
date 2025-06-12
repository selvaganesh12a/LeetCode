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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(); // ans linkedlist
        ListNode head = ans; // returning the head of the ans linkedlist

        ListNode temp = l1;
        int len1 = 0;
        while(temp != null){
            len1++;
            temp = temp.next;
        }
        
        temp = l2;
        int len2 = 0;
        while(temp != null){
            len2++;
            temp = temp.next;
        }

        if(len1 == len2){  
            ListNode temp1 = l1;
            ListNode temp2 = l2;
            int carry = 0;
            while(len1 > 0){
                int a = temp1.val;
                int b = temp2.val;
                int c = a+b+carry;

                if(c >= 10){
                    carry = c / 10;
                    c %= 10;
                }else{
                    carry = 0;
                }
                ListNode newNode = new ListNode(c);
                ans.next = newNode;
                ans = ans.next;

                len1--;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }

            if(carry == 1){
                ListNode newNode = new ListNode(carry);
                ans.next = newNode;
                ans = ans.next;
            }
            
        }else if(len1 > len2){
            ListNode temp1 = l1;
            ListNode temp2 = l2;
            int carry = 0;
            while(len2 > 0){
                int a = temp1.val;
                int b = temp2.val;
                int c = a+b+carry;

                if(c >= 10){
                    carry = c / 10;
                    c %= 10;
                }else{
                    carry = 0;
                }
                ListNode newNode = new ListNode(c);
                ans.next = newNode;
                ans = ans.next;

                len2--;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }

            while(temp1 != null){
                int a = temp1.val;
                int c = a+carry;
                if(c >= 10){
                    carry = c / 10;
                    c %= 10;
                }else{
                    carry = 0;
                }
                ListNode newNode = new ListNode(c);
                ans.next = newNode;
                ans = ans.next;
                temp1 = temp1.next;
            }

            if(carry == 1){
                ListNode newNode = new ListNode(carry);
                ans.next = newNode;
                ans = ans.next;
            }

        }else{
            ListNode temp1 = l1;
            ListNode temp2 = l2;
            int carry = 0;
            while(len1 > 0){
                int a = temp1.val;
                int b = temp2.val;
                int c = a+b+carry;

                if(c >= 10){
                    carry = c / 10;
                    c %= 10;
                }else{
                    carry = 0;
                }
                ListNode newNode = new ListNode(c);
                ans.next = newNode;
                ans = ans.next;

                len1--;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }

            while(temp2 != null){
                int a = temp2.val;
                int c = a+carry;
                if(c >= 10){
                    carry = c / 10;
                    c %= 10;
                }else{
                    carry = 0;
                }
                ListNode newNode = new ListNode(c);
                ans.next = newNode;
                ans = ans.next;
                temp2 = temp2.next;
            }

            if(carry == 1){
                ListNode newNode = new ListNode(carry);
                ans.next = newNode;
                ans = ans.next;
            }
        }

        return head.next;
    }
}
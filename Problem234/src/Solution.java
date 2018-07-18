import java.util.AbstractQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Solution {
    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

    }


    ListNode node;
    boolean flag = true;

    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        if (node == null) node = head;

        isPalindrome(head.next);
        if (head.val != node.val) flag = false;
        node=node.next;
        return flag;
    }

}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	
    	if(l1 == null){
    		return l2;
    	}
    	if(l2 == null){
    		return l1;
    	}
    	int num = 0;
    	ListNode  head = null ;
    	ListNode start = null ;
    	while (l1 != null || l2 != null){
    		
        	if(l1  != null){
        		num += l1.val;
        		l1 = l1.next;
        	}
        	if(l2 != null){
        		num += l2.val;
        		l2 = l2.next ;
        	}
        	System.out.println("num  "+num);
        	if(head == null){
        		start = head = new ListNode(num % 10);
        	}else{
        		head.next = new ListNode(num % 10);
        		head = head.next;
        	}
        	num = num /10;
    	}
    	
    	if(num != 0){
    		head.next = new ListNode(num);
    	}
    	
    	
    	
        return start;
    }
    
    

    
    public static void main(String[] args) {
    	
    	ListNode l1 = getListNode(new int []{5});
    	ListNode l2 = getListNode(new int[]{5});
    	ListNode ll = addTwoNumbers(l1,l2);
    	while(ll != null){
    		System.out.println(ll.val);
    		ll= ll.next;
    	}
	}
    
    public static ListNode getListNode(int [] nums){
    	ListNode head,l;
    	head = l = new ListNode(nums[0]);
    	for (int i = 1; i < nums.length; i++) {
			l.next = new ListNode(nums[i]);
			l = l.next;
		}
    	return head;
    }
    
    
}

 class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 
//	int carry =0;
//	 
//    ListNode newHead = new ListNode(0);
//    ListNode p1 = l1, p2 = l2, p3=newHead;
//
//    while(p1 != null || p2 != null){
//        if(p1 != null){
//            carry += p1.val;
//            p1 = p1.next;
//        }
//
//        if(p2 != null){
//            carry += p2.val;
//            p2 = p2.next;
//        }
//
//        p3.next = new ListNode(carry%10);
//        p3 = p3.next;
//        carry /= 10;
//    }
//
//    if(carry==1) 
//        p3.next=new ListNode(1);
//
//    return newHead.next;
 
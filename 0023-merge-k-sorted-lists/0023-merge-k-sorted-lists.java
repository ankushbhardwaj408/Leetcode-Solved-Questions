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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)return null;
        if(lists.length==1)return lists[0];
        ListNode ans=sort(lists,0,lists.length);
        return ans;
       
       
        
        
    }
    public ListNode sort(ListNode[] lists,int s,int e)
    {
        if(e-s==1)return lists[s]; 
       
       
            int mid=s+(e-s)/2;
            ListNode left=sort(lists,s,mid);
            ListNode right=sort(lists,mid,e);
      ListNode ans= merge(left,right);
           
            
        
         return ans;
    }
    public ListNode merge(ListNode node1,ListNode node2)
    {
       ListNode dummy=new ListNode(0);
          ListNode ans=dummy;
        while(node1!=null && node2!=null)
        {
            if(node1.val<node2.val)
            {
               
                ListNode temp=new ListNode(node1.val);
                ans.next=temp;
                ans=ans.next;
                node1=node1.next;
            }else{
                  ListNode temp=new ListNode(node2.val);
                ans.next=temp;
                ans=ans.next;
                 node2=node2.next;
            }
        }
        while(node1!=null)
        {
            ListNode temp=new ListNode(node1.val);
                ans.next=temp;
                ans=ans.next;
             node1=node1.next;
        }
         while(node2!=null)
        {
            ListNode temp=new ListNode(node2.val);
                ans.next=temp;
                ans=ans.next;
              node2=node2.next;
        }
        ans.next=null;
        return dummy.next;
    }
}
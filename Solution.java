class Solution
{
    public ListNode reverseList(ListNode head)
    {
        ListNode currentNode=head;
        ListNode newCurrentNext=null;
        ListNode oldCurrentNext;
        ListNode previousNode=currentNode;
        while(currentNode!=null)
        {
            oldCurrentNext=currentNode.next;
            currentNode.next=newCurrentNext;
            //----------------------
            previousNode=currentNode;
            newCurrentNext=previousNode;
            currentNode=oldCurrentNext;
        }
        return previousNode;
    }
}

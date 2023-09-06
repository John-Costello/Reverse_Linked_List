public class Main
{
    public static void main(String[] args)
    {
        int[] array1 = new int[]{1,4,7};
        int[] array2 = new int[]{2,6,8};
        
        ListNode thisNode, aheadNode;
        thisNode=null; aheadNode=null;
        for(int i=array1.length-1; i>=0; i--)
        {
            if(i==array1.length-1){ thisNode=new ListNode(array1[i]); aheadNode=thisNode; }
            else{ thisNode=new ListNode(array1[i], aheadNode); aheadNode=thisNode; }
        }
        ListNode list1 = thisNode;
        System.out.println("--------------------");
        System.out.println("----- List 1 -------");
        System.out.println("--------------------");
        thisNode=list1;
        do
        {
            if(thisNode!=null){System.out.println(thisNode.val+"     this:("+thisNode+") next:("+thisNode.next+")");
            thisNode=thisNode.next;}
        }while(thisNode!=null);
        
        System.out.println("--------------------");
        System.out.println("----- Reversed List 1 -------");
        System.out.println("--------------------");
        ListNode listReversed =new Solution().reverseList(list1);
        thisNode=listReversed;
        do
        {
            if(thisNode!=null){System.out.println(thisNode.val+"     this:("+thisNode+") next:("+thisNode.next+")");
            thisNode=thisNode.next;}
        }while(thisNode!=null);
        
    }
}

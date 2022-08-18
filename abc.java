import java.util.*;  
public class abc{
	 public static void main(String[] args) { 
        ListNode a=new ListNode(6,null);

        ListNode b=new ListNode(5,a);

        ListNode c=new ListNode(7,b);
        ListNode d=new ListNode(8,c);
        ListNode e=new ListNode(9,d);
        System.out.println(e.getval()+" "+e.getnext().getval()+" "+e.getnext().getnext().getval()+" "+e.getnext().getnext().getnext().getval()+" "+  e.getnext().getnext().getnext().getnext().getval());


    
      
    }
}

  
  

























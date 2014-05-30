
public class InsertionSort {

	public InsertionSort()
	{

	}
	public ListNode sort (ListNode  A)
	{
		if ( A.getNext() == null)
		{
			return A;
		}
		ListNode dummyHead = new ListNode(A , 10000000,null);
		A.setPrev(dummyHead);

		ListNode curr = A.getNext() ;
		while ( curr != null)
		{  
			ListNode temp1  = curr.getNext();
			double key = curr.getData();
			ListNode pre = curr.getPrev();
			System.out.println("prev = " +pre.getData());
			ListNode recordPre = pre;
			while (pre!= dummyHead && pre.getData()>key)
			{

				pre = pre.getPrev();
			}
			if (pre != recordPre )
			{            
				curr.getPrev().setNext((curr.getNext()));
				if( curr.getNext() != null)
				{
					curr.getNext().setPrev(curr.getPrev());
				}
				curr.setNext(pre.getNext());
				pre.getNext().setPrev(curr);
				pre.setNext(curr);
				curr.setPrev((pre));
			}
			curr = temp1;
		}
		return dummyHead.getNext();
	}

}

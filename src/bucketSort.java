
public class bucketSort {
	private ListNode [] B;
	private  int length;
	public bucketSort (double [] A)
	{
		this.B = new ListNode[A.length];
		this.length = A.length;
	}

	public void sort(double [] A)
	{
		InsertionSort test1 = new InsertionSort();
		for ( int i = 0 ; i < this.length;i++)
		{
			if(B[(int)(this.length*A[i])] == null)
			{
				B[(int)(this.length*A[i])] = new ListNode (A[i]);
			}
			else
			{
				ListNode temp = B[(int)(this.length*A[i])];
				while ( temp.getNext() != null)
				{
					temp = temp.getNext();
				}
				ListNode curr = new ListNode(A[i]);
				curr.setPrev(temp);
				temp.setNext(curr);			
			}
		}
		ListNode DummyHead = new ListNode(100000);
		ListNode curr = DummyHead;

		for ( ListNode temp111 : B)
		{
			if (temp111 != null)
			{
				ListNode temp = test1.sort(temp111);
				curr.setNext(temp );
				temp.setPrev(curr);
				while ( temp.getNext() !=null)
				{
					temp = temp.getNext();
				}
				curr = temp;
	        }
		}
		ListNode realhead = DummyHead.getNext();
		int i = 0;
		while (realhead != null)
		{
			A[i] = realhead.getData();
			realhead = realhead.getNext();
			i++;
		}

		
	}



}

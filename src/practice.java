
public class practice {


	public static void main (String args[])
	{
		int[] test = { 5,3,1,6,12,0,-1,2,-3};
		MergeSort sort1 = new MergeSort ();
		sort1.sort(test);
		//for ( int i = 0;i<test.length;i++)
		//{
		//	System.out.println(test[i]);
		//}

		ListNode A = new ListNode(2.0);
		ListNode B = new ListNode(null,1,A);
		A.setNext(B);
		ListNode C = new ListNode(null,-1,B);
		B.setNext(C);
		ListNode D = new ListNode(null,3,C);
		C.setNext(D);
		ListNode temp = A ;
		while (temp!=null)
		{
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
		InsertionSort test4 = new InsertionSort ();
		ListNode real = test4.sort(A);
	    ListNode temp33= real;
	    while ( temp33 != null)
	    {
			System.out.println(temp33.getData());
			temp33 = temp33.getNext();
			
	    }
	    int a= (int)3.22;
		System.out.println(a);

	}
}

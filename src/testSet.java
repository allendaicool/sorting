import java.util.*;

public class testSet {
	public static void main ( String [] args)
	{

		MergeSortLinkedList test1= new MergeSortLinkedList();
		test1.addNode(1,0);
		test1.addNode(2,1);

		test1.addNode(3,2);

		test1.addNode(4,0);
		test1.addNode(5,2);
		test1.addNode(9,2);
		test1.addNode(9,2);
		test1.addNode(3,2);
		test1.addNode(1,4);

		/*System.out.println(out);
	  System.out.println(out2);

	  System.out.println(out3);
	  System.out.println(out4);
	  System.out.println();*/
		/*Integer a = 3;
		Integer b  = 4;
		a= b;
		b=a;
		System.out.println("it is " + a);
		System.out.println("it is " + b);

		if(tt.compareTo(tt1)<0)
		{
			System.out.println("wonderful");
		}*/

		/*MergeSortListNode<Integer> node1 = test1.getHead();
	  while ( node1!= null)
	  {
		  System.out.println(node1.getData());
		  node1= node1.getNext();
	  }*/
		//test1.removeNode(1);
		MergeSortListNode node1 = test1.getHead();

		while ( node1!= null)
		{
			System.out.println(node1.getData());
			node1= node1.getNext();
		}
		System.out.println();
		MergeSortListNode sorted = test1.MergeSortBegin(test1.getHead());
		MergeSortListNode node2 = sorted;

		while ( node2!= null)
		{
			System.out.println(node2.getData());
			node2= node2.getNext();
		}
		//MergeSortListNode middle = test1.findMiddle(test1.getHead(),test1.findLast());
		// int aaa= middle.getData();
		//System.out.println(middle.getData());
		MergeSortListNode sortedNonDuplicate = test1.removeDuplicate(sorted);
		MergeSortListNode node3 = sortedNonDuplicate;
		System.out.println();

		while ( node3!= null)
		{
			System.out.println(node3.getData());
			node3= node3.getNext();
		}

	}
}

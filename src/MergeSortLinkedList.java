
import java.util.*;
import java.io.*;
import java.lang.Integer;

public class MergeSortLinkedList {

	private MergeSortListNode head ;
	private MergeSortListNode  curr;
	private int numItems;

	public  MergeSortLinkedList ()
	{
		this.head = this.curr= null ;
		numItems = 0 ;
	}
	public MergeSortListNode geCurrent ()
	{
		return this.curr;

	}
	public MergeSortListNode getHead ()
	{
		return this.head;
	}
	public void addNode ( Integer data,int pos)
	{
		if ( head == null)
		{
			if ( pos != 0)
			{
				throw new EmptySequenceException(" no element added in yes");
			}
			this.head = new MergeSortListNode (null,data);
			curr = head ;
			numItems++;
		}
		else
		{
			if ( pos<0 || pos > numItems)
			{
				throw new IndexOutOfBoundsException();
			}
			else
			{
				if ( pos == numItems)
				{
					this.curr.setNext(new MergeSortListNode(null,data));
					this.curr = this.curr.getNext();
				}
				else
				{
					MergeSortListNode temp =  this.head;
					for ( int i = 0; i< pos -1 ; i++)
					{
						temp =temp.getNext();		   
					}
					if( pos ==0)
					{
						head = new MergeSortListNode (null,data);
						head.setNext(temp);
						this.curr = head ;
					}
					else
					{
						MergeSortListNode newItem = new MergeSortListNode  (null, data);
						newItem.setNext(temp.getNext());
						temp.setNext(newItem);
						this.curr = newItem;
					}
					//this.curr = this.curr.getNext();
				}
				numItems++;

			}
		}
	}

	private boolean isToleft(MergeSortListNode low, MergeSortListNode high)
	{
		while( low.getNext() != null)
		{
			if ( low == high)
			{
				return true;
			}
		}
		return false;
	}

	public MergeSortListNode MergeSortBegin (MergeSortListNode low)
	{
		if (low == null || low.getNext() == null)
		{
			return low ;
		}
		MergeSortListNode middle = this.findMiddle(low, null);
		MergeSortListNode headSec = middle.getNext();
		middle.setNext(null);
		MergeSortListNode sorted1 = this.MergeSortBegin(low);
		MergeSortListNode  sorted2 = this.MergeSortBegin(headSec);
		MergeSortListNode merged = this.MergeProcess(sorted1 , sorted2);
		return merged;
	}

	// remove the duplicate node, assumption is that the list is in order O(n) complexity.
	public MergeSortListNode removeDuplicate(MergeSortListNode head)
	{
		if ( head ==null)
		{
			throw new EmptySequenceException();
		}
		if ( head.getNext() == null)
		{
			return head;
		}
		else
		{
			MergeSortListNode realHead = head;

			MergeSortListNode temp = head.getNext();
			while(temp != null)
			{
				if ( temp.getData().equals(head.getData()))
				{
					head.setNext(temp.getNext());
					// if use c language, we might need to free the space of duplicate element
					temp=temp.getNext();
				}
				else
				{				
					head = head.getNext();
					temp=temp.getNext();
				}
			}
			return realHead;
		}

	}
	public MergeSortListNode MergeProcess(MergeSortListNode head , MergeSortListNode headSec)
	{
		MergeSortListNode temp1 = head ;
		MergeSortListNode temp2 = headSec ; 
		MergeSortListNode realHead = new MergeSortListNode (100000);
		MergeSortListNode  curr = realHead;
		while(temp1 != null && temp2 != null)
		{
			if  ( temp1.getData().compareTo(temp2.getData())>0)
			{
				curr.setNext(temp2);
				temp2 = temp2.getNext();
			}
			else
			{
				curr.setNext(temp1);
				temp1 = temp1.getNext();
			}
			curr = curr.getNext();
		}
		if( temp1 == null)
		{
			curr.setNext(temp2);
		}
		else
		{
			curr.setNext(temp1);
		}
		return realHead.getNext();
	}

	public MergeSortListNode findLast()
	{
		MergeSortListNode temp = this.head;
		if ( temp == null)
		{
			throw new EmptySequenceException ();
		}
		while ( temp.getNext() != null)
		{
			temp = temp.getNext();
		}
		return temp;
	}

	public MergeSortListNode findMiddle(MergeSortListNode start,MergeSortListNode end )
	{

		MergeSortListNode temp1 =  start;
		MergeSortListNode temp2 =  start;

		if ( temp2 == null)
		{
			throw new EmptySequenceException ("empty list ");
		}
		if(end !=null)
		{
			while ( temp2.getNext()!=end.getNext() && temp2.getNext().getNext() != end.getNext())
			{
				temp2 = temp2.getNext().getNext();
				temp1 = temp1.getNext();
			}
			return temp1;
		}
		else
		{
			while(temp2.getNext()!= null&&temp2.getNext().getNext()!= null)
			{
				temp2 = temp2.getNext().getNext();
				temp1 = temp1.getNext();
			}
			return temp1;
		}
	}
	public void removeNode(int pos)
	{
		if ( this.numItems == 0)
		{
			throw new EmptySequenceException(" no element added in yes");
		}
		if( pos < 0 || pos >= this.numItems)
		{
			throw new IndexOutOfBoundsException();
		}
		MergeSortListNode temp =  this.head;

		for (int i = 0 ; i < pos -1 ;i++)
		{
			temp = temp.getNext();
		}
		if ( pos == 0)
		{
			this.head = this.head.getNext();
		}
		else
		{
			if (temp.getNext()!= null )
			{
				temp.setNext(temp.getNext().getNext());
			}
		}
		this.numItems--;
	}
}

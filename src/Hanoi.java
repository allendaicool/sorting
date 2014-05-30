import java.util.*;

class Tower
{
	public int index; 
	public Stack<Integer> t;

	public Tower (int index)
	{
		t = new Stack<Integer>();
		this.index = index;
	}

	public boolean isEmpty()
	{
		return t.isEmpty();
	}
	public void add( int diskSize) throws Exception
	{
		if (!this.t.isEmpty()&&diskSize>this.t.peek())
		{
			throw new Exception(" wrong size");
		}
		else
		{
			t.push(diskSize);
		}

	}
	
	

	public static void moveTop ( Tower temp, Tower to) throws Exception
	{
		Integer tt =  temp.t.pop();
		to.add(tt);

	}
	public static void moveEntireDisks( Tower from , Tower to , Tower middle, int n) throws Exception
	{
		if ( n == 0)
		{
			return;
		}
		else
		{
			moveEntireDisks(from,middle,to,n-1);
			moveTop(from, to);
			moveEntireDisks(middle,to,from,n-1);
		}

	}
}



public class Hanoi {

}

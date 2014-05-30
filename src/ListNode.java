
public class ListNode  {

	private ListNode  next ;
	private  double data;
	private ListNode  prev ;


	public ListNode(double data)
	{
		this.data = data;
		this.next = null;
		this.prev = null;

	}
	public  ListNode (ListNode next, double data,ListNode prev) {
		this.data = data;
		this.next = next;
		this.prev = prev;

	}

	public double getData()
	{
		return this.data;
	}
	public ListNode getNext()
	{
		return this.next;
	}
	public ListNode getPrev()
	{
		return this.prev;
	}
	public void changeData(double data)
	{
		this.data = data;
	}
	public void setPrev(ListNode prev)
	{
		this.prev = prev;
	}
	public void setNext(ListNode next)
	{
		this.next = next;
	}

}



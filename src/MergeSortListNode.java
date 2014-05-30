
public class MergeSortListNode{

	private MergeSortListNode next ;
	private Integer data;

	
	public MergeSortListNode(Integer data)
	{
		this.data = data;
		this.next = null;

	}
	public  MergeSortListNode (MergeSortListNode next, Integer data) {
		this.data = data;
		this.next = next;
	}

	public Integer getData()
	{
		return this.data;
	}
	public MergeSortListNode getNext()
	{
		return this.next;
	}
	public void changeData(Integer data)
	{
		this.data = data;
	}
	public void setNext(MergeSortListNode next)
	{
		this.next = next;
	}

}

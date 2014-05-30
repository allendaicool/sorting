
public class Heapsort<E> {

	private int [] helper ;
	public Heapsort ( )
	{

	}

   
	public void sort (int [] passIn )
	{
		this.helper  = new int[passIn.length +1 ];

		this.helper[0] = Integer.MIN_VALUE;
		for ( int i = 1; i< this.helper.length; i++)
		{
			this.helper[i] = passIn[i-1];
		}
		buildMaxHeap(this.helper);
		for ( int i = this.helper.length-1; i > 1 ; i--)
		{
			int temp = this.helper[1];
			this.helper[1] = this.helper[i];
			this.helper[i] =  temp;
			MaxHeapify(this.helper,i-1,1);
		}
		for ( int i = 0; i< passIn.length; i++)
		{
			passIn[i] = helper[i+1];
		}
		
	}

	private void buildMaxHeap ( int [] unsortedArray)
	{
		int heapsize = unsortedArray.length-1;
		for( int i = heapsize/2 ; i>= 1; i--)
		{
			MaxHeapify(unsortedArray,heapsize,i);
		}

	}
	private void MaxHeapify ( int [] array , int heapSize,int index)
	{

		while ( index*2 <= heapSize && array[2*index]> array[index] || index*2+1 <= heapSize && array[2*index+1]> array[index])
		{
			int largest= index ;

			if ( 2*index <= heapSize && array[index] < array[index*2])
			{
				largest =  2*index;

			}
			if(2*index +1<= heapSize && array[largest] < array[index*2+1] )
			{
				largest =  2*index+1;

			}

			int temp = array[index];
			array[index] = array[largest];
			array[largest] = temp;
			index = largest;

		}
	}
}

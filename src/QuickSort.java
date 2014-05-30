
public class QuickSort {

	public QuickSort()
	{

	}

	/*private static int partition ( int[]A,int p , int r)
	{
		int pivot  =  A[r];
		int h = p -1 ;
		int j = p ;
		while( j < r)
		{
			if ( A[j] < pivot)
			{
				int temp = A[j];
				A[j] = A[h+1];
				A[h+1] = temp;
				h++ ;
				j++;
			}
			j++;
		}
		int temp = A[h+1];
		A[h+1] = pivot;
		A[r]=temp;
		return h+1;
	}*/
	private static int partition ( int[]A,int p , int r)
	{ 
		int pivot  = A[(p+r)/2];
		int i = p; int j = r;
		while(i<=j)
		{
			while ( A[i] < pivot)
			{
				i++;
			}
			while (A[j]>pivot)
			{
				j--;
			}
			if(i<=j)
			{
				int temp = A[i];

				A[i] = A[j];
				A[j] = temp;
				i++ ; j--;
			}
		}

		return i;
	}
	public static void sort ( int [] A,int p , int r)
	{
		int pivot = QuickSort.partition(A , p , r);
		if( pivot-1 > p)
		{
			QuickSort.sort(A,p,pivot - 1);
		}
		if(pivot<r)
		{
			QuickSort.sort(A,pivot,r);
		}

	}
	public static void main (String [] args)
	{
		QuickSort test  = new QuickSort ();
		int [] A = {5,1,2,4,10,-4,3,1};
		QuickSort.sort(A, 0, A.length -1 );
		for ( int i = 0; i< A.length; i++)
		{
			System.out.println(A[i]);
		}
	}
}

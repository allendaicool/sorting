
public class bucketSortTest {

	public static void main (String [] args)
	{
		double [] A  = { 0.4,0.3,0.1,0.5,0.01,0.9,0.2};
		bucketSort test1 = new bucketSort(A);
		test1.sort(A);
		for ( double val : A)
			System.out.println(val);
		//succeed
		int [][] a ={ {1,2,3},{3,4,5}};
		int ll = a.length;
		System.out.println("what"+ ll);
		
		}
	
}

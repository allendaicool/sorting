
public class testOncountign {
	public static void main (String []atgs)
	{
		int [] pass = { 5,1,3,2,4,5,6,1,2};
		CountingSOrt test1 = new CountingSOrt(pass, 6);
		int []sorted = test1.sort(pass, 6);
		for ( int i = 0; i<sorted.length;i++)
			System.out.println(sorted[i]);

       int range = Almostsort(pass,6,2,5);
		System.out.println(range);



	}
	public static int Almostsort (int [] pass,int k,int r1, int r2)
	{
		int [] A = new int[k+1];
		for ( int i = 0; i< pass.length;i++)
		{
			A[pass[i]] ++ ;
		}


		for ( int i = 1 ; i<A.length;i++)
		{
			A[i] = A[i-1] + A[i];
		}
        return A[r2] - A[r1-1];

	}
}

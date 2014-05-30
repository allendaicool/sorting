
public class CountingSOrt {

	private int [] A ;
	private int[] B;

	public CountingSOrt(int [] pass, int k )
	{
		this.B = new int [pass.length]; 
		this.A = new int [k+1];
		for ( int i = 0 ; i<A.length;i++)
			A[i]=0;
	}
	public int[] sort (int [] pass,int k)
	{
		for ( int i = 0; i< pass.length;i++)
		{
			A[pass[i]] ++ ;
		}


		for ( int i = 1 ; i<A.length;i++)
		{
			A[i] = A[i-1] + A[i];
		}


		for (int i= B.length-1;i>=0;i--)
		{
			B[A[pass[i]]-1] = pass[i];
			A[pass[i]] --;
		}
		return this.B;

	}
}

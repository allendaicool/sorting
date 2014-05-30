import java.util.Stack;


public class findMin {
  public static void main ( String [] args)
  {
	  int [] A = {11,2,4,5,6,3,8,9};
	  int index = smallestInde(A,0,A.length-1);
	  System.out.println(index);
  }
  
  public static int smallestInde ( int []A, int a, int b)
  {
	  if ( a == b)
	  {
		  return a;
	  }
	  int middle = (a+b)/2;
	  int lar1 = smallestInde (A,a,middle);
	  int lar2 = smallestInde(A,middle+1,b);
	  return (A[lar1] > A[lar2])? lar2 : lar1;
	  
  }
  public static int SecsmallestInde ( int []A, int a, int b,int smallest)
  {
	  if ( a == b)
	  {
		  return a;
	  }
	  int middle = (a+b)/2;
	  int lar1 = SecsmallestInde (A,a,middle,smallest);
	  int lar2 = SecsmallestInde(A,middle+1,b,smallest);
	  Stack<Integer> a = new Stack<Integer> ();
	  
  }
}


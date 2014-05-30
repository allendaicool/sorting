import java.util.*;
import java.io.*;
public class reverse {
	public static int overall = 3 ;

	public static void main (String args[])
	{
		String test = new String("safeDriver");
		String reversed = "";
		/*int end = test.length()-1;
		int beg = 0 ;
		char a = test[0];
		while (beg<end)
		{
			char temp = test.charAt(beg);

		}*/
		
		
		double a =  5/2;
		System.out.println(a);
		String result = reverseAstring(test) ;
		System.out.println(result);
		int [] temp = { 5,3,1,7,9};
		int[] sorted = InsertionSort(temp);
		for ( int i = 0 ; i< sorted.length;i++)
			System.out.print(" " + sorted[i]);

		int []copyOne = new int[3] ;
		System.arraycopy(temp,0,copyOne,0,3);
		System.out.println();
		for ( int i = 0 ; i< copyOne.length;i++)
			System.out.print(" " + copyOne[i]);

		int [] exp = { -13, -3,-4,6,9,-2,-1,16,19};
		int [] hasTwo = findMaxSub(exp,0, 8);
		System.out.println(" low  is " +hasTwo[0] );
		System.out.println(" high  is " +hasTwo[1] );
		System.out.println(" sum  is " +hasTwo[2] );

		int [] hasOne = foundMaxSubarray (exp , 0 , 2);
		System.out.println(" low  is " +hasOne[0] );
		System.out.println(" high  is " +hasOne[1] );
		System.out.println(" sum  is " +hasOne[2] );

		int summation = SumupMultiple(1000);
		System.out.println(" summation is " +summation);


	}

	public static int[] findMaxSub(int[]A,int low, int high)
	{

		int  start = low;
		int  currLow = low ; int currHi = low; int Max = A[low]; 
		while ( start < high)
		{
			start ++ ;

			int tempMax = A[start];
			int tempSum = A[start];
			int temp = start-1 ;
			int  possLow =start ; 

			while (temp > currHi)
			{
				tempSum += A[temp];
				if( tempSum > tempMax)
				{
					tempMax =  tempSum ;
					possLow = temp ;
				}
				temp -- ;
			}

			if ( tempMax > Max+tempSum)
			{
				Max = tempMax;
				currHi = start ;
				currLow = possLow ;					
			}
			else
			{
				currHi = start ;
				Max += tempSum;
			}

			System.out.println(" temporary currHi  is "  + currHi);
			System.out.println(" temporary currLow  is "  + currLow);

		}
		int [] store = new int[3];
		store[0] = currLow ; store[1] = currHi; store[2]= Max;
		return store ;

	}

	public static int SumupMultiple( int range)
	{
		// this method is to compute the sume of multiple of 3 or 5 below the range
		int numThreeMul = range/3 ;
		int numFiveMul = range/5 ;
		int numFifteenMul = range/15;
		int sum = 0;
		for ( int i= 1 ; i<=numThreeMul; i++ )
		{
			sum += i*3;
		}
		for ( int i = 1; i<numFiveMul; i++ )
		{
			sum += i*5;
		}
		for ( int  i= 1 ; i<=numFifteenMul ; i++)
		{
			sum -= i*15;
		}
		return sum;
	}


	public static int[] finaMaxcrossingSubarray(int[]A , int low, int mid , int high)
	{
		double leftSum = Double.NEGATIVE_INFINITY;
		int sum = 0 ;
		int leftmaxIndex = -1 ;;

		for (int i = mid; i >= low; i--)
		{
			sum += A[i];
			if ( sum>leftSum)
			{
				leftSum = sum;
				leftmaxIndex = i ;
			}
		}
		double rightSum = Double.NEGATIVE_INFINITY;
		sum = 0;
		int rightmaxIndex = -1 ;
		for (int i= mid+1 ; i<= high; i++)
		{
			sum += A[i];
			if ( sum > rightSum)
			{
				rightSum = sum ;
				rightmaxIndex = i ;
			}
		}
		int [] StoreInfo = new int[3];

		{StoreInfo [0] = leftmaxIndex;
		StoreInfo [1] = rightmaxIndex;
		StoreInfo [2] = (int)leftSum+(int)rightSum;}


		return  StoreInfo ;
	}

	public static int[] foundMaxSubarray(int[] A,int low, int high)
	{
		if ( low == high)
		{
			int [] temp = new int[3];
			temp [0] = low ;temp[1] = high; temp[2] = A[low];
			return temp ;
		}
		int[] temp1 = foundMaxSubarray(A, low, (high+low)/2);
		int[] temp2 = foundMaxSubarray(A, (high+low)/2 +1 , high);
		int[] temp3 = finaMaxcrossingSubarray(A ,  low, (high+low)/2  , high);
		if (temp1[2]>(temp3[2])&&temp1[2]>temp2[2])
		{
			return temp1;

		}
		else if(temp2[2]>(temp3[2])&&temp2[2]>temp1[2] )
		{
			return temp2;
		}
		else
		{
			return temp3;
		}
	}

	public static int [] InsertionSort( int [] arrayUnsort)
	{
		for ( int  j = 1 ; j<arrayUnsort.length;j++)
		{
			int i = j-1 ;
			int key = arrayUnsort [j];
			while(i>=0&& arrayUnsort[i+1]<arrayUnsort[i])
			{
				arrayUnsort[i+1] = arrayUnsort[i];
				i --;
				arrayUnsort[i+1] = key;
			}
		}
		return arrayUnsort;
	}

	public static String reverseAstring (String temp)
	{
		if (temp.length() == 1)
		{
			System.out.println(reverse.overall);
			return temp ;
		}
		String LeftTemp = temp.substring(0,temp.length()/2);
		String RightTemp = temp.substring(temp.length()/2);
		String merger1 = reverseAstring(LeftTemp);
		String merger2 = reverseAstring(RightTemp);
		String newVersion = merger2+merger1;
		return newVersion;

	}
}

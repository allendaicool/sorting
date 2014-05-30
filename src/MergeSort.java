
public class MergeSort {

	private int[] helper ;
	private int[] numbers;
	//private int number ;

	public void sort(int[] ToSort)
	{
		this.numbers = ToSort ;
		int value = ToSort.length;
		this.helper = new int[value];
		mergeSort(0,value-1);
	}

	private void mergeProcess(int low, int middle, int high)
	{
		for ( int i = low ; i <= high; i++)
		{
			helper[i] = this.numbers[i];
		}

		int i  = low ;
		int j = low ;
		int k = middle +1  ;

		while ( i<= middle && k<= high)
		{
			if ( this.helper[i]<this.helper[k])
			{
				numbers[j] = helper[i];
				i++ ;
			}
			else
			{
				this.numbers[j]=helper[k];
				k++;
			}
			j++;

		}
		/*while (i <= middle) {
			numbers[j] = helper[i];
			j++;
			i++;
		}*/
		if ( i>middle)
		{
			while(k<=high)
			{
				this.numbers[j] = this.helper[k];
				k++; j++;
			}
		}
		
		else if ( k> high )
		{
		
			while ( i<= middle)
			{
				this.numbers[j] = this.helper[i];
				i++;j++;
			}
		}

	}

	private void mergeSort(int low , int high)
	{
		if ( low<high)
		{
			int middle = (low + high)/2;
			mergeSort(low,middle);
			mergeSort(middle+1,high);
			mergeProcess(low,middle,high);
		}

	}
}

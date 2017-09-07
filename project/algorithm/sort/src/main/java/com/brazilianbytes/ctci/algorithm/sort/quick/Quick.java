public class Quick {

	public static void main(String[] args) {
		int a[]={10,3,45,15,7,18,-1,19};
		quicksort(a,0,a.length-1);
	}


public static void quicksort(int a[],int lo,int hi)
	{
		if(lo>=hi)
			return;

		int mid=(lo+hi)/2;
		int pivot=a[mid];
		int left=lo,right=hi;
		while(left<=right)
		{
			while(a[left]<pivot)
			{
				left++;
			}
			while(a[right]>pivot)
			{
				right--;
			}
			if(left<=right)
			{
				int temp=a[left];
				a[left]=a[right];
				a[right]=temp;
				left++;
				right--;
			}
		}
		quicksort(a,lo,right);
		quicksort(a,left,hi);
	}
}

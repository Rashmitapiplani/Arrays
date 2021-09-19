class Solution 
{ 
	static int[] SortBinaryArray(int arr[], int n) 
	{ 
	    int fp=0,sp=n-1;
	    for(int i=0;i<n;i++)
	    {
	        if(arr[fp]==1)
	          {
	              int temp=arr[fp];
	              arr[fp]=arr[sp];
	              arr[sp]=temp;
	              sp--;
	          }
	        else 
	        {
	            
	            fp++;
	        }
	    }
	    return arr;// code here
	} 
}
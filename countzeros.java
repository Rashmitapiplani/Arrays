public class countzeros {int countZeroes(int[] arr, int n) {
    int low=0,end=n-1,first=-1;
    while(low<=end)
    {
        int mid=end-(end-low)/2;
        if(arr[mid]==0)
        { first=mid;
            end=mid-1;
        }
        else if(arr[mid]==1)
        {
            low=mid+1;
        }
        else
        end=mid-1;
    }
    if(first!=-1)
    return n-first;
    return first;// code here
  }
    
}

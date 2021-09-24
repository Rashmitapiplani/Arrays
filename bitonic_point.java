public class bitonic_point {
    int findMaximum(int[] arr, int n) {
        int start=0,end=n-1;
        while(start<=end)
        { if(start==end)
        return arr[start];
            int mid=start+(end-start)/2;
            if(end==start+1 && arr[start]>arr[end])
            return arr[start];
            if(end==start+1 && arr[start]<arr[end])
            return arr[end];
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
            return arr[mid];
            else if(arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1])
            end=mid-1;
            else
            start=mid+1;
        }
        return -1;
}

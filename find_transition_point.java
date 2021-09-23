public class find_transition_point {
    int transitionPoint(int arr[], int n) { int low=0,end=n-1,first=-1;
        while(low<=end)
       {
           int mid=(low+end)/2;
           if(arr[mid]==1)
           {
               first=mid;
               end=mid-1;
           }
           else if(arr[mid]==0)
           {
               low=mid+1;
           }
       
        
       }
       return first;// code here
   }
}

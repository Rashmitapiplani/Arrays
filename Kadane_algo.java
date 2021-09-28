public class Kadane_algo {
    long maxSubarraySum(int arr[], int n){
        
        long maxsum=arr[0],sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum>maxsum)
            maxsum=sum;
            if(sum<0)
            sum=0;
        }// Your code here
         return maxsum;
     }
 
}

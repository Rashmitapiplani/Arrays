public class equilibriam_index {
    
    int presum=arr[0],nextsum=0,i,j;
    for( i=1;i<n;i++)
    {
        for(j=i+1;j<n;j++)
         nextsum+=arr[j];
         if(presum==nextsum)
         return i;
         
         presum+=arr[i];
         nextsum=0;
    }
    
   return -1; //add code here.
  
}

public class largestsubaaraywith0sum {
    

    int maxLen(int arr[], int n)
    { HashMap<Integer,Integer> hm=new HashMap<>();
      int sum=0,i=-1,maxlen=0;
      hm.put(sum,-1);
      while(i<arr.length-1)
      {
          i++;
          sum+=arr[i];
          if(hm.containsKey(sum)==false)
          {
              hm.put(sum,i);
          }
          else
          {
              int len=i-hm.get(sum);
              if(len>maxlen)
              maxlen=len;
          }
      }
      return maxlen;
    }

}

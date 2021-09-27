public class Majority_element {
    static int majorityElement(int a[], int size)
    { int freq=0;
      int potentialcand=findmajority(a,size);
      for(int i=0;i<size;i++)
      {if(a[i]==potentialcand)
         freq++;
      }
      if(freq>size/2)
      return potentialcand;
      else
      return -1;
    }
    static int findmajority(int [] a,int size)
    { int element =a[0],count=1;
         for(int i=1;i<size;i++)
         {
             if(a[i]==element)
              count++;
              else
              
                  count--;
             if(count==0)
            { element=a[i];
             count=1;
            }
              
         }
      return element;   
    }
}

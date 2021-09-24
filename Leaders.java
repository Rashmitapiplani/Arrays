public class Leaders {
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList <Integer> al=new ArrayList<>();
        al.add(arr[n-1]);
        int maxleader=arr[n-1];
        for(int i=n-2;i>=0;i--)
         {
             if(arr[i]>=maxleader )
             {
                 maxleader=arr[i];
                 al.add(maxleader);
             }
         }
         Collections.reverse(al);
         return al;
        // Your code here
    }
}

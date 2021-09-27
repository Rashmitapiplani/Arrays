public class MajorityElement-2 {
    List<Integer> majorityElement(int[] nums) {
        int num1=-1,num2=-1,count1=0,count2=0,freq1=0,freq2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==num1)
                count1++;
           else if(nums[i]==num2)
               count2++;
            
            
           else  if(count1==0)
                {
                    num1=nums[i];
                    count1=1;
                        public
                }
          else if(count2==0)
                {
                    num2=nums[i];
                    count2=1;
                }
                else
                {
                    count1--;
                    count2--;
                }
            
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==num1)
                freq1++;
           else if(nums[i]==num2)
                freq2++;
        }
        if(freq1>nums.length/3)
            ans.add(num1);
        if(freq2>nums.length/3 && num1!=num2 )
            ans.add(num2);
        return ans;
    }
}

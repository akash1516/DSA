//https://leetcode.com/problems/split-array-largest-sum/
package Hard;

public class split_array_largest_sum {
    public static void main(String[] args) {
        
    }

    public static int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        // here 1st we finding the range of the i.e
        // start = max sum with min partition
        // end = max sum with max partition
        for(int i=0; i<nums.length; i++) {
            start=Math.max(start, nums[i]);
            end=end+nums[i];
        }

        // now we will do binary search
        while(start<end) 
        {
            // try for middle as potential ans.
            int mid=start+(end-start)/2;
            
            // calculate how many pieces you can divide  this in with this max sum
            int sum=0;
            int pieces=1;
            for(int num:nums) 
            {
                if (sum+num>mid) {
                    // we can't add this num in particular sub-array
                    // so we have to make the new the new one
                    sum=num;
                    pieces++;                    
                }
                else{
                    sum=sum+num;
                }

            }
            // now
            if (pieces>k) {
                start=mid+1;
            }
            else
            {
                end=mid;
            }
            
        }
        return end;
    }
}

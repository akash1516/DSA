package Easy;

public class Solution {
    
    public static void main(String[] args) {
        int nums[]={-2,-1,-1,1,2,3};
        maximumCount(nums);
    }

    public static void maximumCount(int[] nums) {
        // first we have to find start index +ve number and last index of -ve number
        int start_index_pos=search(nums,true);  // true says that we are looking for +ve no.
        int last_index_neg=search(nums,false);  // false says that we are looking for -ve no.
        System.out.println(start_index_pos);
        System.out.println(last_index_neg);
    }

    public static int search(int[] arr,boolean check)
    {
        int start=0;
        int end=arr.length-1;
        //int ans=-1;

        while (start<=end)
        {
            int mid=start + (end-start)/2;
            if(check==false)
            {
                if(arr[mid+1]<0)
                {
                    start=mid+1;
                }
                else
                {
                    end=mid;
                }
            }
            
            else
            {
                
                if (arr[mid-1]>0) {
                    end=mid-1;
                }
                else
                {
                    start=mid;
                }
            }
        }
        return start;
    }
}

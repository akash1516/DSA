package Easy;
import java.util.*;
public class leet_1608 {

    public static void main(String[] args) {
        int nums[]={0,4,3,0,4};
        specialArray(nums);
    }

    public static void specialArray(int[] nums) {
        Arrays.sort(nums);
        // we have search till the 0 to last element of nums;

        for(int i=0;i<=nums[nums.length-1];i++)
        {
            int ans=binarySearch(nums,i);
            System.out.println("i : "+i+" ans : "+ans);
            if(i==(nums.length-ans))
            {
                System.out.println(i);
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-1");

    }

    public static int binarySearch(int[] nums,int target)
    {
        int start=0;
        int end=nums.length-1;

        while(start<end)
        {
            int mid=start+(end-start)/2;

            if(target<=nums[mid])
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
        }
        return end;
    }
    
}

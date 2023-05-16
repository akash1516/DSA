/*https://www.geeksforgeeks.org/quick-sort/ */

package ArrayRecursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={10, 80, 30, 40, 50, 70};
        quick_sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quick_sort(int[] nums,int low , int high)
    {
        if(low>=high)
        {
            return;
        }
        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
        int pivot=nums[mid];

        while(start<=end)
        {
            while (nums[start]<pivot)
            {
                start++;
            }
            while(nums[end]>pivot)
            {
                end--;
            }

            if(start<=end)
            {
                int temp=nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
            //now my pivot is at correct index , sort the other halves
            quick_sort(nums, low, end);
            quick_sort(nums, start, high);
        }
    }
}

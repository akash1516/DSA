/*  https://www.codingninjas.com/codestudio/problems/ceiling-in-a-sorted-array_1825401*/
package Medium;

/**
 * Ceiling_of_a_number
 */

public class Ceiling_of_a_number {
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        int ceil=ceilingInSortedArray(arr.length,0,arr);
        System.out.println("ceiling of a number is "+ ceil);
    }

    public static int ceilingInSortedArray(int length, int target, int[] arr) 
    {
        int start=0;
        int end=length-1;
        /*case : if target element is greater than the last element of array */
        if (target>arr[end]) {
            return -1;
        }

        while (start<=end)
        {
            int mid=start + (end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                return arr[mid];
            }
        }
        if(arr[start]>target)
        {
            return arr[start];
        }
        else
        {
            return -1;
        }
    }
}
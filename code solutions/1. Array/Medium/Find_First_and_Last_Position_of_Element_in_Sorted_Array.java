/*https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/ */
package Medium;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static void main(String[] args) {
        int arr[]={5,7,7,7,7,7,7,8,8,8,10};
        int ans[]={-1,-1};
        int target=6;
        int firstBinarySearch=search(arr,target,true);
        int secondBinarySearch=search(arr,target,false);
        ans[0]=firstBinarySearch;
        ans[1]=secondBinarySearch;
        System.out.println("["+ans[0]+","+ans[1]+"]");
        
    }   
    
    public static int search(int[] arr, int target, boolean firstIndex)
    {
        int start=0;
        int end=arr.length-1;
        int ans=-1;

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
                ans=mid;
                if (firstIndex==true) {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}

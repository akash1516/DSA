package Medium;

public class Floor_of_a_number 
{
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        int floor=floorInSortedArray(arr.length,15,arr);
        System.out.println("Floor of a number is "+ floor);
    }

    public static int floorInSortedArray(int length, int target, int[] arr) 
    {
        int start=0;
        int end=length-1;
        /*case : if target element is greater than the last element of array */
        if (target<arr[start]) {
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
        if(arr[end]<target)
        {
            return arr[end];
        }
        else
        {
            return -1;
        }
    }
}

package Easy;
public class pivot_in_duplicacy {
    public static void main(String[] args) {
        int arr[]={2,5,6,0,0,1,2};
        int pivot=findPivotWithDuplicates(arr);
        System.out.println(pivot);
    }

    public static int findPivotWithDuplicates(int arr[])
    {
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            
            /*case 1: pivot element is largest and for this condition is arr[mid]>arr[mid+1] */
            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            /*case 2: pivot element is largest and for this condition is arr[mid]<arr[mid-1]*/
            if(mid>start && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            
            // if element at start,mid and end are the just skip the duplicates
            if(arr[start]==arr[mid] && arr[mid] == arr[end])
            {
                // skip duplicates
                // note: the elements which we are skipping is pivot
                // check if start is pivot
                if(start>end && arr[start]>arr[start+1])
                {
                    return start;
                }
                start++;
                // check if end is pivot
                if(end>start&& arr[end]<arr[end-1])
                {
                    return end-1;
                }
                end--;
            }
            //left side is sorted so my pivot will be in right in side
            else if(arr[start]<arr[mid] || (arr[start]==arr[mid]) && arr[mid]>arr[end])
            {
                start=mid; // or start = mid + 1
            }
            else 
            {
                end=end-1;
            }
        }
        return -1;
    }
}

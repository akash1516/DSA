package Easy;

/**
 * Find_the_pivot_rotated_sorted_array
 */
public class Find_the_pivot_rotated_sorted_array {

    public static void main(String[] args) {
        int arr[]={3,4,5,6,0,1,2};
        int pivot=findPivot(arr);
        System.out.println(pivot);
    }

    public static int findPivot(int arr[])
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
            
             /*case 3: if start element is less than the middle element then all the elements next to mid from mid ar smaller than start */
             if (arr[start]>=arr[mid]) {
                end=mid-1;

             }
             else
             {
                start=mid+1;
             }
        }
        return -1;
    }
}
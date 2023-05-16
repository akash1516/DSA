package Medium;

public class search_in_rotated_sorted_array {
    public static void main(String[] args) {
        int arr[]={1};
        int target=0;
        int pivot=findPivot(arr);

        if (pivot==-1) {
            // normal binary search
            System.out.println(binarySearch(arr,target,0,arr.length-1));
        }

        /*else part */
        //first half binar search
        int search1=binarySearch(arr,target,0,pivot);
        if (search1!=-1) {
            System.out.println(search1);
        }
        else
        {
            // second half biary search
            int search2=binarySearch(arr,target,pivot+1,arr.length-1);
            if (search2!=-1) {
                System.out.println(search2);
            }
            else
            {
                System.out.println("-1");
            }
        }


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

    // binary search
    public static int binarySearch(int[] arr,int target,int start,int end)
    {
        

        while(start<=end)
        {
            int mid= start+(end-start)/2;

            if(arr[mid]==target)
            {
                return mid;
            }

            
            else if (target<arr[mid])
            {
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

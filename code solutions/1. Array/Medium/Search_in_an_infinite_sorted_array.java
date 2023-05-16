package Medium;

public class Search_in_an_infinite_sorted_array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,19,20,21,22,23,24};
        int target=17;
        int result=ans(arr,target);
        System.out.println(result);
    }

    /*here in this method we find the range to apply the binary search because it is infinite sorted array */
    public static int ans(int arr[],int target)
    {
        int start=0;
        int end=1;
        while(target>arr[end])
        {
            int newstart=end+1;
            int newend=end+(end-start+1)*2;  /*here actually we are doubling the finding range */

            start=newstart;
            end=newend;
        }
        return search(arr,target,start,end);
    }

    /*Binary Search */
    public static int search(int[] arr, int target, int start,int end)
    {
        int nstart=start;
        int nend=end;
        

        while (nstart<=nend)
        {
            int mid=nstart + (nend-nstart)/2;
            if(target<arr[mid])
            {
                nend=mid-1;
            }
            else if(target>arr[mid])
            {
                nstart=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}

package Medium;

public class Peak_element_in_an_mountain_array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7,6,3,2};
        int peak=peak_element(arr);
        System.out.println(peak);
    }

    /*finding peak element */
    public static int peak_element(int arr[])
    {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end=mid;                       /*it may be the possible ans which the greatest thats why end=mid */
            }
            else
            {
                start=mid+1;
            }
        }

        return arr[start];
    }
}

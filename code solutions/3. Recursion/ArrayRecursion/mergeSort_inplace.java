package ArrayRecursion;



public class mergeSort_inplace   {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        merge_sort(arr,0,arr.length);
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
    }

    public static void merge_sort(int[] arr,int start,int end)
    {
        if (end-start==1)
        {
            return;
        }
        int mid=start+(end-start)/2;

        merge_sort(arr,start, mid); // for left
        merge_sort(arr, mid,end);   // for right
        merge(arr,start,mid,end); // for
    }

    private static void merge(int[] arr,int start,int mid,int end) {
        int[] result = new int[end-start];
        int i=start; // pointing to first array;
        int j=mid; // pointing to second array;
        int k=0; // pointing to result array;
        while (i<mid && j<end) {
            if(arr[i]<arr[j])
            {
                result[k]=arr[i];
                i++;
                k++;
            }
            else
            {
                result[k]=arr[j];
                j++;
                k++;
            }
        }

        // it may be the possible that one of the arrays is not complete
        while(i<mid)
        {
            result[k]=arr[i];
            i++;
            k++;
        }
        while(j<end)
        {
            result[k]=arr[j];
            j++;
            k++;
        }
        
        // now we copy the result into original

        for(int s=0; s<result.length; s++)
        {
            arr[start+s]=result[s];
        }
    }
    
}

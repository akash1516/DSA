package ArrayRecursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int[] sorted=merge_sort(arr);
        for(int num:sorted)
        {
            System.out.print(num+" ");
        }
    }

    public static int[] merge_sort(int[] arr)
    {
        if (arr.length==1)
        {
            return arr;
        }
        int mid=arr.length/2;

        int[] left=merge_sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right=merge_sort(Arrays.copyOfRange(arr, mid,arr.length));
        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] result = new int[first.length+second.length];
        int i=0; // pointing to first array;
        int j=0; // pointing to second array;
        int k=0; // pointing to result array;
        while (i<first.length && j<second.length) {
            if(first[i]<second[j])
            {
                result[k]=first[i];
                i++;
                k++;
            }
            else
            {
                result[k]=second[j];
                j++;
                k++;
            }
        }

        // it may be the possible that one of the arrays is not complete
        while(i<first.length)
        {
            result[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length)
        {
            result[k]=second[j];
            j++;
            k++;
        }
        return result;
    }
    
}

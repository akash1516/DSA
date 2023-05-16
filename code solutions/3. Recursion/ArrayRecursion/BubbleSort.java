package ArrayRecursion;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        bubble(arr, arr.length, 0);
        for(int num : arr)
        {
            System.out.print(num+" ");
        }
    }

    public static void swap(int arr[],int index1,int index2)
    {
        arr[index1] = arr[index1]+arr[index2];
        arr[index2] = arr[index1]-arr[index2];
        arr[index1] = arr[index1]-arr[index2];
    }
    public static void bubble(int[] arr,int row,int col)
    {
        if(row == 0)
        {
            return;
        }
        if(col+1<row)
        {
            if(arr[col]>arr[col+1])
            {
                swap(arr,col,col+1);
            }
            bubble(arr, row, col+1);
        }
        else
        {
            bubble(arr, row-1, 0);
        }
    }
    
}

package ArrayRecursion;

public class selectionSort {
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        selection(arr, arr.length, 0,0);
        for(int num : arr)
        {
            System.out.print(num+" ");
        }
    }

    public static void swap(int arr[],int index1,int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void selection(int[] arr,int row,int col,int max)
    {
        if(row == 0)
        {
            return;
        }
        if(col<row)
        {
            if(arr[col]>=arr[max])
            {
                selection(arr, row, col+1,col);
                
            }
            else{
                selection(arr, row, col+1,max);   
            }
            
        }
        else
        {
            swap(arr, row-1, max);
            selection(arr, row-1, 0,0);
        }
    }
}

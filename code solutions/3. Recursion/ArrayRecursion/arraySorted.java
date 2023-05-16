package ArrayRecursion;

public class arraySorted {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8,9};
        System.out.println(sorted_or_not(arr, 0));
    }

    public static boolean sorted_or_not(int arr[],int index)
    {
        if(index==arr.length-1)
        {
            return true;
        }
        return arr[index] < arr[index+1] && sorted_or_not(arr, index+1);
    }
}   

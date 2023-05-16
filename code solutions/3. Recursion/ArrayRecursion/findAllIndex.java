package ArrayRecursion;
import java.util.*;
public class findAllIndex {
    public static void main(String[] args) {
        int arr[]={2,3,1,4,4,5};
       // ArrayList<Integer> list=findIndex(arr, 4, 0, new ArrayList<Integer>());
       ArrayList<Integer> list=findIndex1(arr, 4, 0);
        System.out.println(list);
    }

    public static ArrayList<Integer> findIndex(int arr[],int target,int index,ArrayList<Integer> list)
    {
        if(index==arr.length)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        return findIndex(arr, target,index+1,list);
    } 

    // without using arrayList as arguement
    // the above approach is good for this question but we may use later this concept in other question
    public static ArrayList<Integer> findIndex1(int arr[],int target,int index)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(index==arr.length)
        {
            return list;
        }
        // this will contain answer for particular function only
        if(arr[index]==target)
        {
            list.add(index);
        }
        ArrayList<Integer> ans_from_below_calls= findIndex1(arr, target,index+1);
        list.addAll(ans_from_below_calls);
        return list;
    } 
}

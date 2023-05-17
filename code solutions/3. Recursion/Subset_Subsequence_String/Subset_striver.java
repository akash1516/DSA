package Subset_Subsequence_String;
import java.util.*;
public class Subset_striver {
    public static void main(String[] args) {
        int[] arr={1,2,3};
       List<List<Integer>> res=subset(arr);
       for(List<Integer> lst: res)
       {
            System.out.println(lst);
       }
    }
    public static List<List<Integer>> subset(int[] nums)
    {
        List<List<Integer>> resulList=new ArrayList<>(0);
        //start backtracking from beginning
        backtrack(resulList,new ArrayList<>(0),nums,0);
        return resulList;
    }
    public static void backtrack(List<List<Integer>> resultList,List<Integer> cur_lst,int[] arr,int index)
    {
        if(index>=arr.length)
        {
            resultList.add(new ArrayList<>(cur_lst));
            return;
            
        }
        
        cur_lst.add(arr[index]);
        backtrack(resultList, cur_lst, arr, index+1);
        cur_lst.remove(cur_lst.size()-1);
        backtrack(resultList, cur_lst, arr, index+1);

    }
    
}

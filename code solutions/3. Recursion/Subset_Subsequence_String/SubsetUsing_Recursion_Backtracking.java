package Subset_Subsequence_String;
import java.util.*;
public class SubsetUsing_Recursion_Backtracking {
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

    public static void backtrack(List<List<Integer>> resultsets,List<Integer> tempset,int[] nums,int start)
    {
        //add the tempset to the resultsets
        resultsets.add(new ArrayList<>(tempset));

        for(int i = start; i < nums.length; i++)
        {
            // case for including the number
            tempset.add(nums[i]);

            // backtrack the new subset
            backtrack(resultsets, tempset, nums, i+1);

            // case for not-including  the number
            tempset.remove(tempset.size()-1);
        }
    }
    
}

package Subset_Subsequence_String;
import java.util.*;
public class Subset_Sum_K_2 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int k=3;
       List<List<Integer>> res=subset(arr,k);
       for(List<Integer> lst: res)
       {
            System.out.println(lst);
       }
    }
    public static List<List<Integer>> subset(int[] nums,int k)
    {
        List<List<Integer>> resulList=new ArrayList<>(0);
        //start backtracking from beginning
        //backtrack(resulList,new ArrayList<>(0),nums,0,0,k,0);
        int res =backtrack(resulList,new ArrayList<>(0),nums,0,0,k);
        System.out.println(res);
        return resulList;
    }
    public static  int backtrack(List<List<Integer>> resultList,List<Integer> cur_lst,int[] arr,int index,int sum,int k)
    {
        if(index>=arr.length)
        {
            if(sum==k)
            {
                //resultList.add(new ArrayList<>(cur_lst));
                return 1;
            }
            return 0;
            
        }
        
        cur_lst.add(arr[index]);
        sum+=arr[index];
        int left=backtrack(resultList, cur_lst, arr, index+1,sum,k);
        cur_lst.remove(cur_lst.size()-1);
        sum-=arr[index];
        int right=backtrack(resultList, cur_lst, arr, index+1,sum,k);
        return left+right;
        
        

    }
}

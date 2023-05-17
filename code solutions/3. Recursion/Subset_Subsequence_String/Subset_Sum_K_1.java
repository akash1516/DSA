/*in this we have to return only one subsequence whose subset sum is equal to k */
package Subset_Subsequence_String;
import java.util.*;
public class Subset_Sum_K_1 {
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
        backtrack(resulList,new ArrayList<>(0),nums,0,0,k);
        return resulList;
    }
    public static  boolean backtrack(List<List<Integer>> resultList,List<Integer> cur_lst,int[] arr,int index,int sum,int k)
    {
        if(index>=arr.length)
        {
            if(sum==k)
            {
                resultList.add(new ArrayList<>(cur_lst));
                return true;
            }
            return false;
            
        }
        
        cur_lst.add(arr[index]);
        sum+=arr[index];
        if(backtrack(resultList, cur_lst, arr, index+1,sum,k)==true){
            return true;
        }
        cur_lst.remove(cur_lst.size()-1);
        sum-=arr[index];
        if(backtrack(resultList, cur_lst, arr, index+1,sum,k)==true){
            return true;
        }
        return false;

    }
}

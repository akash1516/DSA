package Subset_Subsequence_String;

import java.util.*;
public class Subset_usingIteration {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<List<Integer>> ans=subset(arr);
        for(List<Integer> lst:ans)
        {
            System.out.println(lst);
        }
    }
    public static List<List<Integer>> subset(int[] arr)
    {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>(0));

        for(int num: arr)
        {
            int n=outer.size();
            for(int i=0; i<n; i++)
            {
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);

            }
        }
        return outer;
    }
    
}

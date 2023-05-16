package Subset_Subsequence_String;
import java.util.*;
public class SubsequenceArrayList {
    public static void main(String[] args) {
        String str= "abc";
        ArrayList<String> l=string_Subsequence("", str);
        System.out.println(l);
    }

    public static ArrayList<String> string_Subsequence(String p,String up) /* p-> processed, up-> unprocessed */
    {
        if(up.isEmpty())
        {
            ArrayList<String> l1=new ArrayList<>();
            if(!p.isEmpty())
            {
                l1.add(p);
            }
            
            return l1;
        }
        ArrayList<String> left=string_Subsequence(p+up.charAt(0), up.substring(1));
        ArrayList<String> right=string_Subsequence(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}

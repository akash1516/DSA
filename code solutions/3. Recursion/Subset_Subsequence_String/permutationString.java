package Subset_Subsequence_String;
import java.util.*;
public class permutationString {
    public static void main(String[] args) {
        //permutation("", "abc");
        ArrayList<String> permutString=permutation_a("", "abc");
        System.out.println(permutString);

        System.out.println(permutation_count("", "abc"));
    }

    public static void permutation(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String first=p.substring(0, i);
            String second=p.substring(i,p.length());
            permutation(first+ch+second, up.substring(1));
        }

    }

    /*using ArrayList */
    public static ArrayList<String> permutation_a(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> l = new ArrayList<String>();
            l.add(p);
            
            return l;
        }
        ArrayList<String> ans = new ArrayList<String>();
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String first=p.substring(0, i);
            String second=p.substring(i,p.length());
            ans.addAll(permutation_a(first+ch+second, up.substring(1)));
        }
        return ans;
    }
    /*Count no. of permutations */
    public static int permutation_count(String p,String up)
    {
        if(up.isEmpty())
        {
            return 1;
        }
        int count=0;
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String first=p.substring(0, i);
            String second=p.substring(i,p.length());
            count+=permutation_count(first+ch+second, up.substring(1));
        }
        return count;
    }

}

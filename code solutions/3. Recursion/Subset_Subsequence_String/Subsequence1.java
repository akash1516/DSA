package Subset_Subsequence_String;

public class Subsequence1 {
    public static void main(String[] args) {
        String str= "abc";
        string_Subsequence("", str);
    }

    public static void string_Subsequence(String p,String up) /* p-> processed, up-> unprocessed */
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        string_Subsequence(p+up.charAt(0), up.substring(1));
        string_Subsequence(p, up.substring(1));
    }
    
}

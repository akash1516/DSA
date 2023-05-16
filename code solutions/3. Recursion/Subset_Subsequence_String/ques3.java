package Subset_Subsequence_String;

public class ques3 {
    public static void main(String[] args) {
        String str="akaappesh"; 
        //skip_ch1(str, "");
        System.out.println(skip_app_notapple(str));
     }
 
     
     public static String skip_app_notapple(String str)
     {
         if(str.isEmpty())
         {
             
             return "";
         }
 
         
 
         if(str.startsWith("app") && !str.startsWith("apple"))
         {
             return skip_app_notapple(str.substring(3));
         }
         else
         {
             return str.charAt(0)+skip_app_notapple(str.substring(1));
         }
     }
}

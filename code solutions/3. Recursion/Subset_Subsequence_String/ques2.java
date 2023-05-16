package Subset_Subsequence_String;

public class ques2 {
    public static void main(String[] args) {
        String str="akaapplesh"; 
        //skip_ch1(str, "");
        System.out.println(skip_apple(str));
     }
 
     
     public static String skip_apple(String str)
     {
         if(str.isEmpty())
         {
             
             return "";
         }
 
         
 
         if(str.startsWith("apple"))
         {
             return skip_apple(str.substring(5));
         }
         else
         {
             return str.charAt(0)+skip_apple(str.substring(1));
         }
     }
    
}

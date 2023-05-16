package Subset_Subsequence_String;

public class ques1 {
    public static void main(String[] args) {
       String str="akash"; 
       //skip_ch1(str, "");
       System.out.println(skip_ch2(str));
    }

    /*1st approach */
    public static void skip_ch1(String str,String ans)
    {
        if(str.isEmpty())
        {
            System.out.println(ans);
            return;
        }

        char ch=str.charAt(0);

        if(ch=='a')
        {
            skip_ch1(str.substring(1), ans);
        }
        else
        {
            ans+=ch;
            skip_ch1(str.substring(1), ans);
        }
    }

    /*2nd approach */
    public static String skip_ch2(String str)
    {
        if(str.isEmpty())
        {
            
            return "";
        }

        char ch=str.charAt(0);

        if(ch=='a')
        {
            return skip_ch2(str.substring(1));
        }
        else
        {
            return ch+skip_ch2(str.substring(1));
        }
    }
}

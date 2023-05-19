/*important */
/*Leet code 17. Letter Combinations of a Phone Number */ // but its not the actual code slight changes will require
package Questions;
import java.util.*;
public class PhonePad1 {
    public static void main(String[] args) {
        List<String> res= letterCombinations("23");
        System.out.println(res);
    }
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        pad_comb("", digits,result);
        return result;
    }

    public static void pad_comb(String p_str,String up_str, List<String> result)  // p_str = processed and up_str = unprocessed
    {
        if(up_str.isEmpty())
        {
            //System.out.println(p_str);
            result.add(p_str);
            return;
        }

        //here we are finding the range of characters for the  digit
        int digit=up_str.charAt(0)-'0'; // this will convert '2' into 2
        
        //now the range 
        int start=(digit-1)*3-3; // frr dial pad 2 starts at 0
        int end=(digit-1)*3;    // for dial pad 2 ends at 3 exclusive
        for(int i=start;i<end;i++)
        {
            char ch=(char)('a'+i);
            pad_comb(p_str+ch, up_str.substring(1),result);
        }
    }
    
}

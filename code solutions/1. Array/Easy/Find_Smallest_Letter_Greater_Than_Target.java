/*https://leetcode.com/problems/find-smallest-letter-greater-than-target/ */
package Easy;

public class Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {
        char arr[]={'a','b','c','d','e','f','g','h','i'};
        char letter=nextGreatestLetter(arr,'j');
        System.out.println("nextGreatestLetter of a number is "+ letter);
    }

    public static char nextGreatestLetter(char[] arr, char target)
    {
        int start=0;
        int end=arr.length-1;

        while (start<=end)
        {
            int mid=start + (end-start)/2;
            if((int)target<(int)arr[mid])
            {
                end=mid-1;
            }
            
            else
            {
                start=mid+1;
            }
        }
        return arr[start%arr.length];
    }
}

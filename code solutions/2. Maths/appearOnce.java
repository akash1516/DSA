/*Given an array and every number in array appear twice and only one number appear once .We have find that number */
public class appearOnce {
    public static void main(String[] args) {
        int arr[]={2,3,4,1,2,1,3,6,4};
        int ans=arr[0];
        /* finding the number which is appear once */
        for(int i=1;i<arr.length;i++) 
        {
            ans = ans ^ arr[i];
        }
        System.out.println(ans);
    }
}

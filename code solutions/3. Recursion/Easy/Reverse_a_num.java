package Easy;

public class Reverse_a_num {
    public static void main(String[] args) {
        reverse_num(5489);
        System.out.println(sum);
    }

    static int sum=0;
    public static void reverse_num(int n)
    {
        if(n==0)
        {
            return ;
        }
        int rem=n%10;
        sum=sum*10+rem;
        reverse_num(n/10);
    }
}

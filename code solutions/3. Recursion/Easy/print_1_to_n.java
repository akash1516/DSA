package Easy;

public class print_1_to_n {
    
    public static void main(String[] args) {
        one_to_n(5); 
    }
    public static void one_to_n(int n)
    {
        if (n==0) {
            return;
        }
        one_to_n(n-1);
        System.out.println(n);
        
    }
}

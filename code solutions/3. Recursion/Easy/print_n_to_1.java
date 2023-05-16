package Easy;

/**
 * print_n_to_1
 */
public class print_n_to_1 {

    public static void main(String[] args) {
        n_to_1(5);
    }

    public static void n_to_1(int n)
    {
        if (n==0) {
            return;
        }
        System.out.println(n);
        n_to_1(n-1);
    }
}
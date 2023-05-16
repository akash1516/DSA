/**
 * oddEven
 */
public class oddEven {

    public static void main(String[] args) {
        int num=22;
        System.out.println(isodd(num));
    }

    public static boolean isodd(int num)
    {
        return (num & 1)==1;
    }
}
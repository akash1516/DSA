package Easy;

public class DigitSum {
    public static void main(String[] args) {
        int sum =sum_of_digits(8965);
        System.out.println(sum);
    }

    public static int sum_of_digits(int num)
    {
        if (num == 0)
        {
            return 0;
        }
        return num%10+sum_of_digits(num/10);
    }
}

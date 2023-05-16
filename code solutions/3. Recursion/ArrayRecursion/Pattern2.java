package ArrayRecursion;

public class Pattern2 {

    public static void main(String[] args) {
        printPattern(4,0);
    }

    public static void printPattern(int row,int col)
    {
        if(row==0)
        {
            return;
        }
        if(col<row)
        {
            printPattern(row,col+1);
            System.out.print("*");
            
        }
        else
        {
            printPattern(row-1, 0);
            System.out.println();
            
        }
    }
    
}

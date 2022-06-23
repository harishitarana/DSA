import java.util.Scanner;

public class R3 {

    public static int factorial(int n)
    {
        if(n ==1)
        {
            return 1;
        }

        return n*factorial(n-1);
       



    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        int x=factorial(n);
        System.out.println("Factorial is: "+x);
        

    }
    
}

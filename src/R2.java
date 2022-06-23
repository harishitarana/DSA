import java.util.Scanner;


public class R2 {
    // 1st way


    /* 
    public static void summation(int n,int sum)
    {
        if(n<0)
        {
            System.out.println(sum);        
            return ;
        }

        summation(n-1, sum+n);
    }
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter n:");
      int n = sc.nextInt();
      summation(n,0);
    
    }*/

    //2nd way

    public static int sum(int num) {
        if(num==0)
        return 0;

        return num + sum(num-1);
        
    }

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        int x=sum(n);
        System.out.println("Sum is:"+ x);

        
    }
    
}
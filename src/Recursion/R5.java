public class R5 {

    public static int fibonacci(int x)
    {
        if(x<=1)
        {
            return x;
        }
 
       
        return fibonacci(x-1) + fibonacci(x-2);
    
    }

    public static void main(String args[])
    {
        int y=fibonacci(5);
        System.out.println(y);


    }
    
}

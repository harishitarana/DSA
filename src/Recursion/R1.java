public class R1 {
    public static void name(int i,int n) {
        if(i>3)
        {
            return;
        }
        
        name(i+1,n);
        System.out.println(i);
        
    }
    public static void main(String args[])
    {
        int n=3;
        name(1,3);
 
    }
    
}

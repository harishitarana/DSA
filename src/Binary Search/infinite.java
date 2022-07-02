//Element in infinite sorted array

public class infinite {

    public static int binary(int[] a,int target,int low,int high)
    {
        low =0;
        high =1;

        while(a[high]<target)
        {
            low = high;
            high = 2*high;
        }

        return binary(a, target, low, high);
    }

    public static void main(String args[])
    {
        int[] array={1,2,45,67,78,89,90,99,100};
        int key=78;
        binary(array,key,0,1);
        
    }
    
}

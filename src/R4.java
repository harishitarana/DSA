import java.util.Collection;

public class R4 {

    public static void Reverse(int[]arr,int start,int end)
    {
        int temp;

        if(start >= end/2)
        {
            return ;
        }
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        Reverse(arr, start+1, end-1);
    }

    public static void main(String args[])
    {
        int[] array={1,2,3,4,5,6};
        Reverse(array, 0, array.length-1);
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
    
}

import java.util.*;

public class bubble_sorting
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       int i,j;
       int n=sc.nextInt();
       int[]  arr =new int[n];
       for(i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }
       for(i=0;i<n-1;i++)
       {
           for(j=0;j<n-1-i;j++)
           {
               if(arr[j+1] < arr[j])
               {
                   int temp = arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
           }
       }
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");;
        }
    }
}
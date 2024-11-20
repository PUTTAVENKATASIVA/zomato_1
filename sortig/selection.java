import java.util.Scanner;

public class selection
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j,x=0,m=0;
        int n=sc.nextInt();
        int[]  arr =new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
           for(j=i+1;j<n;j++)
           {
               if(arr[i] > arr[j])
               {
                   int temp = arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    }
}

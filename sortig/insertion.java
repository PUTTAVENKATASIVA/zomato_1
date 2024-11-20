import java.util.Scanner;
public class insertion
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int i,j;
        int n=sc.nextInt();
        int[]  arr =new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=1;i<n;i++)
        {
            j= i-1;
            int temp = arr[i];
            while( j>=0 && arr[j] > temp)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]= temp;
        }
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    }
}

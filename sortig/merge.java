import java.util.Scanner;
public class merge
{
public static void merge(int[] arr, int low, int mid, int end)
{
    int n1= mid+1-low;
    int n2=end-mid;
    int[] larr=new int[n1];
    int[] rarr=new int[n2];
    for(int i=0;i<n1;i++)
    {
        larr[i]=arr[low+i];
    }
    for(int i=0;i<n2;i++)
    {
        rarr[i]=arr[mid+1+i];
    }
    int i=0,j=0,k=low;
    while(i<n1 && j<n2)
    {
        if(larr[i] <=rarr[j])
        {
            arr[k]=larr[i];
            i++;
        }
        else{
            arr[k]=rarr[j];
            j++;
        }
        k++;
    }
    while(i<n1)
    {
        arr[k]=larr[i];
        k++;
        i++;
    }
    while(j<n2)
    {
        arr[k]=larr[j];
        k++;
        j++;
    }
}
    public static void mergesort(int[] arr,int low, int end)
    {
        if(low<end)
        {
            int mid=(low+end)/2;
            mergesort(arr,low,mid);
            mergesort(arr,mid+1,end);
            merge(arr,low,mid,end);
        }
    }
    public static void main(String[] args)
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        mergesort(arr,0,n-1);
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

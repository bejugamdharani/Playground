
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code heint 
  Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   int arr[]=new int[n]; 
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    greatest(n,arr);
    }
  public static void greatest(int n,int arr[])
  {
    int max;
    if(arr[0]>arr[1])
    {
      max=0;
    }
    else
    {
      max=1;
    }
    for(int i=2;i<n;i++)
    {
      if(arr[max]<arr[i])
      {
        max=i;
       // System.out.print(max);
      }
     // else
      //{
        
    
   // System.out.print(max);
   // }
    
}
    System.out.print(max);
}
}
//
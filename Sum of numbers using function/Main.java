import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.print(sum_of_numbers(n));
    }
  public static int sum_of_numbers(int num)
  {
    int i=1,sum=0;
    while(i<=num)
    {
      sum=sum+i;
      i++;
    }
    return sum;
        
	}
}
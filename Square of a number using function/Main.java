import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.print(sum_of_squares(n));
    }
  public static int sum_of_squares(int num)
  {
    int result=num*num;
	
  return result;
}
}
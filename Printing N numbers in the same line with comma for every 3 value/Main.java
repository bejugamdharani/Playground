import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int sr=1;sr<=n;sr++)
    {
      System.out.print(sr);
      if(sr%3==0)
        System.out.print(",");
    }
  }
}
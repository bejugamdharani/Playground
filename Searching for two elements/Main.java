import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      for(int i=0;i<arr_size;i++)
      {
        arr[i]=in.nextInt();
      }
      int search_element1=in.nextInt(),search_element2=in.nextInt();
      int element1index=-1;
      int element2index=-1;
      for(int i=0;i<arr_size;i++)
      {
        if(search_element1==arr[i])
        {
          element1index=i;
        }

          
        if(search_element2==arr[i])
        {
         element2index=i;
        }

}
      System.out.println(element1index);
      System.out.println(element2index);
}
}

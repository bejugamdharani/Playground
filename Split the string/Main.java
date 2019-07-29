import java.util.regex.Matcher;
import java.util.regex.Pattern;
//import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      Pattern ptn = Pattern.compile("(,| |and|or)");
      
      String[] parts = ptn.split(str);
      
      for(String p:parts){
        System.out.println(p);
      }
    }
}
      
      
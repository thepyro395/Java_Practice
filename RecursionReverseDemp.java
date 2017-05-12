import java.util.Scanner;
public class RecursionReverseDemo
{
  //this is a method for reverse
  public static void reverseMethod(int number)
  {
    if(number < 10)
    {
      System.out.println(number);
      return;
    }
    else
    {
      System.out.print(number %  10);
      //method is calling itself causing recursion
      reverseMethod(number / 10);
    }
  }
  public static void main(String[] args)
  {
    int num = 0;
    System.out.println("Input your bymber and press enter:");
    Scanner input = new Scanner(System.in);
    num = input.nextInt();
    System.out.print("Reverse of your input is: ");
    reverseMethod(num);
    System.out.println("");
  }
}

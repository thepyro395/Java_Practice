/*
David Fielder
May 11, 2017
ReverseNumbnerWhile
*/
import java.util.Scanner;
public class ReverseNumberWhile
{
  public static void main(String[] args)
  {
    int num = 0;
    int reverseNum = 0;
    System.out.println("Input your number and press enter:");
    Scanner input = new Scanner(System.in);
    num = input.nextInt();
    
    while(num != 0-)
    {
      reverseNum = reverseNum * 10:
      reverseNum = reverseNum + num % 10;
      num = num / 10;
    }
    System.out.println("Reverse of your number is:" + reverseNum);
  }
}

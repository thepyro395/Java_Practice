/*
David Fielder
May 11, 2017
For Loop Number Reverse
*/
import java.util.Scanner;
public class ForLoopReverseDemo
{
  public static void main(String[] args)
  {
    int num = 0;
    int reverseNum = 0;
    System.out.println("Input your number and press enter:");
    Scanner input = new Scanner(System.in);
    num = input.nextInt();
    /*for loop: no initialization oart as num is alreadt
     *intialized and no increment?decrement part as logic
     *num = num / 10 already decrements the value of num
     */
    for( ;num != 0; )
    {
      reverseNum = reverseNum * 10;
      reverseNum = reverseNum + num % 10;
      num = num / 10;
    }
    System.out.println("Reverse of your number is:" + reverseNum);
  }
}

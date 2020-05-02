import java.util.*;
public class Calculator
{
    public static void main(String args[])
    {
        int flag=0,ch;
        double num1,num2;
        Scanner reader = new Scanner(System.in);
        System.out.println("*******CALCULATOR PROGRAM*******");
        do
        {
            System.out.println("1) Addition");
            System.out.println("2) Subtraction");
            System.out.println("3) Multiplication");
            System.out.println("4) Division");
            System.out.println("5) Exit");
            System.out.print("Enter choice: ");
            ch = reader.nextInt();
            if(ch==5)
            {
                flag = 1;
            }
            else
            {
                switch(ch)
                {
                case 1:
                System.out.println("Addition");
                System.out.print("Enter 1st Number: ");
                num1 = reader.nextDouble();
                System.out.print("Enter 2nd Number: ");
                num2 = reader.nextDouble();
                System.out.println(num1+num2);
                break;
                case 2:
                System.out.println("Subtraction");
                System.out.print("Enter 1st Number: ");
                num1 = reader.nextDouble();
                System.out.print("Enter 2nd Number: ");
                num2 = reader.nextDouble();
                System.out.println(num1-num2);
                break;
                case 3:
                System.out.println("Multiplication");
                System.out.print("Enter 1st Number: ");
                num1 = reader.nextDouble();
                System.out.print("Enter 2nd Number: ");
                num2 = reader.nextDouble();
                System.out.println(num1*num2);
                break;
                case 4:
                System.out.println("Division");
                System.out.print("Enter 1st Number: ");
                num1 = reader.nextDouble();
                System.out.print("Enter 2nd Number: ");
                num2 = reader.nextDouble();
                System.out.println(num1/num2);
                break;
                default: System.out.println("Exiting");
                flag=1;
                }
            }
            System.out.println("\n");
            }while(flag==0);
    }
}

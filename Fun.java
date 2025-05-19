import java.util.Scanner;
import java.util.Random;

class Fun
{
public static void main(String [] args)
{
Scanner sc= new Scanner(System.in);
int i=1;
while(i!=3)
{
System.out.println("choose");
System.out.println("0 for Rock");
System.out.println("1 for Scissor");
System.out.println("2 for Paper");
int op=sc.nextInt();
//try
//{
//if(op>=3)
//{
//System.out.println("invalid choise please choose between 0 to 2");
//}
//continue;
//catch(Exception e)
//{
//System.out.println("invalid choise please choose between 0 to 1");
//}

Random random = new Random();
int p=random.nextInt(3);
if(op==p)
{
System.out.println("you both chose the same number");
System.out.println("you both got one point each");
}
else if(op==0&&p==1||op==1&&p==2||op==2&&p==0)
{
System.out.println(" congrates!!you won");
}
else
{
System.out.println(" sorry you lost ");
}
System.out.println("computer choise="+p);
i++;

}
}
}
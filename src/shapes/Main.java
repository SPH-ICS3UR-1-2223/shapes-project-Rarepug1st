package shapes;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);

int userchoice;
Rectangle rr = null;
Triangle tt = null;
Circle cc = null;

do  {
	System.out.println("");
	System.out.println("Select your shape");
     System.out.println("triangle");
     System.out.println("circle");
     System.out.println("rectangle");
     System.out.println("Shutdown");
System.out.println("_______");
userchoice = in.nextInt();

if (userchoice == 1)
{
	
	System.out.println("You have choosen triangle");
	System.out.println("please choose a number for all your sides");
	System.out.println("input a number for side a,b, and c (please click enetr after every number)");
	tt = new Triangle(in.nextDouble(), in.nextDouble(), in.nextDouble());
	tt.printStats();
	System.out.println("###############");
	} 
else if (userchoice== 2) 
{ 
	System.out.println("you have choosen circle");
	System.out.println("please input a radius");
	cc = new Circle(in.nextDouble());
	cc.printStats(); 
	System.out.println("###############");
	}
else if (userchoice == 3) 
{
	System.out.println("you have choosen ractangle");
	System.out.println("__________________________________");
	System.out.println(" please enter the length and width");
	
	rr = new Rectangle(in.nextDouble(), in.nextDouble());
	rr.printStats();
	System.out.println("###############");
	
}
else if (userchoice == 4) 
{
System.out.println("error...............");
System.out.println("System overload ");
System.out.println("Bye bye!!!!");
System.exit(0);
} 
}while (userchoice !=4);
System.out.println("Loading");
System.out.println("............................................................");
System.out.println("011010101001010101100010101010101010101101010101");
System.out.println("_1_0_1_0_0_0_1_1");

	}

}

import java.util.Scanner;
public class Biodata
{
public  static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Name= ");
String name=input.next();	
System.out.println("Age= ");
int age =input.nextInt();	
System.out.println("Gender= ");
String gender=input.next();	
System.out.println("Gpa= ");
double gpa=input.nextDouble();
System.out.println("Mobile No= ");
long tp=input.nextLong();

System.out.println("Name:<" +name +">" );
System.out.println("Age:<" +age +">");
System.out.println("Gender:<" +gender +">");
System.out.println("Gpa:<"+gpa +">");
System.out.println("Mobile Number:<"+tp +">");


//details
}
}
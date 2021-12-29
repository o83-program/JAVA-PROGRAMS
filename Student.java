package CIE;
import java.util.Scanner;
public class Student
{
Scanner scan=new Scanner(System.in);
public String usn,name;
public int sem;
public void accept()
{
System.out.println("enter usn:");
usn=scan.next();
System.out.println("enter name:");
name=scan.next();
System.out.println("enter sem:");
sem=scan.nextInt();
}
public void display()
{
System.out.println("Name:" +name);
System.out.println("USN:" +usn);
System.out.println("SEM:" +sem);
}
}
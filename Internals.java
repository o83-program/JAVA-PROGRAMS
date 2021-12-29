package CIE;
import java.util.Scanner;
public class Internals extends CIE.Student
{
Scanner Scan=new Scanner(System.in);
public int ciem[]=new int[5];
public void accept()
{
for(int i=0;i<5;i++)
{
System.out.println("enter cie marks of the subject"+(i+1));
ciem[i]=scan.nextInt();
}
}
}
package SEE;
import CIE.*;
import java.util.Scanner;
public class Externals extends CIE.Student
{
Scanner scan=new Scanner(System.in);
public int seem[]=new int[5];
public void accept()
{
for(int i=0;i<5;i++)
{
System.out.println("enter see marks of subject"+(i+1));
seem[i]=scan.nextInt();
}
}
}

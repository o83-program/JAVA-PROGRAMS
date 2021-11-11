import java.util.*;
public class Quadratic
{
public static void main(String args[])
{
float r1,r2;
float a=2,b=3,c=8;
float d=(b*b)-(4*a*c);
System.out.println("enter the  value of a,b and c");
Scanner in=new Scanner(System.in);
a=in.nextInt();
b=in.nextInt();
c=in.nextInt();
if(d>0)
{
r1=((-b)+(float)(Math.sqrt(d)))/(2*a);
r2=((-b)-(float)(Math.sqrt(d)))/(2*a);
System.out.println("roots1"+r1);
System.out.println("roots2"+r2);
}
else if(d==0)
{
r1=r2=(-b/(2*a));
//System.out.println(root1,root2);
}
else
{
System.out.println("the roots are imaginary");
}
}
}

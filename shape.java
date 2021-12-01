

import java.util.Scanner;
abstract class shape
{
    double a,b;
    abstract void printArea();
}
class rectangle extends shape
{
    void getdata(double x, double y)
    {
        a=x;
        b=y;
    }
    void printArea()
    {
        System.out.println("Area of rectangle = "+(a*b));
    }
}
class triangle extends shape
{
    void getdata(double x,double y)
    {
        a=x;
        b=y;
    }
    void printArea()
    {
        System.out.println("Area of triangle = "+(0.5*a*b));
    }
}
class circle extends shape
{
    void getdata(double x)
    {
        a=x;
    }
    void printArea()
    {
        System.out.println("Area of circle = "+(3.14*a*a));
    }
}

public class calc
{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int ch;
        shape si;
        rectangle r = new rectangle();
        triangle t = new triangle();
        circle c = new circle();
        System.out.println("Enter your choice: \n 1.Rectangle \n 2.Triangle \n 3. Circle");
        ch=scan.nextInt();
        switch(ch)
        {
            case 1:System.out.println("Enter length and breadth ");
                   double l = scan.nextDouble();
                   double b = scan.nextDouble();
                   r.getdata(l,b);
                   r.printArea();
                   break;
            case 2:System.out.println("Enter base and height ");
                   double b1 = scan.nextDouble();
                   double h = scan.nextDouble();
                   t.getdata(b1,h);
                   t.printArea();
                   break;
            case 3:System.out.println("Enter radius");
                   double x = scan.nextDouble();
                   c.getdata(x);
                   c.printArea();
                   break;
            default:System.out.println("Invalid input");
        }
    }
}

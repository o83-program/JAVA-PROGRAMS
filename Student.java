import java.util.*;
class Student
{
     String usn;
     String name;
     int n;
     double SGPA=0;
     int totalcredits=0;
     int credits[];
     double marks[];
    Scanner in=new Scanner(System.in);
    void accept()
    {
        System.out.println("enter full name of the student");
        name=sc.nextLine();
        System.out.println("enter usn of the student");
        usn=sc.nextLine();
        System.out.println("enter the number of subjects");
        n=sc.nextInt();
        credits=new int[n];
        marks=new double[n];
        System.out.println("enter details of the subject:");
        for(int i=0;i<n;i++)
        {
        System.out.println("enter the credits for the subjects" +(i+1));
        credits[i]=sc.nextInt();
        System.out.println("enter the marks for the subject" +(i+1));
        marks[i]=sc.nextInt();
        calculate(credits[i],marks[i],i);
       
    }
}
void calculate(int credits, double marks, int j)
{
    totalcredits=totalcredits+credit;
    if(marks>=90 && marks<=100)
    {
         SGPA = SGPA + (10*credit);
    }
    else if(marks>=80 && marks<=89)
    {
    SGPA = SGPA + (9*credit);
    }
    else if(marks>=70 && marks<=79)
    {
      SGPA = SGPA + (8*credit);
    }
    else if(marks>=60 && marks<=69)
    {
     SGPA = SGPA + (7*credit);
    }
    else if(marks>=50 && marks<=59)
    {
     SGPA = SGPA + (6*credit);
    }
    else if(marks>=40 && marks<=49)
    {
     SGPA = SGPA + (5*credit);
    }
     else
     System.out.println("Failed in subject"+(j+1));

}
void Display()
  {
    System.out.println("details of the student: ");
    System.out.println("USN:"+usn);
    System.out.println("Name:"+name);
    System.out.println("SGPA:"+totalcredits);
  }
}
class Main
{
        public static void main(String args[])
        {
        Student s1 = new Student();
        s1.accept();
        s1.Display();
        }
   
}

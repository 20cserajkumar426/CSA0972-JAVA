import java.util.*;
class compare{
public static void main(String args[])
{
Scanner S1=new Scanner(System.in);
System.out.println("enter the username:");
String a=S1.nextLine();
Scanner S2=new Scanner(System.in);
System.out.println("enter other username:");
String b=S1.nextLine();
if(a==b)
{
System.out.println("username is valid:");
}
else
{
System.out.println("username is not valid:");
}
}
}
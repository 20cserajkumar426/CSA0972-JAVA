import java.util.Scanner;
class removevowels {
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.print("Enter the string: ");
String name=input.nextLine();
System.out.print("String after replacing vowels: ");
String n1=name.replaceAll("[aeiouAEIOU]","");
System.out.println(n1);
}
}
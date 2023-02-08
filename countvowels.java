import java.util.*;
class countvowels{
public static void(String args[]){
int count=0;
Scanner S1=new Scanner(System.in)
System.out.println("Enter a string:");
Scanner s=new.nextLine();
for(int i=0;i<s.length();i++){
char ch = s.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
count++;
}
}
System.out.println("number of vowels is"+count);
}
}

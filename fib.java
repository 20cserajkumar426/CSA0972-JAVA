import java.io.*;
import java.util.*;
class fib {
public static void main(String[] args){
int a, i, sum;
Scanner s1 = new Scanner(System.in);
System.out.println("Required numbers: ");
System.out.println("input: ");
System.out.println("Enter the value of N: ");
a = s1.nextInt();
int fabonacci[] = new int[2 * a + 1];
fabonacci[0] = 0;
fabonacci[1] = 1;
sum = 0;      
for (i = 2; i <= 2 * a; i++) {
fabonacci[i] = fabonacci[i - 1] + fabonacci[i - 2];
if (i % 2 == 0)
sum += fabonacci[i];
}
System.out.printf(" sum of fibonacci series till number %d is %d" , a, sum);
}
}
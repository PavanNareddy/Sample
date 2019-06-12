import java.util.Scanner;
class square{
public static void main(String args[]) 
{ 
/*int n,sum=0,t,i,j; 
Scanner s=new Scanner(System.in);
n=s.nextInt();
	 t=1+(2*(n-1));
 i=n; 
 j=1;
   while(i<t) { 
  if(n%2==0) 
  sum+=(2*j)-1;
   else 
   sum+=2*j; 
   j++; 
   i=i+2; 
   }
   System.out.println(sum); 
 */
int a,i,j,count=0;
System.out.println("enter the line of triangle");
Scanner s = new Scanner(System.in);
a=s.nextInt();
for(i=1;i<=a;i++)
{
for(j=1;j<=(2*i)-1;j++)
{ 
}
while(j<=a)
{
count++;
j++;
}
}
System.out.println(count);
}
}
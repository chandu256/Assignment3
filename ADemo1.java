class AgeException extends Exception
{
private int age;
AgeException(int Age)
{
this.Age=Age;
}
public String toString()
void display()
{
System.out.println("Invalid Age:"+Age);
}
}
class ADemo1
{
public static void main(String a[])
{
int age;
try
{
int Age=Integer.parseInt(a[0]);
if(Age<18)
throw new AgeException(Age);
System.out.println("valid Age:"+Age);
}
catch(AgeException ae)
{
ae.display();
System.out.println("ae");
}
}
}
class Thread1 extends Thread
{
public void run()
{ try{
for(int i=0;i<10;i++)
{
System.out.println("Thread");
Thread.sleep(1000);
}}catch(InterruptedException e){}
}
}
class Runnable1 implements Runnable
{
public void run()
{ try{
for(int i=0;i<10;i++)
{
System.out.println("Runnable");
Thread.sleep(1000);
}}catch(InterruptedException e){}
}
}
class TDemo
{
public static void main(String a[])
{
Thread t1=new Thread1();
t1.start();
Runnable1 R=new Runnable1();
Thread t2=new Thread(R);
t2.start();
}
}
package multiThreading;


class MyThread extends Thread       // separate thread class
{
    public void run()
    {
        int i=1;
        while(i<100)
        {
            System.out.println(i+" Hello");
            i++;
        }
    }
}
public class UsingThreadClass
{
    public static void main(String[] args)
    {
        MyThread t=new MyThread();
        t.start();

        int i=1;
        while(i<100)
        {
            System.out.println(i+" World");
            i++;
        }

    }
}

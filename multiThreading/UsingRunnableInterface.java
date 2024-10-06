package multiThreading;

public class UsingRunnableInterface implements Runnable
{
    public void run()       // override the run method
    {
        int i=1;
        while(i<100)
        {
            System.out.println(i+" Hello");
            i++;
        }

    }
    public static void main(String[] args)
    {

        UsingRunnableInterface t=new UsingRunnableInterface();      // object of the same class.
        Thread th=new Thread(t);        // attaching the object of the class to constructor of thread class.
        th.start();     // because th is a thread and not t.

        int i=1;
        while(i<100)
        {
            System.out.println(i+" World");
            i++;
        }

    }

}


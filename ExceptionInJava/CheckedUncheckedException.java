package ExceptionInJava;


class LowBalanceException extends Exception
{
    public String toString()
    {
        String result="Balance should not be less than 5000";
        return result;
    }
}
public class CheckedUncheckedException
{
    static void fun1()
    {
       // FileInputStream f1=new FileInputStream("india.txt");          file not found exception

        try
        {
            throw new LowBalanceException();
        }
        catch(LowBalanceException e)
        {
            System.out.println(e);
        }

    }
    static void fun2()
    {
        fun1();
    }
    static void fun3()
    {
        fun2();
    }

    public static void main(String[] args)
    {
        fun3();
    }
}

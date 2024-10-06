package TempPack;

class ArrayExample
{
    void demoArray()
    {
        int[] ages=new int[3];
        float[] weight=new float[3];
        String[] name=new String[3];

        ages[0]=34;
        ages[1]=40;
        ages[2]=45;

        
    }
}
public class Temp1
{
    public static void main(String[] args)
    {
        //  syntax
        // datatype[] variableName=new dataType[size];

        ArrayExample myObj=new ArrayExample();
        myObj.demoArray();

    }
}
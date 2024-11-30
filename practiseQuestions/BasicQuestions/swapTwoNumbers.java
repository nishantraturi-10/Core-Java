package practiseQuestions.BasicQuestions;

import java.util.*;
public class swapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int var1,var2,temp; // declaring variables.

        System.out.print("Enter the first number :");
        var1=sc.nextInt();
        System.out.print("Enter the second number :");
        var2=sc.nextInt();

        // before swapping
        System.out.println("Before swapping first number is : "+var1);
        System.out.println("Before swapping second number is : "+var2);

        // after swapping
        temp=var1;
        var1=var2;
        var2=temp;

        System.out.println("After swapping first number is : "+var1);
        System.out.println("After swapping second number is : "+var2);
    }
}

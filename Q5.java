import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.print("Enter an operator: (+, -, *, or /)");
        char operator = sc.next().charAt(0);

         switch(operator)
         {
            case '+': System.out.println("The addition of "+num1 +" and "+num2+" = "+ (num1+num2));
            break;
            case '-': System.out.println("The subtraction of " + num1 +" and "+num2+" = "+ (num1-num2));
            break;
            case '*': System.out.println("The multiplication of "+num1 +" and "+num2+" = "+ (num1*num2));
            break;
            case '/': System.out.println("The division of "+num1 +" and "+num2+" = "+ (num1/num2));
            break;
         }
    }
}

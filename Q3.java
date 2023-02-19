import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int cp=sc.nextInt();
        int sp= sc.nextInt();

        int profit,loss;

        if(cp>sp)
        {
            loss=cp-sp;
            System.out.println("The loss is "+loss);
        }

        else if{
            profit=sp-cp;
            System.out.println("The profit is "+ profit);
        }
        else{
            System.out.println("No profit No loss");
        }
    }
}

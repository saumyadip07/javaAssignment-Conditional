import java.util.Scanner;
class Q1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int length= sc.nextInt();
        int breadth= sc.nextInt();

        if(length==breadth)
        {
            System.out.println("It is a Square");

        }
        else{
            System.out.println("It is not a Square");
        }
    }
}
import java.util.Scanner;
public class AddThreeNumbers {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int num1,num2,num3,answer;

        System.out.println("Enter num1" );
        num1 = number.nextInt();
        System.out.println("Enter num2 ");
        num2 = number.nextInt();
        System.out.println("Enter num3 ");
        num3 = number.nextInt();
        answer=num1+num2+num3;
        System.out.println("The sum is : " + answer);











    }
}

//His little sister now wants a program to read three numbers, add them together and print their total.
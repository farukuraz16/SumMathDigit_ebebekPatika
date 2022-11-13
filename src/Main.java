import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        System.out.print("enter a number: ");//get a number from user
        int num = dat.nextInt(), numTemp = num, sum = 0, digit = 0;//we need to have these data types

        while (numTemp != 0) {//find digits of number
            numTemp /= 10;
            digit++;
        }

        for (int i = 0; i < digit; i++) {//get each digit's number
            sum += num % 10;//sum of first digit
            num = num / 10;//change the value of num
        }
        System.out.println("sum all digits = " + sum);
    }
}

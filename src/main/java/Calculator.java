import java.util.Scanner;

public class Calculator {

    public static int add(int...a){
        int TotalSum = 0;

        for (int i = 0; i<a.length; i++){
            TotalSum +=a[i]; }

        return TotalSum; }

    public static int multiply(int... a){
        int TotalSum = 1;
        for (int i = 0; i<a.length; i++){
            TotalSum *= a[i]; }
        return TotalSum; }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("how many no you want to calculate: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] num = new int[size];

        System.out.println("Enter " + size + "  Number");

        for (int i=0; i< num.length; i++) {
            num[i] = scanner.nextInt();
        }

        System.out.println("Sum of Addition numbers = " + (Calculator.add(num)));
        System.out.println(" \n  ");
        System.out.println("Sum of Multiplication numbers = " + (Calculator.multiply(num)));




    }
}

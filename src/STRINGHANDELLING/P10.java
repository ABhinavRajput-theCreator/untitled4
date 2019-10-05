package STRINGHANDELLING;

import java.util.Scanner;

//Index

public class P10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String Input = sc.nextLine();

        System.out.println("Enter the variable");
        String varInput = sc.next();

        System.out.println("Index of the variable is "+Input.indexOf(varInput));
    }
}
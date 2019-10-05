package STRINGHANDELLING;

import java.util.Scanner;

//REPLACE

public class P3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string ");
        String Input = sc.nextLine();

        String a = Input.replaceAll("[AaEeIiOoUu]", "*");
        System.out.println("new string is :"+ a);
    }
}

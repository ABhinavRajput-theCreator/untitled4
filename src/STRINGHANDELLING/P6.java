package STRINGHANDELLING;

import java.util.Scanner;

//UPPERCASE

public class P6 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String Input =sc.nextLine();

        String updated_string= Input.toUpperCase();
        System.out.println("The new string is :"+ updated_string);
    }
}

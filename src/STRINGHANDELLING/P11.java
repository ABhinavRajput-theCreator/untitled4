package STRINGHANDELLING;

import java.util.Scanner;

//New_line

public class P11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the input String = ");
        String input = sc.nextLine();

        System.out.printf("enter the variable ");
        String var = sc.nextLine();

        for (int i = 0; i <input.length() ; i++){
            if (input.charAt(i) == var.charAt(0)){
                System.out.println(i);
            }
        }
    }
}

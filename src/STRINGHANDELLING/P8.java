package STRINGHANDELLING;

import java.util.Scanner;

//Upperweight

public class P8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String Input = sc.nextLine();

        int a_weight = 0;
        int length = Input.length();

        for (int i = 0; i < length; i++) {
            if (Input.charAt(i) >= 'A' && Input.charAt(i) <= 'Z') {
                int wght = (int) Input.charAt(i);

                a_weight = a_weight + wght;

            }   }System.out.println("Weight of upper character" + a_weight);

    }
}

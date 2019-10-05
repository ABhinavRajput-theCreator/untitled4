package STRINGHANDELLING;

import java.util.Scanner;

//Absolute_weight

public class P9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String Input = sc.nextLine();

        int c_wght = 0;
        int upprwght = 0;
        int lwrwght = 0;
        int length = Input.length();

        for (int i = 0; i < length; i++) {
            if (Input.charAt(i) >= 'A' && Input.charAt(i) <= 'Z') {
                int wght = (int) Input.charAt(i);

                upprwght = upprwght + wght;

            }
            if (Input.charAt(i) >= 'a' && Input.charAt(i) <= 'z') {
                int lweight = (int) Input.charAt(i);
                lwrwght = lwrwght + lweight;

            }
        }
        c_wght = upprwght - lwrwght;
        System.out.println("weight of upper character" + c_wght);
    }

}

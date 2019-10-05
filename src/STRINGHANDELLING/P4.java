package STRINGHANDELLING;

import java.util.Scanner;

//MODIFY_PROGRAM

public class P4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.nextLine();
        int c =0;
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i)=='e' || input.charAt(i)=='o' || input.charAt(i)=='u' || input.charAt(i)=='i') {
                char replace = input.charAt(i);
                c += 1;
                switch (c) {
                    case 1:
                        input = input.replace(replace, '*');
                        break;
                    case 2:
                        input = input.replace(replace, '^');
                        break;
                    case 3:
                        input = input.replace(replace, '!');
                        break;
                    case 4:
                        input = input.replace(replace, '*');
                        break;
                    case 5:
                        input = input.replace(replace, '^');
                        break;

                }
            }
        }
        System.out.println("New string is :"+ input);

    }
}
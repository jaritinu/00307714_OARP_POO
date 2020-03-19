package com.OARP.x00307714;

import java.util.Scanner;

public class Main {

    static Scanner sca = new Scanner(System.in);
    static boolean palindrome(String str){
        int i = 0, j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println("Escriba la palabra o frase: ");
        String word = sca.nextLine();
        if (palindrome(word))
            System.out.println("si es palindrome");
        else
            System.out.println("No es palindrome");
    }
}

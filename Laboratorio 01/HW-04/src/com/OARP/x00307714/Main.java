package com.OARP.x00307714;

import java.util.Scanner;

public class Main {
    static Scanner sca = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Ingrese la frase: ");
        String word = sca.nextLine();
        System.out.println("Remplazando 'a' por 'b': " + word.replace('a','b'));
    }
}

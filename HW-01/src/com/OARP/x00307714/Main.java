package com.OARP.x00307714;

public class Main {

    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println("Primeros 20 numeros de la serie fibonacci");
        for(int i = 1; i<=20; i++){
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}

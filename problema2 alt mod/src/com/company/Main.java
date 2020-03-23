package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = new int[100];
        Generate number = new Generate();
           System.out.println("Numere generate, inainte de selectie:\n ");
            number.getRandArrayElement();

            System.out.println("\nNumere generate,dupa selectie: \n");
            number.select6ElementsFromArray();
            number.sortareSelectie();


}}

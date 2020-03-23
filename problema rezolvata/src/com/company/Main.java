package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        Sticks sticks = new Sticks();

        sticks.cit_bete();

        System.out.println("Betisoarele nesortate sunt: ");
        sticks.afis_bete();

        sticks.sort_insertie();

        System.out.println("\n\nBetisoarele sortate sunt:");
        sticks.afis_bete();


    }}


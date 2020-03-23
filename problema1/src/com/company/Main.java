package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException  {
	// write your code here
        Scanner scanner= new Scanner(System.in);
    Interactiv interactiv = new Interactiv();

    char choice;
    System.out.println("......MENIU.......");
    System.out.println(" C - Valori generate aleator");
    System.out.println(" V - Vizualizeaza tabloul");
    System.out.println(" R - reinitializeaza tabloul");
    System.out.println(" I - Sortare prin insertie");
    System.out.println(" B - Sortare prin insertie binara");
    System.out.println(" S - Sortare prin selectie");
    System.out.println(" T - Sortare prin interchimbare");
    System.out.println(" H - Sortare ShakerSort");
    System.out.println(" X - Parasire program");

        do
        {System.out.println("Alegeti o optiune: ");
           choice=scanner.next().charAt(0);
           choice=Character.toUpperCase(choice);
         switch(choice)
            {
                case 'C': interactiv.generateValues();
                break;
                case 'V': interactiv.viewArray(); break;
                case 'R': interactiv.backToInitial(); break;
                case 'I': interactiv.sortareInsertie();break;
                case 'B': interactiv.sortareInsertieBinara();break;
                case 'S': interactiv.sortareSelectie(); break;
                case 'T': interactiv.bubbleSort();break;
                case 'H': interactiv.shakerSort();break;
                case 'X': System.out.println("Ati ales sa parasiti programul! :("); break;
                default: System.out.println("Optiune eronata!"+"\n"+"Mai incearca!"+"\n");}}
        while(choice!='x' && choice!='X');

    }


}

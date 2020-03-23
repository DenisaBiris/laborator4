package com.company;

import java.util.Scanner;

public class Planet {
    public String name;
    public int X;
    public int Y;
    public int Z;
    int n;
    int[][] a = new int[10][10];

    Planet p[] = new Planet[10];

    Scanner scanner = new Scanner(System.in);

    public void citirePlanete() {
        Scanner scanner = new Scanner(System.in);
        //Planet p[] = new Planet[10];
        System.out.println("Cate planete doriti sa luati in considerare?");
        n = scanner.nextInt();
        System.out.println("Introduceti numele si cele 3 coordonate in spatiu pentru cele " + n + " planete.");
        for (int i = 0; i < n; i++) {
            p[i] = new Planet();
            System.out.println("Numele planetei " + (i + 1) + " este: ");
            ((Planet) p[i]).name = scanner.next();
            System.out.println("Coordonata X:");
            ((Planet) p[i]).X = scanner.nextInt();
            System.out.println("Coordonata Y:");
            ((Planet) p[i]).Y = scanner.nextInt();
            System.out.println("Coordonata Z:");
            ((Planet) p[i]).Z = scanner.nextInt();
        }
    }

    public void afisarePlanete() {
        System.out.println("Planetele sunt:");
        for (int i = 0; i < n; i++) {
            System.out.println("Planeta " + (i + 1) + " : " + ((Planet) p[i]).name + "(" + ((Planet) p[i]).X + "," + ((Planet) p[i]).Y + "," + ((Planet) p[i]).Z + ")");
        }
    }

    void distantaDintrePlanete() {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                a[i][j] = (int) Math.sqrt(Math.pow((((Planet) p[i]).X - ((Planet) p[j]).X), 2) + Math.pow((((Planet) p[i]).Y - ((Planet) p[j]).Y), 2) + Math.pow((((Planet) p[i]).Z - ((Planet) p[j]).Z), 2));
                System.out.println("Distanta dintre planeta " + ((Planet) p[i]).name + " si " + ((Planet) p[j]).name + " este:" + a[i][j] + ".");
            }
        }
    }

     public void gasireMinMax()
    {int min,max,j,i1=0,j1=0,i2=0,j2=0;
        min=99999999;
        max=0;
        for(int i=0;i<n;i++)
        {for( j=i+1;j<n;j++){
            if(a[i][j]<min){
                min=a[i][j];
                i1=i;
                j1=j;}
            if(a[i][j]>max){
                max=a[i][j];
                i2=i;
                j2=j;}}}

        System.out.println("Perechea cea mai apropiata este "+((Planet) p[i1]).name +" si "+((Planet) p[j1]).name );
        System.out.println("Distanta minima este "+min+".");
        System.out.println("Perechea cea mai indepartata este "+((Planet) p[i2]).name +" si "+((Planet) p[j2]).name);
        System.out.println("Distanta maxima este "+max+".");

    }

}
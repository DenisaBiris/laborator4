package com.company;

import java.util.Scanner;

public class Sticks {
    public int L;
   public  String colour;

    int nr_sticks;
    Sticks s[] = new Sticks[100];
    Scanner scanner = new Scanner(System.in);


    public void cit_bete()
    {
        do    {
            System.out.println("Dati numarul de bete (5..50) = ");
            nr_sticks = scanner.nextInt();
        }   while ((nr_sticks<5)||(nr_sticks>51));
        for (int i=1;i<=nr_sticks;i++)
        {    s[i] = new Sticks();
            System.out.println("\nDati lungimea batului nr. "+(i+1)+"= ");
            ((Sticks)s[i]).L = scanner.nextInt();
            System.out.println("Dati culoarea batului nr."+(i+1)+"= ");
            ((Sticks)s[i]).colour = scanner.next();  }
    }
    public void afis_bete()  {
        for (int i=1;i<=nr_sticks;i++){
            System.out.println(((Sticks)s[i]).colour +" -> "+ ((Sticks)s[i]).L);  }}




    public void sort_insertie()  {
        int i,j;
        Sticks x;
        for (i=2;i<nr_sticks;i++)
        {   x=s[i];
            j=i-1;
            while (j>0 && ((Sticks)s[j]).L>x.L)
            {      s[j+1]=s[j];
                j--;        }
            s[j+1]=x;     }
    }



}


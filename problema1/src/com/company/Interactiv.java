package com.company;

import java.util.Arrays;
import java.util.Random;

import java.util.Scanner;

import static java.lang.System.currentTimeMillis;

public class Interactiv {
    int v[]=new int[100];
    int copie[]= new int[100];
    int n,i;
    public void generateValues()
    {   Scanner scanner= new Scanner(System.in);

        System.out.println("Cate elemente doriti? ");
        n= scanner.nextInt();
        for(i=1;i<=n;i++)
        {
            Random rand = new Random();
            v[i]=rand.nextInt(100);
            copie[i]=v[i];
        }
    }



    public void viewArray()
    {
        for(i=1;i<=n;i++)
        {
            System.out.println(v[i]);}
    }
    public void backToInitial()
    {
        for(i=1;i<=n;i++)
        {
            v[i]=copie[i];
        }
    }

    public void sortareInsertie() throws InterruptedException
    { long start=currentTimeMillis();
    Thread.sleep((100));
        int x,j;


        for(i=2;i<=n;i++)    // parcurg vectorul nesortat de la a 2-lea element pana la sfarsit

            if (v[i]<v[i-1])   // primul element din vectorul nesortat se plaseaza pe pozitia corespunzatoare

            { x=v[i];      // valoarea lui v[i] se pierde din vectorul nesortat

                j=i-1;

                while (j>=0 && v[j]>x) // mut cu o pozitie spre dreapta toate elementele mai mari decat x=v[i]

                {

                    v[j+1]=v[j];

                    j--;

                }

                v[j+1]=x; // insertia primului element pe pozitia corespunzatoare in vectorul sortat
            }
        long end= currentTimeMillis();
        long duration=end-start;
        System.out.println("Duration:" + duration);

    }

    public void sortareInsertieBinara() throws InterruptedException  {
        long start= currentTimeMillis();
        Thread.sleep(100);
        for (int i = 2; i <=n; i++)
        {
            int x = v[i];

            int j = Math.abs(Arrays.binarySearch(v, 0, i, x) + 1);

            System.arraycopy(v, j, v, j+1, i-j);

            v[j] = x;
    }
        long end= currentTimeMillis();
        long duration=end-start;
        System.out.println("Duration:" + duration);
    }


   public void sortareSelectie() throws InterruptedException
   {long start= currentTimeMillis();
   Thread.sleep(100);
       int i,j,k,x;
       for (i=1;i<n;i++)
       {    k=i;

           // pozitia minima
           x=v[i];
           //retine minimul
           for (j=i+1;j<=n;j++)
               if (v[j]<x)
               {
                   x=v[j];
                   k=j;
               }
           v[k]=v[i];
           v[i]=x;
       }
       long end= currentTimeMillis();
       long duration=end-start;
       System.out.println("Duration:" + duration);

   }

   public void bubbleSort() throws InterruptedException
   {long start= currentTimeMillis();
   Thread.sleep(100);

       int aux,ok=0;
       do{ ok=1;
           for(i=1;i<n;i++)
           {
               if(v[i]>v[i+1]){

                   aux=v[i];
                   v[i]=v[i+1];
                   v[i+1]=aux;
                   ok=0;
               }
           }
       } while(ok==0);
       long end= currentTimeMillis();
       long duration=end-start;
       System.out.println("Duration:" + duration);

   }

 public void shakerSort() throws InterruptedException
 { long start= currentTimeMillis();
 Thread.sleep(100);
     int j,k,l,r,x;
     l=2;r=n;k=n;
     do  {
         for (j=r;j>=l;j--)
             if (v[j-1]>v[j])
             {  x=v[j-1];v[j-1]=v[j];v[j]=x;  k=j;    }
         l=k+1;  for (j=l;j<=r;j++)   if (v[j-1]>v[j])
         {  x=v[j-1];v[j-1]=v[j];v[j]=x;  k=j;    }   r=k-1;
     } while (l<=r);
     long end= currentTimeMillis();
     long duration=end-start;
     System.out.println("Duration:" + duration);

 }



}


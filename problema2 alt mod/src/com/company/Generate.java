package com.company;

import java.util.Random;

public class Generate {
    Random rand = new Random();
    int[] a = new int[100];
    int[] v = new int[100];
    public  void getRandArrayElement() {


        for(int i=0;i<49;i++){
           a[i]=rand.nextInt(100);
           System.out.print(a[i]+" ");}
    }

      public void select6ElementsFromArray()
      {

          for(int i = 0; i<6; i++)
              v[i]=a[rand.nextInt(49)];

      }

      public void sortareSelectie()
      {
          int i,j,k,x,n=6;
          for (i=0;i<n-1;i++)
          { k=i;// pozitia minima
           x=v[i];
           //retine minimul
              for (j=i+1;j<n;j++)
                  if (v[j]<x)   {
                      x=v[j];
                      k=j;   }
                   v[k]=v[i];
                    v[i]=x;   }
      for(i=0;i<n;i++)
      System.out.println(v[i]);}
}

package com.company;

import java.util.Random;

public class Generate {
     int[] items = new int[] {1,3,2,9,85,32,4,8,55,41,20,36,98,24,98,56,74,12,61,48,22,39,5,44,23,77,6,33,34,70,80,90,66,28,29,47,32,37,38,0,10,13,17,58,14,15,36,21,49,50};
     int[] a = new int[100];

     Random rand = new Random();

    public  int getRandArrayElement() {
        return items[rand.nextInt(items.length)];
    }
  public void view()
  { Generate number = new Generate();
        for( int i=0;i<6;i++)
    {
        a[i]=number.getRandArrayElement();
        System.out.println(a[i]);}}

    public void sortareSelectie()
    {  int i,j,k,x,n=6;

        for (i=0;i<n-1;i++)
        {    k=i;

            // pozitia minima
            x=a[i];
            //retine minimul
            for (j=i+1;j<n;j++)
                if (a[j]<x)
                {
                    x=a[j];
                    k=j;
                }
            a[k]=a[i];
            a[i]=x;
        }
 for(i=0;i<n;i++)
     System.out.println(a[i]);
    }
}
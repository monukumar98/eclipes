package ProblemSet;

import java.util.Scanner;

import static java.lang.Math.pow;

public class FindMirrorInverse
{
    public static void main(String[] args)
    {
        System.out.println( mirrorInv());
    }


    public static int mirrorInv()
    {
        for (int i = 10000; i <= 99999; i++)
        {
            if (unique(i))
            {
                int n = i;
                int num = n;
                int inv = 0;
                int c = 1;
                while (n > 0)
                {
                    int r = n % 10;
                    inv += c * pow(10, r - 1);
                    c++;
                    n = n / 10;
                }
                if (num == inv)
                    return num;
                else
                    continue;
            }
        }
        return num;
    }
    public static boolean unique(int n)
    {
        int num =n;
        while(n>0)
        {
            int r = n%10;
           int c= freq(r,num);
           if (c>1)
               return false;
           n = n/10;
        }
        return true;
    }
    public static int freq(int p, int n)
    {
        int c=0;
        while(n>0)
        {
            int r = n%10;
            if(r==p)
                c++;
            n=n/10;
        }
        return c;
    }
}
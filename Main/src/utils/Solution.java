package utils;

import java.util.*;
import java.util.HashSet;

public class Solution {
//        /*
//        Question:1
//        public boolean isEven(int n) {
//            if (n % 2 == 0)
//                return true;
//            else
//                return false;
//        }*/
//
//        /* Question:2
//        public int getLastDigit(String a, String b) {
//        int lastdigit=a.charAt(a.length()-1)-'0';
//
//        if(b.equals("0")) return 1;
//
//        int mod4=0;
//
//        for(char digit:b.toCharArray())
//        {
//            mod4=(mod4*10+(digit-'0'))%4;
//        }
//
//        if(mod4==0) mod4=4;
//
//        int result=0;
//        result=(int)Math.pow(lastdigit,mod4)%10;
//        return result;
//
//        } */
//
//    /*public static  int evenlyDivides(int n) {
//       int count = 0;
//
//
//        if(n==0) return 0;
//
//        int temp=n;
//        while(temp>0)
//        {
//            int digit=temp%10;
//            if(digit !=0&&n%digit==0)
//            {
//                count++;
//            }
//            temp=temp/10;
//        }
//        return count;
//    }*/
//
//       /* public int reverseDigits(int n)
//        {
//            if(n==0) return 0;
//
//            StringBuilder s=new StringBuilder();
//            int temp=n;
//            while (n>0)
//            {
//                int d=n%10;
//                if(d!=0)
//                {
//                    s.append(d);
//                }
//                n=n/10;
//            }
//            return (int)Math.pow(temp,Integer.parseInt(s.toString()));
//        }*/
//        /*public int gcd (int a,int b)
//        {
//            return b==0? a: gcd(b,a%b);
//        }*/
//    /*public static  List<Integer>printDivisor( int n)
//    {
//    List<Integer> list=new ArrayList<>();
//    for(int i=1;i<=n;i++)
//    {
//        if(n%i==0)
//        {
//            list.add(i);
//        }
//    }
//    return list;
//    }*/

   /* public boolean isPrime(int n) {
        if(n<=1)
        {
            return false;
        }
        if (n<=3)
        {
            return true;
        }
        if(n%2==0&&n%3==0)
        {
            return false;
        }

        for (int i=5;i*i<=n;i+=6)
        {
            if(n%i==0&&n%(i+1)==0)
            {
                return false;
            }
        }
        return true;
    }*/

/*public  boolean armstrongNumber(int n)
{
    int temp = n;
    int sum = 0;
    int pow=0;
    while (temp>0)
    {
        int digit=temp%10;
        pow=(int)Math.pow(digit,3);

         sum+=pow;

         temp=temp/10;

    }
    if (sum==n)
    {
        return true;
    }
    return false;
}*/

   /* public boolean isPalindrome(int n)
       {
           StringBuilder s=new StringBuilder();
           int temp=n;
           while (n>0)
            {
                int d=n%10;
                   s.append(d);
               n=n/10;
            }
          int rev=Integer.parseInt(s.toString());
           return rev==temp;
       }*/

   /* public int floorSqrt(int n) {
        int sqt=0;
        sqt=(int)Math.floor(Math.sqrt(n));
        return sqt;
    }*/

    public boolean isPerfectNumber(int num) {

        int sum=0;

        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {

                sum+=i;
            }
        }


        return sum==num;
    }
}

package utils;

import java.util.HashSet;

public class Solution {
    /*
    Question:1
    public boolean isEven(int n) {
        if (n % 2 == 0)
            return true;
        else
            return false;
    }*/

    /* Question:2
    public int getLastDigit(String a, String b) {
    int lastdigit=a.charAt(a.length()-1)-'0';

    if(b.equals("0")) return 1;

    int mod4=0;

    for(char digit:b.toCharArray())
    {
        mod4=(mod4*10+(digit-'0'))%4;
    }

    if(mod4==0) mod4=4;

    int result=0;
    result=(int)Math.pow(lastdigit,mod4)%10;
    return result;

    } */

/*public static  int evenlyDivides(int n) {
   int count = 0;


    if(n==0) return 0;

    int temp=n;
    while(temp>0)
    {
        int digit=temp%10;
        if(digit !=0&&n%digit==0)
        {
            count++;
        }
        temp=temp/10;
    }
    return count;
}*/

    public int reverseDigits(int n)
    {
        if(n==0) return 0;

        StringBuilder s=new StringBuilder();

        while (n>0)
        {
            int d=n%10;
            if(d!=0)
            {
                s.append(d);
            }
            n=n/10;
        }
        return Integer.parseInt(s.toString());
    }

}

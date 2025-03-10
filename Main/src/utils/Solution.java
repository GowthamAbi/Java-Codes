package utils;

public class Solution {
    /*
    Question:1
    public boolean isEven(int n) {
        if (n % 2 == 0)
            return true;
        else
            return false;
    }*/

    /* Question:2 */
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

    }
}

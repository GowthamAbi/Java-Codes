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
       int num1=Integer.parseInt(a);
       int num2=Integer.parseInt(b);
       int result=0;
       double p=0;
        p=Math.pow(num1,num2);
        result=(int) p%10;
        return result;
    }
}

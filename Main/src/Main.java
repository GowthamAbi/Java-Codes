import java.util.*;
import utils.Solution;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
       // int b = sc.nextInt();
        Solution solution=new Solution();

         /* Question:1
         int n=sc.nextInt();
        if(solution.isEven(n))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }*/

        /* Question:2
        String a=sc.nextLine();
        String b=sc.nextLine();
        int getLastDigit= solution.getLastDigit(a,b);
        System.out.println(getLastDigit);*/

        //System.out.println(solution.evenlyDivides(n));

       // System.out.println(solution.reverseDigits(n));

       // System.out.println(solution.gcd(a,b));

        /*List<Integer>divisor=solution.printDivisor(n);

    for(int i=0;i<divisor.size();i++)
    {
        System.out.print(divisor.get(i));
        if(i<divisor.size()-1)
        {
            System.out.print(" ");
        }
    }*/

       /* if(solution.isPrime(n))
        {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }*/

       /* if(solution.armstrongNumber(n))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }*/

        /*if(solution.isPalindrome(n))
        {
            System.out.println("true");
        }else
        {
            System.out.println("false");
        }*/

       // System.out.println(solution.floorSqrt(n));

        if(solution.isPerfectNumber(n))
        {
            System.out.println("true");
        }else
        {
            System.out.println("false");
        }
    }
}
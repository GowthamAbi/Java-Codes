import java.util.*;
import utils.Solution;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        /* Question:2 */
        String a=sc.nextLine();
        String b=sc.nextLine();
        int getLastDigit= solution.getLastDigit(a,b);
        System.out.println(getLastDigit);

    }
}
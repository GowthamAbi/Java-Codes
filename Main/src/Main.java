import java.util.*;
import utils.Odd_Even;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Odd_Even obj = new Odd_Even();
        obj.check(n);
    }
}
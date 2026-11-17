import java.util.*;
public class ternaryoperater{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        String result=(num%2 == 0) ? "Even" : "odd";
        System.out.println(result);
    }
}
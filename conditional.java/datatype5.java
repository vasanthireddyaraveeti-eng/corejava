import java.util.Scanner;
 public class datatype5 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc= new Scanner(System.in);
        int value1=sc.nextInt();
        switch(value1) {
            case 1: 
                System.out.println("CSE");
                break;
            case 2:
                System.out.println("ECE");
                break;
            case 3:
                System.out.println("CST");
                break;
            case 4:
                System.out.println("AIML");
                break;
            case 5: 
                System.out.println("DS");
                break;
            case 6:
                System.out.println("EEE");
                break;
            case 7:
                System.out.println("IT");
                break;
        }
    }
    
}


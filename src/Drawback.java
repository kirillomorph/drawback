import java.util.Scanner;

public class Drawback {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 Drawning Stars\n2 Drawning Square");
        System.out.print("Enter the program you want to call: ");
        String call = sc.nextLine();
        
        if (call.equals("1")) {
            star();
        }
        if (call.equals("2")) {
            square();
        }
        sc.close();
    }

    public static void star () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of star-tringle: ");
        
        int input = sc.nextInt();
        String star = "";

        for (int i = 1; i <= input; i++) {
            
            star += "*";
            System.out.println(star);
            
        }
        sc.close();
    }

    public static void square () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side length of hash-square: ");

        int input = sc.nextInt();
        String square = "";

        int temp = 0; //very interesting variable

        for (int i = 1; i <= input; i++) {
            square += "#";
            temp = i; 
        }

        System.out.println(square);

        for (int i = 1; i < temp; i++) { //more interesting sign for this variable
            System.out.println(square);
        }
        sc.close();
    }
}

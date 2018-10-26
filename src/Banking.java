import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the money :" );
        double total = scanner.nextDouble();
        System.out.println("Enter the interset rate : ");
        int intersetRate = scanner.nextInt();
        System.out.println("Enter the month: ");
        int month = scanner.nextInt();

        double interset;


        for (int i = 0; i<month;i++){
            interset = total * ((intersetRate/100)/12);
            total = total + interset;
        }
        System.out.println("Total interset is: " + total);
    }
}

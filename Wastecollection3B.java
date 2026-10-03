import java.util.Scanner;

public class WasteCollection3B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

    System.out.println("Enter the amount of waste collected (in kgs):");
    double wastecollected = sc.nextDouble();
      if (wastecollected >= 100) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }
         
    }
}

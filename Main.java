import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the clothType  ");
        String userInput = scanner.nextLine();
        {
            if (userInput.equals("cotton")) {
                Defy defy = new Defy();
                defy.wash();
            } else if (userInput.equals("jeans")) {
                Fresh fresh = new Fresh();
                fresh.wash();
            } else {
                LG lg = new LG();
                lg.wash();
            }
        }
    }
}












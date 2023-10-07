import java.util.Random;
import java.util.Scanner;

public class OanTuTi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int playerScore = 0;
        int computerScore = 0;
        
        do {
            System.out.println("Chọn một lựa chọn: ");
            System.out.println("1. Bao");
            System.out.println("2. Kéo");
            System.out.println("3. Kìm");
            System.out.println("0. Dừng");
            
            int playerChoice = scanner.nextInt();
            
            if (playerChoice == 0) {
                break;
            }
            
            int computerChoice = random.nextInt(3) + 1;
            
            System.out.println("Lựa chọn của bạn: " + getPlayerChoice(playerChoice));
            System.out.println("Lựa chọn của máy: " + getPlayerChoice(computerChoice));
            
            int result = getResult(playerChoice, computerChoice);
            
            if (result == 1) {
                System.out.println("Bạn thắng!");
                playerScore++;
            } else if (result == -1) {
                System.out.println("Máy thắng!");
                computerScore++;
            } else {
                System.out.println("Hòa!");
            }
            
            System.out.println("Tỉ số hiện tại: Bạn " + playerScore + " - " + computerScore + " Máy");
            System.out.println();
            
        } while (true);
        
        System.out.println("Kết quả cuối cùng: Bạn " + playerScore + " - " + computerScore + " Máy");
    }
    
    public static String getPlayerChoice(int choice) {
        switch (choice) {
            case 1:
                return "Bao";
            case 2:
                return "Kéo";
            case 3:
                return "Kìm";
            default:
                return "";
        }
    }
    
    public static int getResult(int playerChoice, int computerChoice) {
        if (playerChoice == computerChoice) {
            return 0; // Hòa
        } else if ((playerChoice == 1 && computerChoice == 2) ||
                   (playerChoice == 2 && computerChoice == 3) ||
                   (playerChoice == 3 && computerChoice == 1)) {
            return 1; // Người thắng
        } else {
            return -1; // Máy thắng
        }
    }
}

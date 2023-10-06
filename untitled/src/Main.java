import java.awt.*;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;

        while (true) {
            System.out.println("nhap mot so nguyen: ");
            int n = Integer.parseInt(scanner.nextLine());
            total += n;

            System.out.println("ban co muon tiep tuc nhap? (Y/N)");
            String chose = scanner.nextLine();

            if(!Objects.equals(chose, "N") && !Objects.equals(chose, "Y")) {
                System.out.println("Da co loi say ra");
                break;
            }

            if (Objects.equals(chose, "N")) {
                System.out.println("tong: " + total);
                break;
            }
        }
    }
}

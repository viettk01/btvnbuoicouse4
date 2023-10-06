import java.util.Objects;
import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Please input information of a student: ");
            System.out.println("name: ");
            String name = scanner.nextLine();
            System.out.println("address: ");
            String address = scanner.nextLine();
            System.out.println("age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.println("Information studen:");
            System.out.println("name: " + name);
            System.out.println("address: " + address);
            System.out.println("age: " + age);

            System.out.println("do you want input again? (Y/N)");
            String chose = scanner.nextLine();

            if (!Objects.equals(chose, "Y") && !Objects.equals(chose, "N")) {
                System.out.println("Nhap sai gia tri Y/N");
            }

            if (Objects.equals(chose, "N")) {
                break;
            }
        } while (true);


    }
}

import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 10: ");
        int num = scanner.nextInt();

        for (int i = 1; i <=10; i++){
            int mult = num * i;
            System.out.println(mult);
        }


    }
}

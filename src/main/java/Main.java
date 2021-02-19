import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int n = 0;
        System.out.print("Введите натуральное число: ");
        Scanner console = new Scanner(System.in);
        try {
            n = console.nextInt();
            if (n <= 0) {
                System.out.println("Число не является натуральным");
            } else {
                System.out.println(n);
            }
        } catch (InputMismatchException e){
            System.err.println("Входные данные некорректны");
            console.close();
        }
        Integer[][] array = new CreateArrays().createArrays(n);
        System.out.println(Arrays.deepToString(array));
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // VARIABLES
        int n;
        int total = 0;

        // SCANNER
        Scanner sc = new Scanner(System.in);

        // USER'S VALUES
        do{
            System.out.print("Bir Sayı Giriniz: ");
            n = sc.nextInt();

            if(n % 2 == 0 && n % 4 == 0){
                total += n;
            }

        }while(n % 2 != 1);

        // RESULT
        System.out.println("Girdiğiniz Değerleden Çift ve 4'ün Katları Olan Sayıların Toplamları: " + total);

    }
}

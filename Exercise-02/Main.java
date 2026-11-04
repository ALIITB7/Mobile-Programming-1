
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean eNotifications = true;

        System.out.println("===== Tanzimate E'lana =====");
        System.out.println("1. Fa'al kardan e'lana ha");
        System.out.println("2. Gheyr fa'al kardan e'lana ha");
        System.out.println("3. Namayeshe vaziate e'lana ha");
        System.out.println("4. Bargardandan tanzimat be halate pishfarz");

        System.out.print("Entekhab khod ra vared konid: ");
        int entekhab = input.nextInt();

        switch (entekhab) {

            case 1:
                eNotifications = true;
                System.out.println("E'lana ha fa'al shodand.");
                break;

            case 2:
                eNotifications = false;
                System.out.println("E'lana ha gheyr fa'al shodand.");
                break;

            case 3:
                if (eNotifications) {
                    System.out.println("E'lana ha fa'al hastand.");
                } else {
                    System.out.println("E'lana ha gheyr fa'al hastand.");
                }
                break;

            case 4:
                eNotifications = true;
                System.out.println("Tanzimat be halate pishfarz bargasht.");
                break;

            default:
                System.out.println("Gozine namotabar ast.");
        }

        input.close();
    }
}


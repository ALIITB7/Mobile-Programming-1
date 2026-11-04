
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("hajme internet ra vared konid (GB): ");
        String hajmText = input.nextLine();

        System.out.print("mojodi kife pool ra vared konid (Toman): ");
        String mojodiText = input.nextLine();

        try {

            double hajm = Double.parseDouble(hajmText);
            double mojodi = Double.parseDouble(mojodiText);

            if (!Double.isFinite(hajm) ||
                !Double.isFinite(mojodi) ||
                hajm <= 0 || mojodi < 0) {

                System.out.println("hajm baste ya mojodi kife pool motabar nist.");

            } else {

                double gheymat = hajm * 5000;
                double takhfif = 0;

                if (hajm > 10) {
                    takhfif = gheymat * 0.15;
                }

                double gheymatNahayi = gheymat - takhfif;

                if (mojodi >= gheymatNahayi) {

                    double baghimande = mojodi - gheymatNahayi;

                    System.out.println("kharid movafagh!");
                    System.out.println("mojodi baghimande: " + baghimande + " Toman");

                } else {

                    double kasri = gheymatNahayi - mojodi;

                    System.out.println("mojodi kafi nist!");
                    System.out.println("meghdar kambod: " + kasri + " Toman");
                }
            }

        } catch (NumberFormatException e) {

            System.out.println("voroodi namotabar ast.");

        }

        input.close();
    }
}

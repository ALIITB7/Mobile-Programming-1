
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Hazine kole eshterak ra vared konid (Toman): ");
        String hazineText = input.nextLine();

        System.out.print("Tedad afrad ra vared konid: ");
        String tedadText = input.nextLine();

        try {

            double hazine = Double.parseDouble(hazineText);
            int tedad = Integer.parseInt(tedadText);

            if (hazine < 0) {

                System.out.println("Hazine nemitavanad manfi bashad.");

            } else if (tedad < 0) {

                System.out.println("Tedad afrad nemitavanad manfi bashad.");

            } else if (tedad == 0) {

                System.out.println("Tedad afrad nemitavanad sefr bashad.");

            } else {

                double sahm = hazine / tedad;

                System.out.println("Sahme har nafar: " + sahm + " Toman");
            }

        } catch (NumberFormatException e) {

            System.out.println("Voroodi namotabar ast.");
        }

        input.close();
    }
}


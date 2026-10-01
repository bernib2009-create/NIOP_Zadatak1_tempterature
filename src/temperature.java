import java.util.Locale;
import java.util.Scanner;

class temperature {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count = 0;
        int elevatedCount = 0;
        double min = 0;
        double max = 0;
        double total = 0;

        System.out.println("Unosi izmjerene temperature, 0 za kraj.");

        while (true) {
            System.out.print("Temperatura: ");
            double temperature = input.nextDouble();

            if (temperature == 0) {
                break;
            }

            if (count == 0) {
                min = temperature;
                max = temperature;
            } else {
                if (temperature < min) {
                    min = temperature;
                }
                if (temperature > max) {
                    max = temperature;
                }
            }

            if (temperature > 37.0) {
                elevatedCount++;
            }

            total += temperature;
            count++;
        }

        input.close();

        if (count == 0) {
            System.out.println("Nije uneseno niti jedno mjerenje.");
        } else {

        System.out.printf("\nBroj mjerenja: %d%n", count);
        System.out.printf("Najniža: %.2f%n", min);
        System.out.printf("Najviša: %.2f%n", max);
        System.out.printf("Prosjek: %.2f%n", total / count);
        System.out.printf("Povišenih mjerenja: %d%n", elevatedCount);

        if (elevatedCount > 0) {
            System.out.println("Povišena temperatura zabilježena.");
        } else {
            System.out.println("Sva mjerenja u granicama normale.");
        }
        }
    }
}
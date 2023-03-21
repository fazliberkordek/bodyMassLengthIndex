/**
 * @author fazliberkordek  21 Mart 2023 - 16:31 UTC +3
 */
import java.util.Scanner;
/*todo:
    -Vücut Kitle İndeksi Hesaplama
    -Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
    -Formül:
        -Kilo (kg) / Boy(m) * Boy(m)
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mass;double length;
        // Taking the parameters:
        System.out.print("Please type your length");
        length = input.nextDouble();

        System.out.print("Please type your mass");
        mass = input.nextInt();


        System.out.println("Your body-mass index is : "+ (mass/(length*length)));
    }
}
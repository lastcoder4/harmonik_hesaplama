import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.printf("Lutfen bir sayi giriniz: ");
        int sayi = inp.nextInt();
        float result = 0;
        for(int i = 1; i<= sayi;i++)
        {
            result +=1.0/i;
        }
        System.out.println("girmiş oldugunuz sayının harmonık toplamı asagıdakı gıbıdır : "+ result);

    }
}
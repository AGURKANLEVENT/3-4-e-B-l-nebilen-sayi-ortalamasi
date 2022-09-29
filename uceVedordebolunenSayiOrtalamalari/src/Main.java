import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int k , toplam = 0, sayac = 0;
        double ortalama;

        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen Sayı Giriniz : ");
        k = inp.nextInt();


        for (int i = 1; i<=k; i++){
            if (i % 3 == 0 && i % 4 == 0){
                sayac++;
                System.out.println(i);
                toplam+= i;
            }else {
                continue;
            }
        }
        ortalama = toplam / sayac;
        System.out.println("Ortalama : " + ortalama);

        }
    }

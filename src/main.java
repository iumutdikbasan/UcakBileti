import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        int mesafe, yas, yolculuk;

        Scanner inp = new Scanner(System.in);

        System.out.println("Mesafeyi km türünden giriniz : ");
        mesafe = inp.nextInt();

        System.out.println("Yasinizi Giriniz : ");
        yas = inp.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculuk = inp.nextInt();

        double tutar = (mesafe * 0.10);

        double bebekindirim = (tutar*0.5);

        double cocukindirim = (tutar*0.1);

        double yasliindirim = (tutar*0.3);


        if (yolculuk == 1){
            if(yas<12) {
                System.out.println(tutar - bebekindirim);
            } else if (yas>12 && yas<24) {
                System.out.println(tutar-cocukindirim);
            } else if (yas>24 && yas<65) {
                System.out.println(tutar);
            } else if (yas>65) {
                System.out.println(tutar-yasliindirim);
            }
        }
        else if(yolculuk==2){
            if(yas<12){
                System.out.println(((tutar-bebekindirim)-(tutar-bebekindirim)*0.2)*2);
            }else if (yas>12 && yas<24) {
                System.out.println(((tutar-cocukindirim)-(tutar-cocukindirim)*0.2)*2);
            } else if (yas>24 && yas<65) {
                System.out.println(tutar * 2);
            }
            else if (yas>65) {
                System.out.println(((tutar-yasliindirim)-(tutar-yasliindirim)*0.2)*2);
            }
        }
    }
}


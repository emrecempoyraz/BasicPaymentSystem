import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Tutar Giriniz:");
        double price = inp.nextDouble();

        System.out.print("Kart No Giriniz:");
        String cardNumber = inp.next();

        System.out.print("Son Kullanım Tarihi Giriniz:");
        String expiryDate = inp.next();

        System.out.print("Güvenlik Kodu Giriniz:");
        String cvc = inp.next();

        System.out.println("1-A Bankası\n2-B Bankası\n3-C Bankası\n4-D Bankası");
        System.out.println("Banka Seçiniz:");
        int selectBank = inp.nextInt();


        switch(selectBank){
            case 1:
                ABankasi aPos = new ABankasi("A Bankası","12345","56789");
                aPos.connect("127.1.1.1");
                aPos.payment(price,cardNumber,expiryDate,cvc);
                break;
            case 2:
                BBankasi bPos = new BBankasi("B Bankası","78945","98745");
                bPos.connect("127.1.1.1");
                bPos.payment(price,cardNumber,expiryDate,cvc);
                break;
            default:
                System.out.println("Geçerli Banka Giriniz!");


        }


    }


}
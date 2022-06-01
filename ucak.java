import java.util.Scanner;

public class ucak {
    public static void main(String[] args) {
        int km,yas,tip;
        double hesap;


        Scanner in = new Scanner(System.in);

        System.out.print("Mesafe Girin :");
        km= in.nextInt();
        if(km<=0){
            System.out.print("Hatali Giris :");
        }
        else{
            km=km;
        }
        System.out.print("Yasinizi Girin :");
        yas= in.nextInt();
        if(yas<=0){
            System.out.print("Hatali Giris :");
        }
        else{
            yas=yas;
        }
        System.out.print("Yolculuk Tipi Seciniz:\n 1-)Tek Yon\n 2-)Gidis Donus\n");
        tip= in.nextInt();
        if(tip==1||tip==2){
            tip=tip;
        }
        else{
            System.out.print("Hatali Giris :");
        }


        hesap= km*0.1;


        if(tip==1){
            hesap=hesap;
            if(yas<12){
                hesap=hesap/2;
                System.out.print("Yuzde 50 indirim Uyulandi.. :");

            }
            else if(yas>=12&&yas<=24){
                hesap=hesap*0.9;
                System.out.print("Yuzde 10 indirim Uyulandi.. :");

            } else if (yas>65) {
                hesap=hesap*0.3;
                System.out.print("Yuzde 30 indirim Uyulandi.. :");

            }


        }
        if(tip==2){
            hesap=2*0.8*hesap;
            if(yas<12){
                hesap=hesap/2;
                System.out.print("Yuzde 50 indirim Uyulandi.. :");

            }
            else if(yas>=12&&yas<=24){
                hesap=hesap*0.9;
                System.out.print("Yuzde 10 indirim Uyulandi.. :");

            } else if (yas>65) {
                hesap=hesap*0.3;
                System.out.print("Yuzde 30 indirim Uyulandi.. :");

            }


        }

        System.out.println(hesap+ "TL");

    }
}

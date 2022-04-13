package _14_Encapsulation.Q01;

public class ArabaMain {

    public static void main(String[] args) {//3.madde main icin ArabaMain
        // Class olustur
        Araba honda = new Araba();//1_) p'siz obj create edildi
        //  honda.setModel("accord");
        honda.setYil(-2018);
        honda.setMotor(90);
        honda.setRenk("kırmızı");


        Araba toyota = new Araba("avensis", "beyaz", 300, -2020);//2_)p'li obj create edildi
        Araba volvo = new Araba("s80", "füme", 2400, 2010);//3_)p'li obj create edildi
        Araba haciMurat = new Araba(400, -1974);

        System.out.println("honda ne ararsan var onda "+honda);//toString() methodu olmazsa bu obj referns değeri print eder
        System.out.println("volvo  aracı "+volvo);
        System.out.println("sectiginiz arac toyota -> " + " modeli :" + toyota.getModel() + " renk :" + toyota.getRenk() +
                " motor gücü : " + toyota.getMotor() + " yılı : " + toyota.getYil());
        System.out.println("hacii"+haciMurat);

    }
}



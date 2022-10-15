package Bordro;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ocak {
    double tavan = 37530.0;

    double sgkgun = 1250;
    double sgk1;
    double sgkisz;
    double devirdendusenocak;
    double kummatOcak ;
    double gvkesOcak = 0;
    double dvind = 37.98;
    double gvind = 638.01;
    double kestop;
    double net;

    double calgunocak;

    double dvocak;
    double devirgvkesOcak;

    double fmmesaiOcak = 0;

    double toplambrutOcak =0;
    double sgkdevredenocak;
    double guntutar = 0;
    double ayucret;
    double gunluktbrutOcak;
   double toplambrutocakgun;
   double brutucretocak;
   double primtutarocak;

  double ocakdankalansgk;
  double beso  ;

  double bes1;

    public double getBeso() {
        return beso;
    }

    public void setBeso(double beso) {
        this.beso = beso;
    }

    public double getOcakdankalansgk() {
        return ocakdankalansgk;
    }

    public void setOcakdankalansgk(double ocakdankalansgk) {
        this.ocakdankalansgk = ocakdankalansgk;
    }

    public double getDvocak() {
        return dvocak;
    }

    public void setDvocak(double dvocak) {
        this.dvocak = dvocak;
    }

    public double getDevirdendusenocak() {
        return devirdendusenocak;
    }

    public void setDevirdendusenocak(double devirdendusenocak) {
        this.devirdendusenocak = devirdendusenocak;
    }

    public double getPrimtutarocak() {
        return primtutarocak;
    }

    public void setPrimtutarocak(double primtutarocak) {
        this.primtutarocak = primtutarocak;
    }

    public double getBrutucretocak() {
        return brutucretocak;
    }

    public void setBrutucretocak(double brutucret) {
        this.brutucretocak = brutucret;
    }

    public double getCalgunocak() {
        return calgunocak;
    }

    public void setCalgunocak(double calgun) {
        this.calgunocak = calgunocak;
    }

    public double getDevirgvkesOcak() {
        return devirgvkesOcak;
    }

    public void setDevirgvkesOcak(double devirgvkesOcak) {
        this.devirgvkesOcak = devirgvkesOcak;
    }

    public double getToplambrutocakgun() {
        return toplambrutocakgun;
    }

    public void setToplambrutocakgun(double toplambrutocakgun) {
        this.toplambrutocakgun = toplambrutocakgun;
    }

    public double getTavan() {
        return tavan;
    }

    public void setTavan(double tavan) {
        this.tavan = tavan;
    }

    public double getSgkgun() {
        return sgkgun;
    }

    public void setSgkgun(double sgkgun) {
        this.sgkgun = sgkgun;
    }

    public double getSgk1() {
        return sgk1;
    }

    public void setSgk1(double sgk1) {
        this.sgk1 = sgk1;
    }

    public double getSgkisz() {
        return sgkisz;
    }

    public void setSgkisz(double sgkisz) {
        this.sgkisz = sgkisz;
    }

    public double getDvOcak() {
        return dvocak;
    }

    public void setDvOcak(double dvocak) {
        this.dvocak = dvocak;
    }

    public double getKummatOcak() {
        return kummatOcak;
    }

    public void setKummatOcak(double kummatOcak) {
        this.kummatOcak = kummatOcak;
    }

    public double getGvkesOcak() {
        return gvkesOcak;
    }

    public void setGvkesOcak(double gvkesOcak) {
        this.gvkesOcak = gvkesOcak;
    }

    public double getDvind() {
        return dvind;
    }

    public void setDvind(double dvind) {
        this.dvind = dvind;
    }

    public double getGvind() {
        return gvind;
    }

    public void setGvind(double gvind) {
        this.gvind = gvind;
    }

    public double getKestop() {
        return kestop;
    }

    public void setKestop(double kestop) {
        this.kestop = kestop;
    }

    public double getNet() {
        return net;
    }

    public void setNet(double net) {
        this.net = net;
    }

    public double getFmmesaiOcak() {
        return fmmesaiOcak;
    }

    public void setFmmesaiOcak(double fmmesaiOcak) {
        this.fmmesaiOcak = fmmesaiOcak;
    }

    public double getToplambrutOcak() {
        return toplambrutOcak;
    }

    public void setToplambrutOcak(double toplambrutOcak) {
        this.toplambrutOcak = toplambrutOcak;
    }

    public double getSgkdevredenocak() {
        return sgkdevredenocak;
    }

    public void setSgkdevredenocak(double sgkdevredenocak) {
        this.sgkdevredenocak = sgkdevredenocak;
    }

    public double getGuntutar() {
        return guntutar;
    }

    public void setGuntutar(double guntutar) {
        this.guntutar = guntutar;
    }

    public double getAyucret() {
        return ayucret;
    }

    public void setAyucret(double ayucret) {
        this.ayucret = ayucret;
    }

    public double getGunluktbrutOcak() {
        return gunluktbrutOcak;
    }

    public void setGunluktbrutOcak(double gunluktbrutOcak) {
        this.gunluktbrutOcak = gunluktbrutOcak;
    }



    public double ocak(double sgkisz, double jummatOcak, double net) {


            Scanner scan = new Scanner(System.in);
            System.out.println("Calisma gun sauisini giriniz");
            double gun = scan.nextDouble() ;
            System.out.println("Lutfen ucretibizi girin");
            double ucret = scan.nextDouble();
            System.out.println("Lutfen mesai surenizi giriniz");
            int mesai = scan.nextInt();
            System.out.println("prim brut tutarini giriniz");
            double prim = scan.nextDouble();
            System.out.println ("BES KESINTISI BARSA (1) TUSUNA BASUNUZ");
            int beso = scan.nextInt ();


            calgunocak = gun;
            brutucretocak = ucret / 30*calgunocak;
            primtutarocak = prim;
            guntutar = ucret / 30;
            ayucret = guntutar * gun;
            fmmesaiOcak = ucret /225*1.5*mesai;
            System.out.println("MESAI TUTARI : " + fmmesaiOcak);
            toplambrutOcak = ayucret + fmmesaiOcak + prim;
            System.out.println("TOPLAM BRUT  :" + toplambrutOcak);

            gunluktbrutOcak = toplambrutOcak /30*gun;
            sgkgun = tavan/30;

        if ( beso == 1){
            bes1 =  toplambrutOcak *0.03;
        }else {
            bes1 = 0;
        }


                if( (toplambrutOcak <= (sgkgun *gun))){
                        sgk1 = toplambrutOcak * 0.14;
                        System.out.println("SGK ISCI KESINTI  :" + sgk1);
                    }
                    else {
                        sgk1 = ((tavan /30)*gun)* 0.14;
                        System.out.println(" SGK ISCI KESINTI  : " + sgk1);
                    }


            if(toplambrutOcak <= (sgkgun * gun))  {

                sgkisz = toplambrutOcak * 0.01;
                System.out.println ( "SGK ISSIZLIK  :" + sgkisz );
            }
                else {
                    sgkisz = ((tavan /30)*gun) * 0.01;
                    System.out.println("SGK ISSIZLIK  :" + sgkisz);
                }

            if (toplambrutOcak > tavan){
                ocakdankalansgk = toplambrutOcak- tavan;
                System.out.println ("OCAKDAN KALAN SGK  : " + ocakdankalansgk);
            }else {
                ocakdankalansgk = 0 ;
                System.out.println ("OCAKDAN KALAN SGK  : " + ocakdankalansgk);
            }


            dvocak = (toplambrutOcak * 0.00759);
            System.out.println("DAMGA VERGISI  INDIRIMSIZ  : " + dvocak);

            kummatOcak = toplambrutOcak - (sgk1 + sgkisz);

            System.out.println("KUMULATIF MATRAH  :" + kummatOcak);


            if (kummatOcak <= 32000.0) {
                gvkesOcak = kummatOcak * 0.15;
                System.out.println("GELIR VERGISI  INDIRIMSIZ  :" + gvkesOcak);
            }
            else if (kummatOcak <= 70000.0){
                gvkesOcak = 4800 + (kummatOcak - 32000.0) *0.20;
                System.out.println("GELIR VERGISI  INDIRIMSIZ  :" + gvkesOcak);
            }
            else if (kummatOcak <= 250000.0){
                gvkesOcak = 12400.0 + (kummatOcak - 70000.0) *0.27;
                System.out.println("GELIR VERGISI INDIRIMSIZ  :" + gvkesOcak);
            }
            else if (kummatOcak <= 880000.0){
                gvkesOcak = 61000.0 + (kummatOcak - 250000.0) *0.35;
                System.out.println("GELIR VERGISI INDIRIMSIZ  :" + gvkesOcak);
            }
            else if (kummatOcak > 880000.0){
                gvkesOcak = 281500.0 + (kummatOcak - 880000.0) *0.40;
                System.out.println("GELIR VERGISI INDIRIMSIZ  :" + gvkesOcak);
            }


           sgkdevredenocak = ocakdankalansgk;
        System.out.println ("OCAK AYINDA DEVREDEN SGK  : " + sgkdevredenocak);

        System.out.println ("BES  : " + bes1);
            kestop = gvkesOcak + sgk1 + sgkisz + dvocak +bes1;
            net = (toplambrutOcak - kestop) + (gvind + dvind);
            System.out.println("NET UCRET  : " + net);

                devirgvkesOcak = gvkesOcak;
            System.out.println ("OCAK AYI KUMULATIF MATRAH  : " + gvkesOcak);
        String FILE_NAME = "OCAK_BORDRO.xlsx";

        XSSFWorkbook wb = new XSSFWorkbook ();
        XSSFSheet cs = wb.createSheet ( "BORDRO_2022" );
        //Sheet cs = wb.createSheet("Sayfa1");  //diger bir sheet tanimlama yontemi
        Object[][] table = {
                {"CG", "UCRET", "FM", "PRIM", "TOPLAM_BRUT","SGK_ISCI", "SGKISZ_ISCI", "SGK_DEVIR", "SGK_DEVDUS",
                        "DAMGA_VER", "GV", "KUM_GV","KES_TOP", "NET_ODEME"},
                {calgunocak, brutucretocak, primtutarocak, fmmesaiOcak, toplambrutOcak,
                        sgk1, sgkisz, sgkdevredenocak, ocakdankalansgk, dvocak, gvkesOcak, kummatOcak, kestop, net}

        };
        int satirNo = 0;
        System.out.println ( "Excel dosyasi olusturuluyor" );
        for (Object[] tablosatir : table) {
            Row satir = cs.createRow ( satirNo );
            int sutunNo = 0;
            for (Object tabloHucre : tablosatir) {
                Cell hucre = satir.createCell ( sutunNo++ );
                if (tabloHucre instanceof String) {
                    hucre.setCellValue ( (String) tabloHucre );

                } else if (tabloHucre instanceof Double) {
                    hucre.setCellValue ( (Double) tabloHucre );
                }
            }

        }
        try {
            FileOutputStream fos = new FileOutputStream ( FILE_NAME );

            wb.write ( fos );
            wb.close ();

        } catch (FileNotFoundException e) {
            System.out.println ( "dosya bulunamadi hatasi/n" + e.toString () );
        } catch (IOException e) {
            System.out.println ( "Dosya Yazdirma hatasi/n" + e.toString () );
        }
        System.out.println ( "Veriler Excel Dosyasina Yazdirildi" );


        return 0;



    }


}


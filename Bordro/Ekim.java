package Bordro;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ekim extends Eylul {
    public Ekim() {
        this.setKummateylul ( getKummateylul () );
        this.setDevirgvmeylul ( getDevirgvmeylul () );
        this.setSgkdevredeneylul ( getSgkdevredeneylul () );
        this.setEyluldankalansgk ( getEyluldankalansgk () );

    }


    double tavan2 = 48532.50;
    double dvind2 = 49.12;
    double gvind4 = 1100.07;
    double sgk10;
    double sgkiszek;
    double dvek;
    double netek;
    double kestopek;
    double ekimmat;
    double kummatekim;
    double gvkesekim = 0;

    double fmmesaiekim;

    double gunlukbrutEK2;

    double gunlukbrutEKIM;

    double toplambrutEKIM = 0;
    double sgktoplambrutEKIM;
    double sgkdevredenekim;
    double devirgvmekim;

    double guntutar;
    double ayucret;
    double gunluktbrut;
    double ekimdankalansgk;
    double eylekmtdevirsgk;
    double calgunekim;

    double brutucretekim;

    double primtutarekim;
    double eyluldevirdendusensgk;
    double beso  ;

    double bes10;

    @Override
    public double getBeso() {
        return beso;
    }

    @Override
    public void setBeso(double beso) {
        this.beso = beso;
    }

    public double getBes10() {
        return bes10;
    }

    public void setBes10(double bes10) {
        this.bes10 = bes10;
    }

    public double getEyluldevirdendusensgk() {
        return eyluldevirdendusensgk;
    }

    public void setEyluldevirdendusensgk(double eyluldevirdendusensgk) {
        this.eyluldevirdendusensgk = eyluldevirdendusensgk;
    }

    @Override
    public double getTavan2() {
        return tavan2;
    }

    @Override
    public void setTavan2(double tavan2) {
        this.tavan2 = tavan2;
    }

    @Override
    public double getDvind2() {
        return dvind2;
    }

    @Override
    public void setDvind2(double dvind2) {
        this.dvind2 = dvind2;
    }

    @Override
    public double getGvind4() {
        return gvind4;
    }

    @Override
    public void setGvind4(double gvind4) {
        this.gvind4 = gvind4;
    }

    public double getSgk10() {
        return sgk10;
    }

    public void setSgk10(double sgk10) {
        this.sgk10 = sgk10;
    }

    public double getSgkiszek() {
        return sgkiszek;
    }

    public void setSgkiszek(double sgkiszek) {
        this.sgkiszek = sgkiszek;
    }

    public double getDvek() {
        return dvek;
    }

    public void setDvek(double dvek) {
        this.dvek = dvek;
    }

    public double getNetek() {
        return netek;
    }

    public void setNetek(double netek) {
        this.netek = netek;
    }

    public double getKestopek() {
        return kestopek;
    }

    public void setKestopek(double kestopek) {
        this.kestopek = kestopek;
    }

    public double getEkimmat() {
        return ekimmat;
    }

    public void setEkimmat(double ekimmat) {
        this.ekimmat = ekimmat;
    }

    public double getKummatekim() {
        return kummatekim;
    }

    public void setKummatekim(double kummatekim) {
        this.kummatekim = kummatekim;
    }

    public double getGvkesekim() {
        return gvkesekim;
    }

    public void setGvkesekim(double gvkesekim) {
        this.gvkesekim = gvkesekim;
    }

    public double getFmmesaiekim() {
        return fmmesaiekim;
    }

    public void setFmmesaiekim(double fmmesaiekim) {
        this.fmmesaiekim = fmmesaiekim;
    }

    public double getGunlukbrutEK2() {
        return gunlukbrutEK2;
    }

    public void setGunlukbrutEK2(double gunlukbrutEK2) {
        this.gunlukbrutEK2 = gunlukbrutEK2;
    }

    public double getGunlukbrutEKIM() {
        return gunlukbrutEKIM;
    }

    public void setGunlukbrutEKIM(double gunlukbrutEKIM) {
        this.gunlukbrutEKIM = gunlukbrutEKIM;
    }

    public double getToplambrutEKIM() {
        return toplambrutEKIM;
    }

    public void setToplambrutEKIM(double toplambrutEKIM) {
        this.toplambrutEKIM = toplambrutEKIM;
    }

    public double getSgktoplambrutEKIM() {
        return sgktoplambrutEKIM;
    }

    public void setSgktoplambrutEKIM(double sgktoplambrutEKIM) {
        this.sgktoplambrutEKIM = sgktoplambrutEKIM;
    }

    public double getSgkdevredenekim() {
        return sgkdevredenekim;
    }

    public void setSgkdevredenekim(double sgkdevredenekim) {
        this.sgkdevredenekim = sgkdevredenekim;
    }

    public double getDevirgvmekim() {
        return devirgvmekim;
    }

    public void setDevirgvmekim(double devirgvmekim) {
        this.devirgvmekim = devirgvmekim;
    }

    @Override
    public double getGuntutar() {
        return guntutar;
    }

    @Override
    public void setGuntutar(double guntutar) {
        this.guntutar = guntutar;
    }

    @Override
    public double getAyucret() {
        return ayucret;
    }

    @Override
    public void setAyucret(double ayucret) {
        this.ayucret = ayucret;
    }

    @Override
    public double getGunluktbrut() {
        return gunluktbrut;
    }

    @Override
    public void setGunluktbrut(double gunluktbrut) {
        this.gunluktbrut = gunluktbrut;
    }

    public double getEkimdankalansgk() {
        return ekimdankalansgk;
    }

    public void setEkimdankalansgk(double ekimdankalansgk) {
        this.ekimdankalansgk = ekimdankalansgk;
    }

    public double getEylekmtdevirsgk() {
        return eylekmtdevirsgk;
    }

    public void setEylekmtdevirsgk(double eylekmtdevirsgk) {
        this.eylekmtdevirsgk = eylekmtdevirsgk;
    }

    public double getCalgunekim() {
        return calgunekim;
    }

    public void setCalgunekim(double calgunekim) {
        this.calgunekim = calgunekim;
    }

    public double getBrutucretekim() {
        return brutucretekim;
    }

    public void setBrutucretekim(double brutucretekim) {
        this.brutucretekim = brutucretekim;
    }

    public double getPrimtutarekim() {
        return primtutarekim;
    }

    public void setPrimtutarekim(double primtutarekim) {
        this.primtutarekim = primtutarekim;
    }

    public double ekim(double kummateylul, double devirgvmeylul, double sgkdevredeneylul,
                       double eyluldankalansgk) {


        Scanner scan = new Scanner ( System.in );
        System.out.println ( "Calisma gu sauisini giriniz" );
        double gun = scan.nextDouble ();
        System.out.println ( "Lutfen ucretibizi girin" );
        double ucret = scan.nextDouble ();
        System.out.println ( "Lutfen mesai surenizi giriniz" );
        int mesaim = scan.nextInt ();
        System.out.println ( "prim brut tutarini giriniz" );
        double primekim = scan.nextDouble ();
        System.out.println ("BES KESINTISI BARSA (1) TUSUNA BASUNUZ");
        int beso = scan.nextInt ();
        calgunekim =gun;
        brutucretekim = ucret /30*calgunekim;
        primtutarekim = primekim;
        guntutar = ucret / 30;
        ayucret = guntutar * gun;
        fmmesaiekim = ucret / 225 * 1.5 * mesaim;
        System.out.println ( "MESAO TUTARI  : " + fmmesaiekim );
        toplambrutEKIM = ayucret + fmmesaiekim + primekim;
        System.out.println ( "TOPLAM BRUT  " + toplambrutEKIM );
        gunlukbrutEKIM = (toplambrutEKIM / 30);
        sgktoplambrutEKIM = (toplambrutEKIM + sgkdevredeneylul);
        System.out.println ( "SGK HESAPLANACAK  " + sgktoplambrutEKIM );
        gunlukbrutEK2 = (toplambrutEKIM + sgkdevredeneylul) / 30;
        sgkgun = tavan2 / 30;
        if ( beso == 1){
            bes10 =  toplambrutOcak *0.03;
        }else {
            bes10 = 0;
        }


        if (sgkdevredeneylul <= 0) {
            if (toplambrutEKIM <= (sgkgun * gun)) {

                sgk10 = toplambrutEKIM * 0.14;
                System.out.println ( "SGK ISCI KESINTI  " + sgk10 );
            } else {
                sgk10 = ((tavan2 / 30) * gun) * 0.14;
                System.out.println ( "SGK ISCI KESINTI  " + sgk10 );
            }

            if (toplambrutEKIM <= (sgkgun * gun)) {

                sgkiszek = toplambrutEKIM * 0.01;
                System.out.println ( "SGK ISSIZLIK  :  " + sgkiszek );
            } else {
                sgkiszek = ((tavan2 / 30) * gun) * 0.01;
                System.out.println ( "SGK ISSIZLIK  :" + sgkiszek );
            }


        } else {
            if (((gunlukbrutEKIM * gun) + sgkdevredeneylul) <= (sgkgun * gun)) {

                sgk10 = sgktoplambrutEKIM * 0.14;
                System.out.println ( "SGK ISCI KESINTI  : " + sgk10 );
            } else {
                sgk10 = ((tavan2 / 30) * gun) * 0.14;
                System.out.println ( "SGK ISCI KESINTI  ; " + sgk10 );
            }


            if (((gunlukbrutEKIM * gun) + sgkdevredeneylul) <= (sgkgun * gun)) {

                sgkiszek = sgktoplambrutEKIM * 0.01;
                System.out.println ( "SGK ISSIZLIK  :" + sgkiszek );
            } else {
                sgkiszek = ((tavan2 / 30) * gun) * 0.01;
                System.out.println ( "SGK ISSIZLIK  :" + sgkiszek );
            }
        }

            if (toplambrutEKIM > tavan2) {
                ekimdankalansgk = toplambrutEKIM - tavan2;
            } else {
                ekimdankalansgk = 0;
            }

            dvek = (toplambrutEKIM * 0.00759);
            System.out.println ( "DAMGA VERGISI  :" + dvek );

            ekimmat = toplambrutEKIM - (sgk10 + sgkiszek);
            System.out.println ( "EKOM AYI GV MATRAHI" + ekimmat );

            kummatekim = ekimmat + kummateylul;
            System.out.println ( "KUMULATIF MATRAH EKIM :" + kummatekim );


            if (kummatekim <= 32000.0) {
                gvkesekim = ekimmat * 0.15;
                System.out.println ( "GELIR VERGISI  :" + gvkesekim );
            } else if (kummatekim <= 70000.0) {
                gvkesekim = 4800 + ((kummatekim - 32000) * 0.20) - devirgvmeylul;
                System.out.println ( "GELIR VERGISI  :" + gvkesekim );
            } else if (kummatekim <= 250000.0) {
                gvkesekim = 12400 + ((kummatekim - 70000.0) * 0.27) - devirgvmeylul;
                System.out.println ( "GELIR VERGISI  :" + gvkesekim );
            } else if (kummatekim <= 880000.0) {
                gvkesekim = 61000 + ((kummatekim - 250000.0) * 0.35) - devirgvmeylul;
                System.out.println ( "GELIR VERGISI  :" + gvkesekim );
            } else if (kummatekim > 880000.0) {
                gvkesekim = 281500.0 + ((kummatekim - 880000.0) * 0.40) - devirgvmeylul;
                System.out.println ( "GELIR VERGISI  :" + gvkesekim );
            }


        if(sgkdevredeneylul > 0){
            if(tavan > toplambrutEKIM){
                eyluldevirdendusensgk =  (sgkiszek*100) - toplambrutEKIM;
                System.out.println ("AGUSTOS EYLUL AYI DEVIRDEN DUSEN  : " + eyluldevirdendusensgk);
            }else {
                eyluldevirdendusensgk = 0;
            }

        }else {
            eyluldevirdendusensgk = 0;
            System.out.println ("AGUSTIS EYLUL AYI DEVIRDEN DUSEN  : " + eyluldevirdendusensgk);
        }

        if((sgkdevredeneylul - eyluldevirdendusensgk) <= eyluldankalansgk){
            sgkdevredenekim = (sgkdevredeneylul - eyluldevirdendusensgk) + ekimdankalansgk;
            System.out.println ("SGK DEVREDEN EYLUL EKIM  : " + sgkdevredenekim);


        }else{
            sgkdevredenekim = eyluldankalansgk + ekimdankalansgk;
            System.out.println ("SGK DEVREDEN EYLUL EKIM : " + sgkdevredenekim);

        };
            kestopek = gvkesekim + sgk10 + sgkiszek + dvek + bes10;
            netek = (toplambrutEKIM - kestopek) + (gvind4 + dvind2);
            System.out.println ( "NET UCRET  : " + netek );

            devirgvmekim = devirgvmeylul + gvkesekim;
            System.out.println ( "EKIM DEVREDEN GELIR VERGISI  :" + devirgvmekim );

        String FILE_NAME = "EKIM_BORDRO.xlsx";

        XSSFWorkbook wb = new XSSFWorkbook ();
        XSSFSheet cs = wb.createSheet ( "BORDRO_2022" );
        //Sheet cs = wb.createSheet("Sayfa1");  //diger bir sheet tanimlama yontemi
        Object[][] table = {
                {"CG", "UCRET", "FM", "PRIM", "TOPLAM_BRUT","SGK_ISCI", "SGKISZ_ISCI", "SGK_DEVIR", "SGK_DEVDUS",
                        "DAMGA_VER", "GV", "KUM_GV","KES_TOP", "NET_ODEME"},
                {calgunekim, brutucretekim, primtutarekim, fmmesaiekim, toplambrutEKIM, sgk10, sgkiszek,
                        sgkdevredenekim, ekimdankalansgk, dvek, gvkesekim, kummatekim, kestopek, netek}
        };
        int satirNo = 0;
        System.out.println ( "Excel dosyasi olusturuluyor" );
        for (Object[] tablosatir : table) {
            Row satir = cs.createRow ( satirNo++ );
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



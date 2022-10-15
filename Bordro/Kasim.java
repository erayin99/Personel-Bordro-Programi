package Bordro;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Kasim extends Ekim {
    public Kasim() {
        this.setKummatekim ( getKummatekim () );
        this.setDevirgvmekim ( getDevirgvmekim () );
        this.setSgkdevredenekim ( getSgkdevredenekim () );
        this.setEkimdankalansgk ( getEkimdankalansgk () );

    }


    double tavan2 = 48532.50;
    double dvind2 = 49.12;
    double gvind4 = 1100.07;
    double sgk11;
    double sgkiszk;
    double dvk;
    double netk;
    double kestopk;
    double kasimmat;
    double kummatkasim;
    double gvkeskasim = 0;

    double fmmesaikasim;

    double gunlukbrutK2;

    double gunlukbrutKASIM;

    double toplambrutKASIM = 0;
    double sgktoplambrutKASIM;
    double sgkdevredenkasim;
    double devirgvmkasim;

    double guntutar;
    double ayucret;
    double gunluktbrut;
    double kasimdankalansgk;
    double ekmksmdevirsgk;
    double calgunkasim;

    double brutucretkasim;

    double primtutarkasim;
    double ekimdevirdendusensgk;
    double beso  ;

    double bes11;

    @Override
    public double getBeso() {
        return beso;
    }

    @Override
    public void setBeso(double beso) {
        this.beso = beso;
    }

    public double getBes11() {
        return bes11;
    }

    public void setBes11(double bes11) {
        this.bes11 = bes11;
    }

    public double getEkimdevirdendusensgk() {
        return ekimdevirdendusensgk;
    }

    public void setEkimdevirdendusensgk(double ekimdevirdendusensgk) {
        this.ekimdevirdendusensgk = ekimdevirdendusensgk;
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

    public double getSgk11() {
        return sgk11;
    }

    public void setSgk11(double sgk11) {
        this.sgk11 = sgk11;
    }

    public double getSgkiszk() {
        return sgkiszk;
    }

    public void setSgkiszk(double sgkiszk) {
        this.sgkiszk = sgkiszk;
    }

    public double getDvk() {
        return dvk;
    }

    public void setDvk(double dvk) {
        this.dvk = dvk;
    }

    public double getNetk() {
        return netk;
    }

    public void setNetk(double netk) {
        this.netk = netk;
    }

    public double getKestopk() {
        return kestopk;
    }

    public void setKestopk(double kestopk) {
        this.kestopk = kestopk;
    }

    public double getKasimmat() {
        return kasimmat;
    }

    public void setKasimmat(double kasimmat) {
        this.kasimmat = kasimmat;
    }

    public double getKummatkasim() {
        return kummatkasim;
    }

    public void setKummatkasim(double kummatkasim) {
        this.kummatkasim = kummatkasim;
    }

    public double getGvkeskasim() {
        return gvkeskasim;
    }

    public void setGvkeskasim(double gvkeskasim) {
        this.gvkeskasim = gvkeskasim;
    }

    public double getFmmesaikasim() {
        return fmmesaikasim;
    }

    public void setFmmesaikasim(double fmmesaikasim) {
        this.fmmesaikasim = fmmesaikasim;
    }

    public double getGunlukbrutK2() {
        return gunlukbrutK2;
    }

    public void setGunlukbrutK2(double gunlukbrutK2) {
        this.gunlukbrutK2 = gunlukbrutK2;
    }

    public double getGunlukbrutKASIM() {
        return gunlukbrutKASIM;
    }

    public void setGunlukbrutKASIM(double gunlukbrutKASIM) {
        this.gunlukbrutKASIM = gunlukbrutKASIM;
    }

    public double getToplambrutKASIM() {
        return toplambrutKASIM;
    }

    public void setToplambrutKASIM(double toplambrutKASIM) {
        this.toplambrutKASIM = toplambrutKASIM;
    }

    public double getSgktoplambrutKASIM() {
        return sgktoplambrutKASIM;
    }

    public void setSgktoplambrutKASIM(double sgktoplambrutKASIM) {
        this.sgktoplambrutKASIM = sgktoplambrutKASIM;
    }

    public double getSgkdevredenkasim() {
        return sgkdevredenkasim;
    }

    public void setSgkdevredenkasim(double sgkdevredenkasim) {
        this.sgkdevredenkasim = sgkdevredenkasim;
    }

    public double getDevirgvmkasim() {
        return devirgvmkasim;
    }

    public void setDevirgvmkasim(double devirgvmkasim) {
        this.devirgvmkasim = devirgvmkasim;
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

    public double getKasimdankalansgk() {
        return kasimdankalansgk;
    }

    public void setKasimdankalansgk(double kasimdankalansgk) {
        this.kasimdankalansgk = kasimdankalansgk;
    }

    public double getEkmksmdevirsgk() {
        return ekmksmdevirsgk;
    }

    public void setEkmksmdevirsgk(double ekmksmdevirsgk) {
        this.ekmksmdevirsgk = ekmksmdevirsgk;
    }

    public double getCalgunkasim() {
        return calgunkasim;
    }

    public void setCalgunkasim(double calgunkasim) {
        this.calgunkasim = calgunkasim;
    }

    public double getBrutucretkasim() {
        return brutucretkasim;
    }

    public void setBrutucretkasim(double brutucretkasim) {
        this.brutucretkasim = brutucretkasim;
    }

    public double getPrimtutarkasim() {
        return primtutarkasim;
    }

    public void setPrimtutarkasim(double primtutarkasim) {
        this.primtutarkasim = primtutarkasim;
    }

    public double kasim(double kummatekim, double devirgvmekim, double sgkdevredenekim,
                        double ekimdankalansgk) {


        Scanner scan = new Scanner ( System.in );
        System.out.println ( "Calisma gu sauisini giriniz" );
        double gun = scan.nextDouble ();
        System.out.println ( "Lutfen ucretibizi girin" );
        double ucret = scan.nextDouble ();
        System.out.println ( "Lutfen mesai surenizi giriniz" );
        int mesaim = scan.nextInt ();
        System.out.println ( "prim brut tutarini giriniz" );
        double primkasim = scan.nextDouble ();
        System.out.println ("BES KESINTISI BARSA (1) TUSUNA BASUNUZ");
        int beso = scan.nextInt ();


        calgunkasim =gun;
        brutucretkasim = ucret /30*calgunkasim;
        primtutarkasim = primkasim;
        guntutar = ucret / 30;
        ayucret = guntutar * gun;
        fmmesaikasim = ucret / 225 * 1.5 * mesaim;
        System.out.println ( "MESAI TUTARI  : " + fmmesaikasim );
        toplambrutKASIM = ayucret + fmmesaikasim + primkasim;
        System.out.println ( "TOPLAM BRUT  :" + toplambrutKASIM );
        gunlukbrutKASIM = (toplambrutKASIM / 30);
        sgktoplambrutKASIM = (toplambrutKASIM + sgkdevredenekim);
        System.out.println ( "SGK HESAPLANACAK  :" + sgktoplambrutKASIM );
        gunlukbrutK2 = (toplambrutKASIM + sgkdevredenekim) / 30;
        sgkgun = tavan2 / 30;
        if ( beso == 1){
            bes11 =  toplambrutOcak *0.03;
        }else {
            bes11 = 0;
        }

        if (sgkdevredenekim <= 0) {
            if (toplambrutKASIM <= (sgkgun * gun)) {

                sgk11 = toplambrutKASIM * 0.14;
                System.out.println ( "SGK ISCI KESINTI  " + sgk11 );
            } else {
                sgk11 = ((tavan2 / 30) * gun) * 0.14;
                System.out.println ( "SGK ISCI KESINTI  " + sgk11 );
            }

            if (toplambrutKASIM <= (sgkgun * gun)) {

                sgkiszk = toplambrutKASIM * 0.01;
                System.out.println ( "SGK ISSIZLIK  :  " + sgkiszk );
            } else {
                sgkiszk = ((tavan2 / 30) * gun) * 0.01;
                System.out.println ( "SGK ISSIZLIK  :" + sgkiszk );
            }


        } else {
            if (((gunlukbrutKASIM * gun) + sgkdevredenekim) <= (sgkgun * gun)) {

                sgk11 = sgktoplambrutKASIM * 0.14;
                System.out.println ( "SGK ISCI KESINTI  :" + sgk11 );
            } else {
                sgk11 = ((tavan2 / 30) * gun) * 0.14;
                System.out.println ( "SGK ISCI KESINTI  :" + sgk11 );
            }


            if (((gunlukbrutKASIM * gun) + sgkdevredenekim) <= (sgkgun * gun)) {

                sgkiszk = sgktoplambrutKASIM * 0.01;
                System.out.println ( "SGK ISSIZLIK  :" + sgkiszk );
            } else {
                sgkiszk = ((tavan2 / 30) * gun) * 0.01;
                System.out.println ( "SGK ISSIZLIK  :" + sgkiszk );
            }
        }

            if (toplambrutKASIM > tavan2) {
                kasimdankalansgk = toplambrutKASIM - tavan2;
            } else {
                kasimdankalansgk = 0;
            }

            dvk = (toplambrutKASIM * 0.00759);
            System.out.println ( "DAMGA VERGISI  :" + dvk );

            kasimmat = toplambrutKASIM - (sgk11 + sgkiszk);
            System.out.println ( "KASIM AYI GV MATRAHI  : " + kasimmat );

            kummatkasim = kasimmat + kummatekim;
            System.out.println ( "KUMULATIF MATRAH  :" + kummatkasim );


            if (kummatkasim <= 32000.0) {
                gvkeskasim = kasimmat * 0.15;
                System.out.println ( "GELIR VERGISI  :" + gvkeskasim );
            } else if (kummatkasim <= 70000.0) {
                gvkeskasim = 4800 + ((kummatkasim - 32000) * 0.20) - devirgvmekim;
                System.out.println ( "GELIR VERGISI  :" + gvkeskasim );
            } else if (kummatkasim <= 250000.0) {
                gvkeskasim = 12400 + ((kummatkasim - 70000.0) * 0.27) - devirgvmekim;
                System.out.println ( "GELIR VERGISI  :" + gvkeskasim );
            } else if (kummatkasim <= 880000.0) {
                gvkeskasim = 61000 + ((kummatkasim - 250000.0) * 0.35) - devirgvmekim;
                System.out.println ( "GELIR VERGISI  :" + gvkeskasim );
            } else if (kummatkasim > 880000.0) {
                gvkeskasim = 281500.0 + ((kummatkasim - 880000.0) * 0.40) - devirgvmekim;
                System.out.println ( "GELIR VERGISI  :" + gvkeskasim );
            }


        if(sgkdevredenekim > 0){
            if(tavan > toplambrutKASIM){
                ekimdevirdendusensgk =  (sgkiszk*100) - toplambrutKASIM;
                System.out.println ("EYLUL EKIM AYI DEVIRDEN DUSEN  : " + ekimdevirdendusensgk);
            }else {
                ekimdevirdendusensgk = 0;
            }

        }else {
            ekimdevirdendusensgk = 0;
            System.out.println ("EYLUL EKIM AYI DEVIRDEN DUSEN  : " + ekimdevirdendusensgk);
        }
        if((sgkdevredenekim - ekimdevirdendusensgk) <= ekimdankalansgk){
            sgkdevredenkasim = (sgkdevredenekim - ekimdevirdendusensgk) + kasimdankalansgk;
            System.out.println ("SGK DEVREDEN EKIM KASIM  : " + sgkdevredenkasim);


        }else{
            sgkdevredenkasim = ekimdankalansgk + kasimdankalansgk;
            System.out.println ("SGK DEVREDEN EKIM KASIM : " + sgkdevredenkasim);

        };
            kestopk = gvkeskasim + sgk11 + sgkiszk + dvk + bes11;
            netk = (toplambrutKASIM - kestopk) + (gvind4 + dvind2);
            System.out.println ( "NET UCRET  : " + netk );

            devirgvmkasim = devirgvmekim + gvkeskasim;
            System.out.println ( "KASIM DEVREDEN GELIR VERGISI  :" + devirgvmkasim );

        String FILE_NAME = "KASIM_BORDRO.xlsx";

        XSSFWorkbook wb = new XSSFWorkbook ();
        XSSFSheet cs = wb.createSheet ( "BORDRO_2022" );
        //Sheet cs = wb.createSheet("Sayfa1");  //diger bir sheet tanimlama yontemi
        Object[][] table = {
                {"CG", "UCRET", "FM", "PRIM", "TOPLAM_BRUT","SGK_ISCI", "SGKISZ_ISCI", "SGK_DEVIR", "SGK_DEVDUS",
                        "DAMGA_VER", "GV", "KUM_GV","KES_TOP", "NET_ODEME"},
                {calgunkasim, brutucretkasim, primtutarkasim, fmmesaikasim, toplambrutKASIM, sgk11, sgkiszk,
                        sgkdevredenkasim, kasimdankalansgk, dvk, gvkeskasim, kummatkasim, kestopk, netk}
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



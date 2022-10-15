package Bordro;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Aralik extends Kasim {
    public Aralik() {
        this.setKummatkasim ( getKummatkasim () );
        this.setDevirgvmkasim ( getDevirgvmkasim () );
        this.setSgkdevredenkasim ( getSgkdevredenkasim () );
        this.setKasimdankalansgk ( getKasimdankalansgk () );

    }


    double tavan2 = 48532.50;
    double dvind2 = 49.12;
    double gvind4 = 1100.07;
    double sgk12;
    double sgkiszar;
    double dvar;
    double netar;
    double kestopar;
    double aralikmat;
    double kummataralik;
    double gvkesaralik = 0;

    double fmmesaiaralik;

    double gunlukbrutAR2;

    double gunlukbrutaralik;

    double toplambrutARALIK = 0;
    double sgktoplambrutaralik;
    double sgkdevredenaralik;
    double devirgvmaralik;

    double guntutar;
    double ayucret;
    double gunluktbrut;
    double aralikdankalansgk;
    double ksmaralikmdevirsgk;
    double calgunaralik;

    double brutucretaralik;

    double primtutararalik;

    double kasimdevirdendusensgk;
    double beso  ;

    double bes12;

    @Override
    public double getBeso() {
        return beso;
    }

    @Override
    public void setBeso(double beso) {
        this.beso = beso;
    }

    public double getBes12() {
        return bes12;
    }

    public void setBes12(double bes12) {
        this.bes12 = bes12;
    }

    public double getKasimdevirdendusensgk() {
        return kasimdevirdendusensgk;
    }

    public void setKasimdevirdendusensgk(double kasimdevirdendusensgk) {
        this.kasimdevirdendusensgk = kasimdevirdendusensgk;
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

    public double getSgk12() {
        return sgk12;
    }

    public void setSgk12(double sgk12) {
        this.sgk12 = sgk12;
    }

    public double getSgkiszar() {
        return sgkiszar;
    }

    public void setSgkiszar(double sgkiszar) {
        this.sgkiszar = sgkiszar;
    }

    public double getDvar() {
        return dvar;
    }

    public void setDvar(double dvar) {
        this.dvar = dvar;
    }

    public double getNetar() {
        return netar;
    }

    public void setNetar(double netar) {
        this.netar = netar;
    }

    public double getKestopar() {
        return kestopar;
    }

    public void setKestopar(double kestopar) {
        this.kestopar = kestopar;
    }

    public double getAralikmat() {
        return aralikmat;
    }

    public void setAralikmat(double aralikmat) {
        this.aralikmat = aralikmat;
    }

    public double getKummataralik() {
        return kummataralik;
    }

    public void setKummataralik(double kummataralik) {
        this.kummataralik = kummataralik;
    }

    public double getGvkesaralik() {
        return gvkesaralik;
    }

    public void setGvkesaralik(double gvkesaralik) {
        this.gvkesaralik = gvkesaralik;
    }

    public double getFmmesaiaralik() {
        return fmmesaiaralik;
    }

    public void setFmmesaiaralik(double fmmesaiaralik) {
        this.fmmesaiaralik = fmmesaiaralik;
    }

    public double getGunlukbrutAR2() {
        return gunlukbrutAR2;
    }

    public void setGunlukbrutAR2(double gunlukbrutAR2) {
        this.gunlukbrutAR2 = gunlukbrutAR2;
    }

    public double getGunlukbrutaralik() {
        return gunlukbrutaralik;
    }

    public void setGunlukbrutaralik(double gunlukbrutaralik) {
        this.gunlukbrutaralik = gunlukbrutaralik;
    }

    public double getToplambrutARALIK() {
        return toplambrutARALIK;
    }

    public void setToplambrutARALIK(double toplambrutARALIK) {
        this.toplambrutARALIK = toplambrutARALIK;
    }

    public double getSgktoplambrutaralik() {
        return sgktoplambrutaralik;
    }

    public void setSgktoplambrutaralik(double sgktoplambrutaralik) {
        this.sgktoplambrutaralik = sgktoplambrutaralik;
    }

    public double getSgkdevredenaralik() {
        return sgkdevredenaralik;
    }

    public void setSgkdevredenaralik(double sgkdevredenaralik) {
        this.sgkdevredenaralik = sgkdevredenaralik;
    }

    public double getDevirgvmaralik() {
        return devirgvmaralik;
    }

    public void setDevirgvmaralik(double devirgvmaralik) {
        this.devirgvmaralik = devirgvmaralik;
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

    public double getAralikdankalansgk() {
        return aralikdankalansgk;
    }

    public void setAralikdankalansgk(double aralikdankalansgk) {
        this.aralikdankalansgk = aralikdankalansgk;
    }

    public double getKsmaralikmdevirsgk() {
        return ksmaralikmdevirsgk;
    }

    public void setKsmaralikmdevirsgk(double ksmaralikmdevirsgk) {
        this.ksmaralikmdevirsgk = ksmaralikmdevirsgk;
    }

    public double getCalgunaralik() {
        return calgunaralik;
    }

    public void setCalgunaralik(double calgunaralik) {
        this.calgunaralik = calgunaralik;
    }

    public double getBrutucretaralik() {
        return brutucretaralik;
    }

    public void setBrutucretaralik(double brutucretaralik) {
        this.brutucretaralik = brutucretaralik;
    }

    public double getPrimtutararalik() {
        return primtutararalik;
    }

    public void setPrimtutararalik(double primtutararalik) {
        this.primtutararalik = primtutararalik;
    }

    public double aralik(double kummatkasim, double devirgvmkasim, double sgkdevredenkasim,
                         double kasimdankalansgk) {


        Scanner scan = new Scanner ( System.in );
        System.out.println ( "Calisma gu sauisini giriniz" );
        double gun = scan.nextDouble ();
        System.out.println ( "Lutfen ucretibizi girin" );
        double ucret = scan.nextDouble ();
        System.out.println ( "Lutfen mesai surenizi giriniz" );
        int mesaim = scan.nextInt ();
        System.out.println ( "prim brut tutarini giriniz" );
        double primmara = scan.nextDouble ();
        System.out.println ("BES KESINTISI BARSA (1) TUSUNA BASUNUZ");
        int beso = scan.nextInt ();


        calgunaralik =gun;
        brutucretaralik = ucret /30*calgunaralik;
        primtutararalik = primmara;
        guntutar = ucret / 30;
        ayucret = guntutar * gun;
        fmmesaiaralik = ucret / 225 * 1.5 * mesaim;
        System.out.println ( "MESAI TUTARI  : " + fmmesaiaralik );
        toplambrutARALIK = ayucret + fmmesaiaralik + primmara;
        System.out.println ( "TOPLAM BRUT  " + toplambrutARALIK );
        gunlukbrutaralik = (toplambrutARALIK / 30);
        sgktoplambrutaralik = (toplambrutARALIK + sgkdevredenkasim);
        System.out.println ( "SGK HESAPLANACAK  " + sgktoplambrutaralik );
        gunlukbrutAR2 = (toplambrutARALIK + sgkdevredenkasim) / 30;
        sgkgun = tavan2 / 30;
        if ( beso == 1){
            bes12 =  toplambrutOcak *0.03;
        }else {
            bes12 = 0;
        }

        if (sgkdevredenkasim <= 0) {
            if (toplambrutARALIK <= (sgkgun * gun)) {

                sgk12 = toplambrutARALIK * 0.14;
                System.out.println ( "SGK ISCI KESINTI  " + sgk12 );
            } else {
                sgk12 = ((tavan2 / 30) * gun) * 0.14;
                System.out.println ( "SGK ISCI KESINTI  " + sgk12 );
            }

            if (toplambrutARALIK <= (sgkgun * gun)) {

                sgkiszar = toplambrutARALIK * 0.01;
                System.out.println ( "SGK ISSIZLIK  :  " + sgkiszar );
            } else {
                sgkiszar = ((tavan2 / 30) * gun) * 0.01;
                System.out.println ( "SGK ISSIZLIK  :" + sgkiszar );
            }


        } else {
            if (((gunlukbrutaralik * gun) + sgkdevredenkasim) <= (sgkgun * gun)) {

                sgk12 = sgktoplambrutaralik * 0.14;
                System.out.println ( "SGK ISCI KESINTI" + sgk12 );
            } else {
                sgk12 = ((tavan2 / 30) * gun) * 0.14;
                System.out.println ( "SGK ISCI KESINTI" + sgk12 );
            }


            if (((gunlukbrutaralik * gun) + sgkdevredenkasim) <= (sgkgun * gun)) {

                sgkiszar = sgktoplambrutaralik * 0.01;
                System.out.println ( "SGK ISSIZLIK  :" + sgkiszar );
            } else {
                sgkiszar = ((tavan2 / 30) * gun) * 0.01;
                System.out.println ( "SGK ISSIZLIK  :" + sgkiszar );
            }
        }

            if (toplambrutARALIK > tavan2) {
                aralikdankalansgk = toplambrutKASIM - tavan2;
            } else {
                aralikdankalansgk = 0;
            }

            dvar = (toplambrutARALIK * 0.00759);
            System.out.println ( "DAMGA VERGISI ARALIK  : " + dvar );

            aralikmat = toplambrutARALIK - (sgk12 + sgkiszar);
            System.out.println ( "ARALIK AYI GV MATRAHI  : " + aralikmat );

            kummataralik = aralikmat + kummatkasim;
            System.out.println ( "KUMULATIF MATRAH  ARALIK  : " + kummataralik );


            if (kummataralik <= 32000.0) {
                gvkesaralik = aralikmat * 0.15;
                System.out.println ( "GELIR VERGISI  :" + devirgvmaralik );
            } else if (kummataralik <= 70000.0) {
                gvkesaralik = 4800 + ((kummataralik - 32000) * 0.20) - devirgvmkasim;
                System.out.println ( "GELIR VERGISI  :" + gvkesaralik );
            } else if (kummataralik <= 250000.0) {
                gvkesaralik = 12400 + ((kummataralik - 70000.0) * 0.27) - devirgvmkasim;
                System.out.println ( "GELIR VERGISI  :" + gvkesaralik );
            } else if (kummataralik <= 880000.0) {
                gvkesaralik = 61000 + ((kummataralik - 250000.0) * 0.35) - devirgvmkasim;
                System.out.println ( "GELIR VERGISI  :" + gvkesaralik );
            } else if (kummatkasim > 880000.0) {
                gvkesaralik = 281500.0 + ((kummataralik - 880000.0) * 0.40) - devirgvmkasim;
                System.out.println ( "GELIR VERGISI  :" + gvkesaralik );
            }



        if(sgkdevredenkasim > 0){
            if(tavan > toplambrutARALIK){
                kasimdevirdendusensgk =  (sgkiszar*100) - toplambrutARALIK;
                System.out.println ("EKIM KASIM AYI DEVIRDEN DUSEN  : " + kasimdevirdendusensgk);
            }else {
                kasimdevirdendusensgk = 0;
            }

        }else {
            kasimdevirdendusensgk = 0;
            System.out.println ("EKIM KASIM AYI DEVIRDEN DUSEN  : " + kasimdevirdendusensgk);
        }

        if((sgkdevredenkasim - kasimdevirdendusensgk) <= kasimdankalansgk){
            sgkdevredenaralik = (sgkdevredenkasim - kasimdevirdendusensgk) + aralikdankalansgk;
            System.out.println ("SGK DEVREDEN KASIM ARALIK  : " + sgkdevredenaralik);


        }else{
            sgkdevredenaralik = kasimdankalansgk + aralikdankalansgk;
            System.out.println ("SGK DEVREDEN KASIM ARALIK : " + sgkdevredenaralik);

        };

            kestopar = gvkesaralik + sgk12 + sgkiszar + dvar + bes12;
            netar = (toplambrutARALIK - kestopar) + (gvind4 + dvind2);
            System.out.println ( "NET UCRET  : " + netar );

            devirgvmaralik = 0;
            System.out.println ( "ARALIK DEVREDEN GELIR VERGISI  :" + devirgvmaralik );


        String FILE_NAME = "ARALIK_BORDRO.xlsx";

        XSSFWorkbook wb = new XSSFWorkbook ();
        XSSFSheet cs = wb.createSheet ( "BORDRO_2022" );
        //Sheet cs = wb.createSheet("Sayfa1");  //diger bir sheet tanimlama yontemi
        Object[][] table = {
                {"CG", "UCRET", "FM", "PRIM", "TOPLAM_BRUT","SGK_ISCI", "SGKISZ_ISCI", "SGK_DEVIR", "SGK_DEVDUS",
                        "DAMGA_VER", "GV", "KUM_GV","KES_TOP", "NET_ODEME"},
                {calgunaralik, brutucretaralik, primtutararalik, fmmesaiaralik, toplambrutARALIK, sgk12,
                        sgkiszar, sgkdevredenaralik, aralikdankalansgk, dvar, gvkesaralik, kummataralik,
                        kestopar, netar}

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



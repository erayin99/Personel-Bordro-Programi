package Bordro;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Temmuz extends Haziran {
    public Temmuz() {
        this.setKummatHaziran ( getKummatHaziran () );
        this.setDevirgvmHaziran ( getDevirgvmHaziran () );
        this.setSgkdevredenHaziran (getSgkdevredenHaziran ());
        this.setHazirandankalansgk ( getHazirandankalansgk ());

    }


    double tavan2 = 48532.50;
    double dvind2 = 49.12;
    double gvind2 = 825.05;
    double sgk7;
    double sgkiszt;
    double dvt;
    double nett;
    double kestopt;
    double temmuzmat;
    double kummattemmuz;
    double gvkestemmuz = 0;

    double fmmesaitemmuz ;

    double gunlukbrutT2;

    double gunlukbruttemmuz;

    double toplambruttemmuz =0;
    double sgktoplambruttemmuz;
    double sgkdevredentemmuz;
    double devirgvmtemmuz;

    double guntutar ;
    double ayucret;
    double gunluktbrut;
    double nisanhazdevretmeyensgk;
    double temmuzdankalansgk;
    double hzrbtmmzdevirsgk;
    double calguntemmuz;

    double brutucrettemmuz;

    double primtutartemmuz;
    double hazirandevirdendusensgk;

    double beso  ;

    double bes7;

    @Override
    public double getBeso() {
        return beso;
    }

    @Override
    public void setBeso(double beso) {
        this.beso = beso;
    }

    public double getBes7() {
        return bes7;
    }

    public void setBes7(double bes7) {
        this.bes7 = bes7;
    }

    public double getHazirandevirdendusensgk() {
        return hazirandevirdendusensgk;
    }

    public void setHazirandevirdendusensgk(double hazirandevirdendusensgk) {
        this.hazirandevirdendusensgk = hazirandevirdendusensgk;
    }

    public double getTavan2() {
        return tavan2;
    }

    public void setTavan2(double tavan2) {
        this.tavan2 = tavan2;
    }

    public double getDvind2() {
        return dvind2;
    }

    public void setDvind2(double dvind2) {
        this.dvind2 = dvind2;
    }

    public double getGvind2() {
        return gvind2;
    }

    public void setGvind2(double gvind2) {
        this.gvind2 = gvind2;
    }

    public double getSgk7() {
        return sgk7;
    }

    public void setSgk7(double sgk7) {
        this.sgk7 = sgk7;
    }

    public double getSgkiszt() {
        return sgkiszt;
    }

    public void setSgkiszt(double sgkiszt) {
        this.sgkiszt = sgkiszt;
    }

    public double getDvt() {
        return dvt;
    }

    public void setDvt(double dvt) {
        this.dvt = dvt;
    }

    public double getNett() {
        return nett;
    }

    public void setNett(double nett) {
        this.nett = nett;
    }

    public double getKestopt() {
        return kestopt;
    }

    public void setKestopt(double kestopt) {
        this.kestopt = kestopt;
    }

    public double getTemmuzmat() {
        return temmuzmat;
    }

    public void setTemmuzmat(double temmuzmat) {
        this.temmuzmat = temmuzmat;
    }

    public double getKummattemmuz() {
        return kummattemmuz;
    }

    public void setKummattemmuz(double kummattemmuz) {
        this.kummattemmuz = kummattemmuz;
    }

    public double getGvkestemmuz() {
        return gvkestemmuz;
    }

    public void setGvkestemmuz(double gvkestemmuz) {
        this.gvkestemmuz = gvkestemmuz;
    }

    public double getFmmesaitemmuz() {
        return fmmesaitemmuz;
    }

    public void setFmmesaitemmuz(double fmmesaitemmuz) {
        this.fmmesaitemmuz = fmmesaitemmuz;
    }

    public double getGunlukbrutT2() {
        return gunlukbrutT2;
    }

    public void setGunlukbrutT2(double gunlukbrutT2) {
        this.gunlukbrutT2 = gunlukbrutT2;
    }

    public double getGunlukbruttemmuz() {
        return gunlukbruttemmuz;
    }

    public void setGunlukbruttemmuz(double gunlukbruttemmuz) {
        this.gunlukbruttemmuz = gunlukbruttemmuz;
    }

    public double getToplambruttemmuz() {
        return toplambruttemmuz;
    }

    public void setToplambruttemmuz(double toplambruttemmuz) {
        this.toplambruttemmuz = toplambruttemmuz;
    }

    public double getSgktoplambruttemmuz() {
        return sgktoplambruttemmuz;
    }

    public void setSgktoplambruttemmuz(double sgktoplambruttemmuz) {
        this.sgktoplambruttemmuz = sgktoplambruttemmuz;
    }

    public double getSgkdevredentemmuz() {
        return sgkdevredentemmuz;
    }

    public void setSgkdevredentemmuz(double sgkdevredentemmuz) {
        this.sgkdevredentemmuz = sgkdevredentemmuz;
    }

    public double getDevirgvmtemmuz() {
        return devirgvmtemmuz;
    }

    public void setDevirgvmtemmuz(double devirgvmtemmuz) {
        this.devirgvmtemmuz = devirgvmtemmuz;
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

    @Override
    public double getNisanhazdevretmeyensgk() {
        return nisanhazdevretmeyensgk;
    }

    @Override
    public void setNisanhazdevretmeyensgk(double nisanhazdevretmeyensgk) {
        this.nisanhazdevretmeyensgk = nisanhazdevretmeyensgk;
    }

    public double getTemmuzdankalansgk() {
        return temmuzdankalansgk;
    }

    public void setTemmuzdankalansgk(double temmuzdankalansgk) {
        this.temmuzdankalansgk = temmuzdankalansgk;
    }

    public double getHzrbtmmzdevirsgk() {
        return hzrbtmmzdevirsgk;
    }

    public void setHzrbtmmzdevirsgk(double hzrbtmmzdevirsgk) {
        this.hzrbtmmzdevirsgk = hzrbtmmzdevirsgk;
    }

    public double getCalguntemmuz() {
        return calguntemmuz;
    }

    public void setCalguntemmuz(double calguntemmuz) {
        this.calguntemmuz = calguntemmuz;
    }

    public double getBrutucrettemmuz() {
        return brutucrettemmuz;
    }

    public void setBrutucrettemmuz(double brutucrettemmuz) {
        this.brutucrettemmuz = brutucrettemmuz;
    }

    public double getPrimtutartemmuz() {
        return primtutartemmuz;
    }

    public void setPrimtutartemmuz(double primtutartemmuz) {
        this.primtutartemmuz = primtutartemmuz;
    }

    public double temmuz(double kummatHaziran, double devirgvmHaziran, double sgkdevredenHaziran,
                         double Hazirandankalansgk) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Calisma gu sauisini giriniz");
        double gun = scan.nextDouble() ;
        System.out.println("Lutfen ucretibizi girin");
        double ucret = scan.nextDouble() ;
        System.out.println("Lutfen mesai surenizi giriniz");
        int mesaim = scan.nextInt();
        System.out.println("prim brut tutarini giriniz");
        double primmtem = scan.nextDouble();
        System.out.println ("BES KESINTISI BARSA (1) TUSUNA BASUNUZ");
        int beso = scan.nextInt ();


        calguntemmuz =gun;
        brutucrettemmuz = ucret /30*calguntemmuz;
        primtutartemmuz = primmtem;
        guntutar = ucret / 30;
        ayucret = guntutar * gun;
        fmmesaitemmuz = ucret /225*1.5*mesaim;
        System.out.println("MESAI TUTARI  : " + fmmesaitemmuz);
        toplambruttemmuz = ayucret + fmmesaitemmuz + primmtem;
        System.out.println("TOPLAM BRUT  " + toplambruttemmuz);
        gunlukbruttemmuz = (toplambruttemmuz / 30);
        sgktoplambruttemmuz = (toplambruttemmuz + sgkdevredenHaziran);
        System.out.println("SGK HESAPLANACAK  " + sgktoplambruttemmuz);
        gunlukbrutT2 = (toplambruttemmuz + sgkdevredenHaziran) / 30;
        sgkgun = tavan2 /30;
        if ( beso == 1){
            bes7 =  toplambrutOcak *0.03;
        }else {
            bes7 = 0;
        }

        if(sgkdevredenHaziran <= 0){
            if(toplambruttemmuz <= (sgkgun * gun)){

                sgk7 = toplambruttemmuz * 0.14;
                System.out.println("SGK ISCI KESINTI  " + sgk7);
            }
            else {
                sgk7 =  ((tavan2 /30)*gun) * 0.14;
                System.out.println("SGK ISCI KESINTI  " + sgk7);
            }

            if(toplambruttemmuz <= (sgkgun * gun)){

                sgkiszt = toplambruttemmuz * 0.01;
                System.out.println("SGK ISSIZLIK  :  " + sgkiszt);
            }
            else {
                sgkiszt =  ((tavan2 /30)*gun) * 0.01;
                System.out.println("SGK ISSIZLIK  :" + sgkiszt);
            }


        }
        else{
            if((gunlukbruttemmuz <= sgkgun) && (sgktoplambruttemmuz <= tavan)){

                sgk7 = sgktoplambruttemmuz * 0.14;
                System.out.println( "SGK ISCI KESINTI  : "  +sgk7);
            }
            else {
                sgk7 =  ((tavan2 /30)*gun) * 0.14;
                System.out.println( "SGK ISCI KESINTI  : "  +sgk7);
            }

            if(((gunlukbruttemmuz * gun)+sgkdevredenHaziran) <= (sgkgun * gun)){

                sgkiszt = sgktoplambruttemmuz * 0.01;
                System.out.println("SGK ISSIZLIK  :" + sgkiszt);
            }
            else {
                sgkiszt =  ((tavan2 /30)*gun) * 0.01;
                System.out.println("SGK ISSIZLIK  :" + sgkiszt);
            }

        }
        if (toplambruttemmuz > tavan2){
            temmuzdankalansgk = toplambruttemmuz - tavan2;
        }else {
            temmuzdankalansgk = 0 ;
        }

        dvt = (toplambruttemmuz * 0.00759);
        System.out.println("DAMGA VERGISI  :" + dvt);

        temmuzmat =   toplambruttemmuz - (sgk7 + sgkiszt) ;
        System.out.println("TEMMUZ AYI GV MATRAHI  : " + temmuzmat);

        kummattemmuz = temmuzmat + kummatHaziran;
        System.out.println("KUMULATIF MATRAH  :" + kummattemmuz);



        if (kummattemmuz <= 32000.0) {
            gvkestemmuz =    temmuzmat * 0.15;
            System.out.println("GELIR VERGISI  :" + devirgvmtemmuz);
        }
        else if (kummattemmuz <= 70000.0){
            gvkestemmuz =  4800 +  ((kummattemmuz -32000) *0.20) - devirgvmHaziran;
            System.out.println("GELIR VERGISI  :" + gvkestemmuz);
        }
        else if (kummattemmuz <= 250000.0){
            gvkestemmuz = 12400 + ((kummattemmuz - 70000.0) *0.27) - devirgvmHaziran;
            System.out.println("GELIR VERGISI  :" + gvkestemmuz);
        }
        else if (kummattemmuz <= 880000.0){
            gvkestemmuz = 61000 +  ((kummattemmuz - 250000.0) *0.35) - devirgvmHaziran;
            System.out.println("GELIR VERGISI  :" + gvkestemmuz);
        }
        else if (kummattemmuz > 880000.0){
            gvkestemmuz = 281500.0 + ((kummattemmuz - 880000.0) *0.40) - devirgvmHaziran;
            System.out.println("GELIR VERGISI  :" + gvkestemmuz);
        }



        if(sgkdevredenHaziran > 0){
            if(tavan > toplambruttemmuz){
                hazirandevirdendusensgk =  (sgkiszt*100) - toplambruttemmuz;
                System.out.println ("MAYIS HAZIRAN AYI DEVIRDEN DUSEN  : " + hazirandevirdendusensgk);
            }else {
                hazirandevirdendusensgk = 0;
            }

        }else {
            hazirandevirdendusensgk = 0;
            System.out.println ("MAYIS HAZIRAN AYI DEVIRDEN DUSEN  : " + hazirandevirdendusensgk);
        }

        if((sgkdevredenHaziran - hazirandevirdendusensgk) <= Hazirandankalansgk){
            sgkdevredentemmuz = (sgkdevredenHaziran - hazirandevirdendusensgk) + temmuzdankalansgk;
            System.out.println ("SGK DEVREDEN HAZIRAN TEMMUZ  : " + sgkdevredentemmuz);


        }else{
            sgkdevredentemmuz = Hazirandankalansgk + temmuzdankalansgk;
            System.out.println ("SGK DEVREDEN HAZIRAN TEMMUZ  : " + sgkdevredentemmuz);

        };

        kestopt = gvkestemmuz + sgk7 + sgkiszt + dvt + bes7;
        nett = (toplambruttemmuz - kestopt) + (gvind2 + dvind2);
        System.out.println("NET UCRET  : " + nett);

        devirgvmtemmuz = devirgvmHaziran + gvkestemmuz;
        System.out.println("TEMMUZ DEVREDEN GELIR VERGISI  : " + devirgvmtemmuz);

        String FILE_NAME = "TEMMUZ_BORDRO.xlsx";

        XSSFWorkbook wb = new XSSFWorkbook ();
        XSSFSheet cs = wb.createSheet ( "BORDRO_2022" );
        //Sheet cs = wb.createSheet("Sayfa1");  //diger bir sheet tanimlama yontemi
        Object[][] table = {
                {"CG", "UCRET", "FM", "PRIM", "TOPLAM_BRUT","SGK_ISCI", "SGKISZ_ISCI", "SGK_DEVIR", "SGK_DEVDUS",
                        "DAMGA_VER", "GV", "KUM_GV","KES_TOP", "NET_ODEME"},
                {calguntemmuz, brutucrettemmuz, primtutartemmuz, fmmesaitemmuz, toplambruttemmuz, sgk7, sgkiszt,
                        sgkdevredentemmuz, temmuzdankalansgk, dvt, gvkestemmuz, kummattemmuz, kestopt, nett}
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



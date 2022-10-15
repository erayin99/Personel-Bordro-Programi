package Bordro;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Agustos extends Temmuz {
    public Agustos() {
        this.setKummattemmuz ( getKummattemmuz () );
        this.setDevirgvmtemmuz ( getDevirgvmtemmuz () );
        this.setSgkdevredentemmuz ( getSgkdevredentemmuz () );
        this.setTemmuzdankalansgk ( getTemmuzdankalansgk () );

    }


    double tavan2 = 48532.50;
    double dvind2 = 49.12;
    double gvind3 = 1051.11;
    double sgk8;
    double sgkisza;
    double dva;
    double neta;
    double kestopa;
    double agustosmat;
    double kummatagustos;
    double gvkesagustos = 0;

    double fmmesaiagustos;

    double gunlukbrutA2;

    double gunlukbrutagustos;

    double toplambrutagustos = 0;
    double sgktoplambrutagustos;
    double sgkdevredenagustos;
    double devirgvmagustos;

    double guntutar;
    double ayucret;
    double gunluktbrut;
    double agustosdankalansgk;
    double tmzagstdevirsgk;


    double calgunagustos;

    double brutucretagustos;

    double primtutaragustos;
    double temmuzdevirdendusensgk;
    double beso  ;

    double bes8;

    @Override
    public double getBeso() {
        return beso;
    }

    @Override
    public void setBeso(double beso) {
        this.beso = beso;
    }

    public double getBes8() {
        return bes8;
    }

    public void setBes8(double bes8) {
        this.bes8 = bes8;
    }

    public double getTemmuzdevirdendusensgk() {
        return temmuzdevirdendusensgk;
    }

    public void setTemmuzdevirdendusensgk(double temmuzdevirdendusensgk) {
        this.temmuzdevirdendusensgk = temmuzdevirdendusensgk;
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

    public double getGvind3() {
        return gvind3;
    }

    public void setGvind3(double gvind3) {
        this.gvind3 = gvind3;
    }

    public double getSgk8() {
        return sgk8;
    }

    public void setSgk8(double sgk8) {
        this.sgk8 = sgk8;
    }

    public double getSgkisza() {
        return sgkisza;
    }

    public void setSgkisza(double sgkisza) {
        this.sgkisza = sgkisza;
    }

    public double getDva() {
        return dva;
    }

    public void setDva(double dva) {
        this.dva = dva;
    }

    public double getNeta() {
        return neta;
    }

    public void setNeta(double neta) {
        this.neta = neta;
    }

    public double getKestopa() {
        return kestopa;
    }

    public void setKestopa(double kestopa) {
        this.kestopa = kestopa;
    }

    public double getAgustosmat() {
        return agustosmat;
    }

    public void setAgustosmat(double agustosmat) {
        this.agustosmat = agustosmat;
    }

    public double getKummatagustos() {
        return kummatagustos;
    }

    public void setKummatagustos(double kummatagustos) {
        this.kummatagustos = kummatagustos;
    }

    public double getGvkesagustos() {
        return gvkesagustos;
    }

    public void setGvkesagustos(double gvkesagustos) {
        this.gvkesagustos = gvkesagustos;
    }

    public double getFmmesaiagustos() {
        return fmmesaiagustos;
    }

    public void setFmmesaiagustos(double fmmesaiagustos) {
        this.fmmesaiagustos = fmmesaiagustos;
    }

    public double getGunlukbrutA2() {
        return gunlukbrutA2;
    }

    public void setGunlukbrutA2(double gunlukbrutA2) {
        this.gunlukbrutA2 = gunlukbrutA2;
    }

    public double getGunlukbrutagustos() {
        return gunlukbrutagustos;
    }

    public void setGunlukbrutagustos(double gunlukbrutagustos) {
        this.gunlukbrutagustos = gunlukbrutagustos;
    }

    public double getToplambrutagustos() {
        return toplambrutagustos;
    }

    public void setToplambrutagustos(double toplambrutagustos) {
        this.toplambrutagustos = toplambrutagustos;
    }

    public double getSgktoplambrutagustos() {
        return sgktoplambrutagustos;
    }

    public void setSgktoplambrutagustos(double sgktoplambrutagustos) {
        this.sgktoplambrutagustos = sgktoplambrutagustos;
    }

    public double getSgkdevredenagustos() {
        return sgkdevredenagustos;
    }

    public void setSgkdevredenagustos(double sgkdevredenagustos) {
        this.sgkdevredenagustos = sgkdevredenagustos;
    }

    public double getDevirgvmagustos() {
        return devirgvmagustos;
    }

    public void setDevirgvmagustos(double devirgvmagustos) {
        this.devirgvmagustos = devirgvmagustos;
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

    public double getAgustosdankalansgk() {
        return agustosdankalansgk;
    }

    public void setAgustosdankalansgk(double agustosdankalansgk) {
        this.agustosdankalansgk = agustosdankalansgk;
    }

    public double getTmzagstdevirsgk() {
        return tmzagstdevirsgk;
    }

    public void setTmzagstdevirsgk(double tmzagstdevirsgk) {
        this.tmzagstdevirsgk = tmzagstdevirsgk;
    }

    public double getCalgunagustos() {
        return calgunagustos;
    }

    public void setCalgunagustos(double calgunagustos) {
        this.calgunagustos = calgunagustos;
    }

    public double getBrutucretagustos() {
        return brutucretagustos;
    }

    public void setBrutucretagustos(double brutucretagustos) {
        this.brutucretagustos = brutucretagustos;
    }

    public double getPrimtutaragustos() {
        return primtutaragustos;
    }

    public void setPrimtutaragustos(double primtutaragustos) {
        this.primtutaragustos = primtutaragustos;
    }

    public double agustos(double kummattemmuz, double devirgvmtemmuz, double sgkdevredentemmuz,
                          double temmuzdankalansgk) {


        Scanner scan = new Scanner ( System.in );
        System.out.println ( "Calisma gu sauisini giriniz" );
        double gun = scan.nextDouble ();
        System.out.println ( "Lutfen ucretibizi girin" );
        double ucret = scan.nextDouble ();
        System.out.println ( "Lutfen mesai surenizi giriniz" );
        int mesaim = scan.nextInt ();
        System.out.println ( "prim brut tutarini giriniz" );
        double primagu = scan.nextDouble ();
        System.out.println ("BES KESINTISI BARSA (1) TUSUNA BASUNUZ");
        int beso = scan.nextInt ();

        calgunagustos =gun;
        brutucretagustos = ucret /30*calgunagustos;
        primtutaragustos = primagu;
        guntutar = ucret / 30;
        ayucret = guntutar * gun;
        fmmesaiagustos = ucret / 225 * 1.5 * mesaim;
        System.out.println ( "MESAI TUTARI  : "  + fmmesaiagustos );
        toplambrutagustos = ayucret + fmmesaiagustos + primagu;
        System.out.println ( "TOPLAM BRUT  " + toplambrutagustos );
        gunlukbrutagustos = (toplambrutagustos / 30);
        sgktoplambrutagustos = (toplambrutagustos + sgkdevredentemmuz);
        System.out.println ( "SGK HESAPLANACAK  " + sgktoplambrutagustos );
        gunlukbrutA2 = (toplambrutagustos + sgkdevredentemmuz) / 30;
        sgkgun = tavan2 / 30;
        if ( beso == 1){
            bes8 =  toplambrutOcak *0.03;
        }else {
            bes8 = 0;
        }

        if (sgkdevredentemmuz <= 0) {
            if (toplambrutagustos <= (sgkgun * gun)) {

                sgk8 = toplambrutagustos * 0.14;
                System.out.println ( "SGK ISCI KESINTI  " + sgk8 );
            } else {
                sgk8 = ((tavan2 / 30) * gun) * 0.14;
                System.out.println ( "SGK ISCI KESINTI  " + sgk8 );
            }

            if (toplambrutagustos <= (sgkgun * gun)) {

                sgkisza = toplambrutagustos * 0.01;
                System.out.println ( "SGK ISSIZLIK  :  " + sgkisza );
            } else {
                sgkisza = ((tavan2 / 30) * gun) * 0.01;
                System.out.println ( "SGK ISSIZLIK  :" + sgkisza );
            }


        } else {
            if (((gunlukbrutagustos * gun) + sgkdevredentemmuz) <= (sgkgun * gun)) {

                sgk8 = sgktoplambrutagustos * 0.14;
                System.out.println ( "SGK ISCI KESINTI  : " + sgk8 );
            } else {
                sgk8 = ((tavan2 / 30) * gun) * 0.14;
                System.out.println ( "SGK ISCI KESINTI  : " + sgk8 );
            }


            if (((gunlukbrutagustos * gun) + sgkdevredentemmuz) <= (sgkgun * gun)) {

                sgkisza = sgktoplambrutagustos * 0.01;
                System.out.println ( "SGK ISSIZLIK  :" + sgkisza );
            } else {
                sgkisza = ((tavan2 / 30) * gun) * 0.01;
                System.out.println ( "SGK ISSIZLIK  :" + sgkisza );
            }
        }

            if (toplambrutagustos > tavan2) {
                agustosdankalansgk = toplambrutagustos - tavan2;
            } else {
                agustosdankalansgk = 0;
            }

            dva = (toplambrutagustos * 0.00759);
            System.out.println ( "DAMGA VERGISI  :" + dva );

            agustosmat = toplambrutagustos - (sgk8 + sgkisza);
            System.out.println ( "AGUSTOS AYI GV MATRAHI  : " + agustosmat );

            kummatagustos = agustosmat + kummattemmuz;
            System.out.println ( "KUMULATIF MATRAH  :" + kummatagustos );


            if (kummatagustos <= 32000.0) {
                gvkesagustos = agustosmat * 0.15;
                System.out.println ( "GELIR VERGISI  :" + devirgvmagustos );
            } else if (kummatagustos <= 70000.0) {
                gvkesagustos = 4800 + ((kummatagustos - 32000) * 0.20) - devirgvmtemmuz;
                System.out.println ( "GELIR VERGISI  :" + gvkesagustos );
            } else if (kummatagustos <= 250000.0) {
                gvkesagustos = 12400 + ((kummatagustos - 70000.0) * 0.27) - devirgvmtemmuz;
                System.out.println ( "GELIR VERGISI  :" + gvkesagustos );
            } else if (kummatagustos <= 880000.0) {
                gvkesagustos = 61000 + ((kummatagustos - 250000.0) * 0.35) - devirgvmtemmuz;
                System.out.println ( "GELIR VERGISI  :" + gvkesagustos );
            } else if (kummatagustos > 880000.0) {
                gvkesagustos = 281500.0 + ((kummatagustos - 880000.0) * 0.40) - devirgvmtemmuz;
                System.out.println ( "GELIR VERGISI  :" + gvkesagustos );
            }



        if(sgkdevredentemmuz > 0){
            if(tavan > toplambrutagustos){
                temmuzdevirdendusensgk =  (sgkisza*100) - toplambrutagustos;
                System.out.println ("HAZIRAN TEMMUZ AYI DEVIRDEN DUSEN  : " + temmuzdevirdendusensgk);
            }else {
                temmuzdevirdendusensgk = 0;
            }

        }else {
            temmuzdevirdendusensgk = 0;
            System.out.println ("HAZIRAN TEMMUZ AYI DEVIRDEN DUSEN  : " + temmuzdevirdendusensgk);
        }

        if((sgkdevredentemmuz - temmuzdevirdendusensgk) <= temmuzdankalansgk){
            sgkdevredenagustos = (sgkdevredentemmuz - temmuzdevirdendusensgk) + agustosdankalansgk;
            System.out.println ("SGK DEVREDEN TEMMUZ AGUSTOS  : " + sgkdevredenagustos);


        }else{
            sgkdevredenagustos = temmuzdankalansgk + agustosdankalansgk;
            System.out.println ("SGK DEVREDEN TEMMUZ AGUSTOS  : " + sgkdevredenagustos);

        };

            kestopa = gvkesagustos + sgk8 + sgkisza + dva - bes8;
            neta = (toplambrutagustos - kestopa) + (gvind3 + dvind2);
            System.out.println ( "NET UCRET  : " + neta );

            devirgvmagustos = devirgvmtemmuz + gvkesagustos;
            System.out.println ( "AGUSTOS DEVREDEN GELIR VERGISI  : " + devirgvmagustos );
        String FILE_NAME = "AGUSTOS_BORDRO.xlsx";

        XSSFWorkbook wb = new XSSFWorkbook ();
        XSSFSheet cs = wb.createSheet ( "BORDRO_2022" );
        //Sheet cs = wb.createSheet("Sayfa1");  //diger bir sheet tanimlama yontemi
        Object[][] table = {
                {"CG", "UCRET", "FM", "PRIM", "TOPLAM_BRUT","SGK_ISCI", "SGKISZ_ISCI", "SGK_DEVIR", "SGK_DEVDUS",
                        "DAMGA_VER", "GV", "KUM_GV","KES_TOP", "NET_ODEME"},
                {calgunagustos, brutucretagustos, primtutaragustos, fmmesaiagustos, toplambrutagustos, sgk8, sgkisza,
                        sgkdevredenagustos, agustosdankalansgk, dva, gvkesagustos, kummatagustos, kestopa, neta}
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



package Bordro;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Haziran extends Mayis {
    public Haziran() {
        this.setKummatMayis ( getKummatMayis () );
        this.setDevirgvmMayis ( getDevirgvmMayis () );
        this.setSgkdevredenMayis (getSgkdevredenMayis ());
        this.setMayistankalansgk ( getMayistankalansgk () );

    }


    double tavan = 37530.0;
    double dvind = 37.98;
    double gvind = 638.01;
    double sgk6;
    double sgkiszh;
    double dvh;
    double neth;
    double kestoph;
    double Haziranmat;
    double kummatHaziran;
    double gvkesHaziran = 0;

    double fmmesaiHaziran ;

    double gunlukbrutH2;

    double gunlukbrutHaziran;

    double toplambrutHaziran =0;
    double sgktoplambrutHaziran;
    double sgkdevredenHaziran;
    double devirgvmHaziran;

    double guntutar ;
    double ayucret;
    double gunluktbrut;
    double nisanhazdevretmeyensgk;
    double Hazirandankalansgk;
    double myshzrndevirsgk;
    double calgunhaziran;

    double brutucrethaziran;

    double primtutarhaziran;

    double mayisdevirdendusensgk;
    double beso  ;

    double bes6;

    @Override
    public double getBeso() {
        return beso;
    }

    @Override
    public void setBeso(double beso) {
        this.beso = beso;
    }

    public double getBes6() {
        return bes6;
    }

    public void setBes6(double bes6) {
        this.bes6 = bes6;
    }

    public double getMayisdevirdendusensgk() {
        return mayisdevirdendusensgk;
    }

    public void setMayisdevirdendusensgk(double mayisdevirdendusensgk) {
        this.mayisdevirdendusensgk = mayisdevirdendusensgk;
    }

    @Override
    public double getTavan() {
        return tavan;
    }

    @Override
    public void setTavan(double tavan) {
        this.tavan = tavan;
    }

    @Override
    public double getDvind() {
        return dvind;
    }

    @Override
    public void setDvind(double dvind) {
        this.dvind = dvind;
    }

    @Override
    public double getGvind() {
        return gvind;
    }

    @Override
    public void setGvind(double gvind) {
        this.gvind = gvind;
    }

    public double getSgk6() {
        return sgk6;
    }

    public void setSgk6(double sgk6) {
        this.sgk6 = sgk6;
    }

    public double getSgkiszh() {
        return sgkiszh;
    }

    public void setSgkiszh(double sgkiszh) {
        this.sgkiszh = sgkiszh;
    }

    public double getDvh() {
        return dvh;
    }

    public void setDvh(double dvh) {
        this.dvh = dvh;
    }

    public double getNeth() {
        return neth;
    }

    public void setNeth(double neth) {
        this.neth = neth;
    }

    public double getKestoph() {
        return kestoph;
    }

    public void setKestoph(double kestoph) {
        this.kestoph = kestoph;
    }

    public double getHaziranmat() {
        return Haziranmat;
    }

    public void setHaziranmat(double haziranmat) {
        Haziranmat = haziranmat;
    }

    public double getKummatHaziran() {
        return kummatHaziran;
    }

    public void setKummatHaziran(double kummatHaziran) {
        this.kummatHaziran = kummatHaziran;
    }

    public double getGvkesHaziran() {
        return gvkesHaziran;
    }

    public void setGvkesHaziran(double gvkesHaziran) {
        this.gvkesHaziran = gvkesHaziran;
    }

    public double getFmmesaiHaziran() {
        return fmmesaiHaziran;
    }

    public void setFmmesaiHaziran(double fmmesaiHaziran) {
        this.fmmesaiHaziran = fmmesaiHaziran;
    }

    public double getGunlukbrutH2() {
        return gunlukbrutH2;
    }

    public void setGunlukbrutH2(double gunlukbrutH2) {
        this.gunlukbrutH2 = gunlukbrutH2;
    }

    public double getGunlukbrutHaziran() {
        return gunlukbrutHaziran;
    }

    public void setGunlukbrutHaziran(double gunlukbrutHaziran) {
        this.gunlukbrutHaziran = gunlukbrutHaziran;
    }

    public double getToplambrutHaziran() {
        return toplambrutHaziran;
    }

    public void setToplambrutHaziran(double toplambrutHaziran) {
        this.toplambrutHaziran = toplambrutHaziran;
    }

    public double getSgktoplambrutHaziran() {
        return sgktoplambrutHaziran;
    }

    public void setSgktoplambrutHaziran(double sgktoplambrutHaziran) {
        this.sgktoplambrutHaziran = sgktoplambrutHaziran;
    }

    public double getSgkdevredenHaziran() {
        return sgkdevredenHaziran;
    }

    public void setSgkdevredenHaziran(double sgkdevredenHaziran) {
        this.sgkdevredenHaziran = sgkdevredenHaziran;
    }

    public double getDevirgvmHaziran() {
        return devirgvmHaziran;
    }

    public void setDevirgvmHaziran(double devirgvmHaziran) {
        this.devirgvmHaziran = devirgvmHaziran;
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

    public double getHazirandankalansgk() {
        return Hazirandankalansgk;
    }

    public void setHazirandankalansgk(double hazirandankalansgk) {
        Hazirandankalansgk = hazirandankalansgk;
    }

    public double getMyshzrndevirsgk() {
        return myshzrndevirsgk;
    }

    public void setMyshzrndevirsgk(double myshzrndevirsgk) {
        this.myshzrndevirsgk = myshzrndevirsgk;
    }

    public double getCalgunhaziran() {
        return calgunhaziran;
    }

    public void setCalgunhaziran(double calgunhaziran) {
        this.calgunhaziran = calgunhaziran;
    }

    public double getBrutucrethaziran() {
        return brutucrethaziran;
    }

    public void setBrutucrethaziran(double brutucrethaziran) {
        this.brutucrethaziran = brutucrethaziran;
    }

    public double getPrimtutarhaziran() {
        return primtutarhaziran;
    }

    public void setPrimtutarhaziran(double primtutarhaziran) {
        this.primtutarhaziran = primtutarhaziran;
    }

    public double Haziran(double kummatMayis, double devirgvmMayis, double sgkdevredenMayis,
                          double mayistankalansgk) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Calisma gu sauisini giriniz");
        double gun = scan.nextDouble() ;
        System.out.println("Lutfen ucretibizi girin");
        double ucret = scan.nextDouble() ;
        System.out.println("Lutfen mesai surenizi giriniz");
        int mesaim = scan.nextInt();
        System.out.println("prim brut tutarini giriniz");
        double primhaz = scan.nextDouble();
        System.out.println ("BES KESINTISI BARSA (1) TUSUNA BASUNUZ");
        int beso = scan.nextInt ();


        calgunhaziran =gun;
        brutucrethaziran = ucret /30*calgunhaziran;
        primtutarhaziran = primhaz;

        guntutar = ucret / 30;
        ayucret = guntutar * gun;
        fmmesaiHaziran = ucret /225*1.5*mesaim;
        System.out.println("MESAI TUTARI  : " + fmmesaiHaziran);
        toplambrutHaziran = ayucret + fmmesaiHaziran + primhaz;
        System.out.println("TOPLAM BRUT  " + toplambrutHaziran);
        gunlukbrutHaziran = (toplambrutHaziran / 30);
        sgktoplambrutHaziran = (toplambrutHaziran + sgkdevredenMayis);
        System.out.println("SGK HESAPLANACAK  " + sgktoplambrutHaziran);
        gunlukbrutH2 = (toplambrutHaziran + sgkdevredenMayis) / 30;
        sgkgun = tavan /30;
        if ( beso == 1){
            bes6 =  toplambrutOcak *0.03;
        }else {
            bes6 = 0;
        }

        if(sgkdevredenMayis <= 0){
            if(toplambrutHaziran <= (sgkgun * gun)){

                sgk6 = toplambrutHaziran * 0.14;
                System.out.println("SGK ISCI KESINTI  " + sgk6);
            }
            else {
                sgk6 = ((tavan /30)*gun) * 0.14;
                System.out.println("SGK ISCI KESINTI  " + sgk6);
            }

            if(toplambrutHaziran <= (sgkgun * gun)){

                sgkiszh = toplambrutHaziran * 0.01;
                System.out.println("SGK ISSIZLIK  :  " + sgkiszh);
            }
            else {
                sgkiszh = ((tavan /30)*gun) * 0.01;
                System.out.println("SGK ISSIZLIK  :" + sgkiszh);
            }


        }
        else{
            if(((gunlukbrutHaziran * gun)+sgkdevredenMayis) <= (sgkgun * gun)){

                sgk6 = sgktoplambrutHaziran * 0.14;
                System.out.println( "SGK ISCI KESINTI  : "  +sgk6);
            }
            else {
                sgk6 = ((tavan /30)*gun) * 0.14;
                System.out.println( "SGK ISCI KESINTI  : "  +sgk6);
            }

            if(((gunlukbrutHaziran * gun)+sgkdevredenMayis) <= (sgkgun * gun)){

                sgkiszh = sgktoplambrutHaziran * 0.01;
                System.out.println("SGK ISSIZLIK  :" + sgkiszh);
            }
            else {
                sgkiszh = ((tavan /30)*gun) * 0.01;
                System.out.println("SGK ISSIZLIK  :" + sgkiszh);
            }

        }
        if (toplambrutHaziran > tavan){
            Hazirandankalansgk = toplambrutHaziran - tavan;
        }else {
            Hazirandankalansgk = 0 ;
        }

        dvh = (toplambrutHaziran * 0.00759);
        System.out.println("DAMGA VERGISI  :" + dvh);

        Haziranmat =   toplambrutHaziran - (sgk6 + sgkiszh) ;
        System.out.println("HAZIRAN AYI GV MATRAHI  ; " + Haziranmat);

        kummatHaziran = Haziranmat + kummatMayis;
        System.out.println("KUMULATIF MATRAH  :" + kummatHaziran);



        if (kummatHaziran <= 32000.0) {
            gvkesHaziran =    Haziranmat * 0.15;
            System.out.println("GELIR VERGISI  :" + devirgvmHaziran);
        }
        else if (kummatHaziran <= 70000.0){
            gvkesHaziran =  4800 +  ((kummatHaziran -32000) *0.20) - devirgvmMayis;
            System.out.println("GELIR VERGISI  :" + gvkesHaziran);
        }
        else if (kummatHaziran <= 250000.0){
            gvkesHaziran = 12400 + ((kummatHaziran - 70000.0) *0.27) - devirgvmMayis;
            System.out.println("GELIR VERGISI  :" + gvkesHaziran);
        }
        else if (kummatHaziran <= 880000.0){
            gvkesHaziran = 61000 +  ((kummatHaziran - 250000.0) *0.35) - devirgvmMayis;
            System.out.println("GELIR VERGISI  :" + gvkesHaziran);
        }
        else if (kummatHaziran > 880000.0){
            gvkesHaziran = 281500.0 + ((kummatHaziran - 880000.0) *0.40) - devirgvmMayis;
            System.out.println("GELIR VERGISI  :" + gvkesHaziran);
        }



        if(sgkdevredenMayis > 0){
            if(tavan > toplambrutHaziran){
                mayisdevirdendusensgk =  (sgkiszh*100) - toplambrutHaziran;
                System.out.println ("NISAN MAYIS AYI DEVIRDEN DUSEN  :" + mayisdevirdendusensgk);
            }else {
                mayisdevirdendusensgk = 0;
            }

        }else {
            mayisdevirdendusensgk = 0;
            System.out.println ("MART NISAN AYI DEVIRDEN DUSEN  : " + mayisdevirdendusensgk);
        }

        if((sgkdevredenMayis - mayisdevirdendusensgk) <= mayistankalansgk){
            sgkdevredenHaziran = (sgkdevredenMayis - mayisdevirdendusensgk) + Hazirandankalansgk;
            System.out.println ("SGK DEVREDEN MAYIS HAZIRAN : " + sgkdevredenHaziran);


        }else{
            sgkdevredenHaziran = mayistankalansgk + Hazirandankalansgk;
            System.out.println ("SGK DEVREDEN MAYIS HAZIRAN : " + sgkdevredenHaziran);

        }
        kestoph = gvkesHaziran + sgk6 + sgkiszh + dvh + bes6;
        neth = (toplambrutHaziran - kestoph) + (gvind + dvind);
        System.out.println("NET UCRET  : " + neth);

        devirgvmHaziran = devirgvmMayis + gvkesHaziran;
        System.out.println("HAZIRAN DEVREDEN GELIR VERGISI  ;" + devirgvmHaziran);
        String FILE_NAME = "HAZIRAN_BORDRO.xlsx";

        XSSFWorkbook wb = new XSSFWorkbook ();
        XSSFSheet cs = wb.createSheet ( "BORDRO_2022" );
        //Sheet cs = wb.createSheet("Sayfa1");  //diger bir sheet tanimlama yontemi
        Object[][] table = {
                {"CG", "UCRET", "FM", "PRIM", "TOPLAM_BRUT","SGK_ISCI", "SGKISZ_ISCI", "SGK_DEVIR", "SGK_DEVDUS",
                        "DAMGA_VER", "GV", "KUM_GV","KES_TOP", "NET_ODEME"},
                {calgunhaziran, brutucrethaziran, primtutarhaziran, fmmesaiHaziran, toplambrutHaziran, sgk6, sgkiszh,
                        sgkdevredenHaziran, Hazirandankalansgk, dvh, gvkesHaziran, kummatHaziran, kestoph, neth}
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



package Bordro;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Subat extends Ocak{

    public Subat() {
        this.setKummatOcak (getKummatOcak ());
        this.setGvkesOcak (getGvkesOcak ());
        this.setSgkdevredenocak ( getSgkdevredenocak () );
    }
    double tavan = 37530.0;
    double sgk2;
    double sgkiszs;
    double dvs;
    double subatmat;
    double kummatsubat;
    double gvkesSubat = 0;
    double dvind = 37.98;
    double gvind = 638.01;
    double kestops;
    double nets;
    double fmmesais = 0;

    double toplambrutSubat =0;
    double sgktoplamnbrutSubat;
    double sgkdevredenSubat;

    double devirgvSubat = 0;
    double guntutar = 0;
    double ayucret;
    double gunluktbrut;
    double ocakdevirdendusen;
    double gunlukbrut2;

    double ocaktandevirsgk;

    double subattankalansgk;

    double calgunsubat;

    double brutucretsubat;

    double primtutarsubat;

    double beso;

    double bes2;

    @Override
    public double getBeso() {
        return beso;
    }

    @Override
    public void setBeso(double beso) {
        this.beso = beso;
    }

    public double getBes2() {
        return bes2;
    }

    public void setBes2(double bes2) {
        this.bes2 = bes2;
    }

    @Override
    public double getTavan() {
        return tavan;
    }

    @Override
    public void setTavan(double tavan) {
        this.tavan = tavan;
    }

    public double getSgk2() {
        return sgk2;
    }

    public void setSgk2(double sgk2) {
        this.sgk2 = sgk2;
    }

    public double getSgkiszs() {
        return sgkiszs;
    }

    public void setSgkiszs(double sgkiszs) {
        this.sgkiszs = sgkiszs;
    }

    public double getDvs() {
        return dvs;
    }

    public void setDvs(double dvs) {
        this.dvs = dvs;
    }

    public double getSubatmat() {
        return subatmat;
    }

    public void setSubatmat(double subatmat) {
        this.subatmat = subatmat;
    }

    public double getKummatsubat() {
        return kummatsubat;
    }

    public void setKummatsubat(double kummatsubat) {
        this.kummatsubat = kummatsubat;
    }

    public double getGvkesSubat() {
        return gvkesSubat;
    }

    public void setGvkesSubat(double gvkesSubat) {
        this.gvkesSubat = gvkesSubat;
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

    public double getKestops() {
        return kestops;
    }

    public void setKestops(double kestops) {
        this.kestops = kestops;
    }

    public double getNets() {
        return nets;
    }

    public void setNets(double nets) {
        this.nets = nets;
    }

    public double getFmmesais() {
        return fmmesais;
    }

    public void setFmmesais(double fmmesais) {
        this.fmmesais = fmmesais;
    }

    public double getToplambrutSubat() {
        return toplambrutSubat;
    }

    public void setToplambrutSubat(double toplambrutSubat) {
        this.toplambrutSubat = toplambrutSubat;
    }

    public double getSgktoplamnbrutSubat() {
        return sgktoplamnbrutSubat;
    }

    public void setSgktoplamnbrutSubat(double sgktoplamnbrutSubat) {
        this.sgktoplamnbrutSubat = sgktoplamnbrutSubat;
    }

    public double getSgkdevredenSubat() {
        return sgkdevredenSubat;
    }

    public void setSgkdevredenSubat(double sgkdevredenSubat) {
        this.sgkdevredenSubat = sgkdevredenSubat;
    }

    public double getDevirgvSubat() {
        return devirgvSubat;
    }

    public void setDevirgvSubat(double devirgvSubat) {
        this.devirgvSubat = devirgvSubat;
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

    public double getGunluktbrut() {
        return gunluktbrut;
    }

    public void setGunluktbrut(double gunluktbrut) {
        this.gunluktbrut = gunluktbrut;
    }

    public double getOcakdevirdendusen() {
        return ocakdevirdendusen;
    }

    public void setOcakdevirdendusen(double ocakdevirdendusen) {
        this.ocakdevirdendusen = ocakdevirdendusen;
    }

    public double getGunlukbrut2() {
        return gunlukbrut2;
    }

    public void setGunlukbrut2(double gunlukbrut2) {
        this.gunlukbrut2 = gunlukbrut2;
    }

    public double getOcaktandevirsgk() {
        return ocaktandevirsgk;
    }

    public void setOcaktandevirsgk(double ocaktandevirsgk) {
        this.ocaktandevirsgk = ocaktandevirsgk;
    }

    public double getSubattankalansgk() {
        return subattankalansgk;
    }

    public void setSubattankalansgk(double subattankalansgk) {
        this.subattankalansgk = subattankalansgk;
    }

    public double getCalgunsubat() {
        return calgunsubat;
    }

    public void setCalgunsubat(double calgunsubat) {
        this.calgunsubat = calgunsubat;
    }

    public double getBrutucretsubat() {
        return brutucretsubat;
    }

    public void setBrutucretsubat(double brutucretsubat) {
        this.brutucretsubat = brutucretsubat;
    }

    public double getPrimtutarsubat() {
        return primtutarsubat;
    }

    public void setPrimtutarsubat(double primtutarsubat) {
        this.primtutarsubat = primtutarsubat;
    }

    public double subat(double kummatOcakt, double gvkesOcak, double sgkdevredenocak) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Calisma gu sauisini giriniz");
        double gun = scan.nextDouble() ;
        System.out.println("Lutfen ucretibizi girin");
        double ucret = scan.nextDouble() ;
        System.out.println("Lutfen mesai surenizi giriniz");
        int mesais = scan.nextInt();
        System.out.println("prim brut tutarini giriniz");
        double prims = scan.nextDouble();
        System.out.println ("BES KESINTISI BARSA (1) TUSUNA BASUNUZ");
        int beso = scan.nextInt ();
        primtutarsubat = prims;
        calgunsubat = gun;
        brutucretsubat = ucret /30*calgunsubat;
        guntutar = ucret / 30;
        ayucret = guntutar * gun;
        fmmesais = ucret /225*1.5*mesais;
        System.out.println("MESAI TUTARI  : " + fmmesais);
        toplambrutSubat =ayucret + fmmesais + prims;
        System.out.println("TOPLAM BRUT  " + toplambrutSubat);
        gunluktbrut = toplambrutSubat / 30;
        sgktoplamnbrutSubat= toplambrutSubat + sgkdevredenocak;
        System.out.println("SGK HESAPLANACAK  " + sgktoplamnbrutSubat);
        sgkgun =tavan /30;

        if ( beso == 1){
            bes2 =  toplambrutOcak *0.03;
        }else {
            bes2 = 0;
        }



        if(sgkdevredenocak <=0){
            if(toplambrutSubat <= (sgkgun * gun)){

                sgk2 = toplambrutSubat * 0.14;
                System.out.println("SGK ISCI KESINTI  " + sgk2);
            }
            else {
                sgk2 = ((tavan /30)*gun) * 0.14;
                System.out.println("SGK ISCI KESINTI  " + sgk2);
            }

            if(toplambrutSubat <= (sgkgun*gun)){

                sgkiszs = toplambrutSubat * 0.01;
                System.out.println("SGK ISCI KESINTI  :  " + sgkiszs);
            }
            else {
                sgkiszs = ((tavan /30)*gun) * 0.01;
                System.out.println("SGK ISSIZLIK  :" + sgkiszs);
            }


        }else{
            if(((gunluktbrut*gun)+sgkdevredenocak) <= (sgkgun*gun)){

                sgk2 = sgktoplamnbrutSubat * 0.14;
                System.out.println( "SGK ISCI KESINTI  : "  +sgk2);
            }
            else {
                sgk2 = (sgkgun * gun) * 0.14;
                System.out.println( "SGK ISCI KESINTI  : "  +sgk2);
            }

            if(((gunluktbrut*gun)+sgkdevredenocak) <= (sgkgun*gun)){

                sgkiszs = sgktoplamnbrutSubat * 0.01;
                System.out.println("SGK ISSIZLIK  :" + sgkiszs);
            }
            else {
                sgkiszs = (sgkgun * gun) * 0.01;
                System.out.println("SGK ISSIZLIK  :" + sgkiszs);
            }


        }

        if (toplambrutSubat > tavan){
            subattankalansgk = toplambrutSubat- tavan;
            System.out.println ("SUBATTAN KALAN SGK  : " + subattankalansgk);
        }else {
            subattankalansgk = 0 ;
            System.out.println ("SUBATTAN KALAN SGK  : " + subattankalansgk);
        }


        dvs = (toplambrutSubat * 0.00759);
        System.out.println("DAMGA VERGISI  :" + dvs);

        subatmat =   toplambrutSubat - (sgk2 + sgkiszs) ;
        System.out.println("SUBAT AYI GV MATRAHI  : " + subatmat);
        kummatsubat = subatmat + kummatOcakt;
        System.out.println("KUMULATIF MATRAH  :" + kummatsubat);



        if (kummatsubat <= 32000.0) {
            gvkesSubat = subatmat * 0.15;
            System.out.println("GELIR VERGISI  :" + gvkesSubat);
        }
        else if (kummatsubat <= 70000.0){
           gvkesSubat =  4800 +  ((kummatsubat -32000) *0.20) - gvkesOcak;
            System.out.println("GELIR VERGISI  :" + gvkesSubat);
        }
        else if (kummatsubat <= 250000.0){
            gvkesSubat = 12400 + ((kummatsubat - 70000.0) *0.27) - gvkesOcak;
            System.out.println("GELIR VERGISI  :" + gvkesSubat);
        }
        else if (kummatsubat <= 880000.0){
            gvkesSubat = 61000 +  ((kummatsubat - 250000.0) *0.35) - gvkesOcak;
            System.out.println("GELIR VERGISI  :" + gvkesSubat);
        }
        else if (kummatsubat > 880000.0){
            gvkesSubat = 281500.0 + ((kummatsubat - 880000.0) *0.40) - gvkesOcak;
            System.out.println("GELIR VERGISI  :" + gvkesSubat);
        }


        kestops = gvkesSubat + sgk2 + sgkiszs + dvs + bes2;
        nets = (toplambrutSubat- kestops) + (gvind + dvind);
        System.out.println("NET UCRET  : " + nets);

        if(sgkdevredenocak > 0){
            if(tavan > toplambrutSubat){
                ocakdevirdendusen =  (sgkiszs*100) - toplambrutSubat;
                System.out.println ("OCAK AYI DEVIRDEN DUSEN  : " + ocakdevirdendusen);
            }else {
                ocakdevirdendusen = 0;
            }

        }else {
            ocakdevirdendusen = 0;
            System.out.println ("OCAK AYI DEVIRDEN DUSEN" + ocakdevirdendusen);
        }




        sgkdevredenSubat = (sgkdevredenocak - ocakdevirdendusen) + subattankalansgk;
        System.out.println ("SGK DEVREDEN OCAK-SUBAT  : " + sgkdevredenSubat);


        devirgvSubat = gvkesOcak + gvkesSubat;
        System.out.println("SUBAT AYI DEVREDEN GELIR VERGISI" + devirgvSubat);

        String FILE_NAME = "SUBAT_BORDRO.xlsx";

        XSSFWorkbook wb = new XSSFWorkbook ();
        XSSFSheet cs = wb.createSheet ( "BORDRO_2022" );
        //Sheet cs = wb.createSheet("Sayfa1");  //diger bir sheet tanimlama yontemi
        Object[][] table = {
                {"CG", "UCRET", "FM", "PRIM", "TOPLAM_BRUT","SGK_ISCI", "SGKISZ_ISCI", "SGK_DEVIR", "SGK_DEVDUS",
                        "DAMGA_VER", "GV", "KUM_GV","KES_TOP", "NET_ODEME"},
                {calgunsubat, brutucretsubat, primtutarsubat, fmmesais, toplambrutSubat,
                        sgk2, sgkiszs, sgkdevredenSubat, subattankalansgk, dvs, gvkesSubat, kummatsubat, kestops, nets}

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


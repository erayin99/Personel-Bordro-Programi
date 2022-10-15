package Bordro;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Mayis extends Nisan {
    public Mayis() {
        this.setKummatNisan ( getKummatNisan () );
        this.setDevirgvmNisan ( getDevirgvmNisan () );
        this.setSgkdevredenNisan (getSgkdevredenNisan ());
        this.setOcSbDevirsgk ( getOcSbDevirsgk () );
        this.setNisandankalansgk ( getNisandankalansgk () );

    }





    double tavan = 37530.0;
    double dvind = 37.98;
    double gvind = 638.01;
    double sgk5;
    double sgkiszma;
    double dvma;
    double netma;
    double kestopma;
    double Mayismat;
    double kummatMayis;
    double gvkesMayis = 0;

    double fmmesaiMayis ;

    double gunlukbrutM2;

    double gunlukbrutMayis;

    double toplambrutMayis =0;
    double sgktoplambrutMayis;
    double sgkdevredenMayis;
    double devirgvmMayis;

    double guntutar ;
    double ayucret;
    double gunluktbrut;
    double nisanhazdevretmeyensgk;
    double mayistankalansgk;
    double mrtnsndevirsgk;

    double calgunmayis;

    double brutucretmayis;

    double primtutarmayis;

    double nisandevirdendusen;

    double beso  ;

    double bes5;

    @Override
    public double getBeso() {
        return beso;
    }

    @Override
    public void setBeso(double beso) {
        this.beso = beso;
    }

    public double getBes5() {
        return bes5;
    }

    public void setBes5(double bes5) {
        this.bes5 = bes5;
    }

    public double getNisandevirdendusen() {
        return nisandevirdendusen;
    }

    public void setNisandevirdendusen(double nisandevirdendusen) {
        this.nisandevirdendusen = nisandevirdendusen;
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

    public double getSgk5() {
        return sgk5;
    }

    public void setSgk5(double sgk5) {
        this.sgk5 = sgk5;
    }

    public double getSgkiszma() {
        return sgkiszma;
    }

    public void setSgkiszma(double sgkiszma) {
        this.sgkiszma = sgkiszma;
    }

    public double getDvma() {
        return dvma;
    }

    public void setDvma(double dvma) {
        this.dvma = dvma;
    }

    public double getNetma() {
        return netma;
    }

    public void setNetma(double netma) {
        this.netma = netma;
    }

    public double getKestopma() {
        return kestopma;
    }

    public void setKestopma(double kestopma) {
        this.kestopma = kestopma;
    }

    public double getMayismat() {
        return Mayismat;
    }

    public void setMayismat(double mayismat) {
        Mayismat = mayismat;
    }

    public double getKummatMayis() {
        return kummatMayis;
    }

    public void setKummatMayis(double kummatMayis) {
        this.kummatMayis = kummatMayis;
    }

    public double getGvkesMayis() {
        return gvkesMayis;
    }

    public void setGvkesMayis(double gvkesMayis) {
        this.gvkesMayis = gvkesMayis;
    }

    public double getFmmesaiMayis() {
        return fmmesaiMayis;
    }

    public void setFmmesaiMayis(double fmmesaiMayis) {
        this.fmmesaiMayis = fmmesaiMayis;
    }

    public double getGunlukbrutM2() {
        return gunlukbrutM2;
    }

    public void setGunlukbrutM2(double gunlukbrutM2) {
        this.gunlukbrutM2 = gunlukbrutM2;
    }

    public double getGunlukbrutMayis() {
        return gunlukbrutMayis;
    }

    public void setGunlukbrutMayis(double gunlukbrutMayis) {
        this.gunlukbrutMayis = gunlukbrutMayis;
    }

    public double getToplambrutMayis() {
        return toplambrutMayis;
    }

    public void setToplambrutMayis(double toplambrutMayis) {
        this.toplambrutMayis = toplambrutMayis;
    }

    public double getSgktoplambrutMayis() {
        return sgktoplambrutMayis;
    }

    public void setSgktoplambrutMayis(double sgktoplambrutMayis) {
        this.sgktoplambrutMayis = sgktoplambrutMayis;
    }

    public double getSgkdevredenMayis() {
        return sgkdevredenMayis;
    }

    public void setSgkdevredenMayis(double sgkdevredenMayis) {
        this.sgkdevredenMayis = sgkdevredenMayis;
    }

    public double getDevirgvmMayis() {
        return devirgvmMayis;
    }

    public void setDevirgvmMayis(double devirgvmMayis) {
        this.devirgvmMayis = devirgvmMayis;
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

    public double getNisanhazdevretmeyensgk() {
        return nisanhazdevretmeyensgk;
    }

    public void setNisanhazdevretmeyensgk(double nisanhazdevretmeyensgk) {
        this.nisanhazdevretmeyensgk = nisanhazdevretmeyensgk;
    }

    public double getMayistankalansgk() {
        return mayistankalansgk;
    }

    public void setMayistankalansgk(double mayistankalansgk) {
        this.mayistankalansgk = mayistankalansgk;
    }

    public double getMrtnsndevirsgk() {
        return mrtnsndevirsgk;
    }

    public void setMrtnsndevirsgk(double mrtnsndevirsgk) {
        this.mrtnsndevirsgk = mrtnsndevirsgk;
    }

    public double getCalgunmayis() {
        return calgunmayis;
    }

    public void setCalgunmayis(double calgunmayis) {
        this.calgunmayis = calgunmayis;
    }

    public double getBrutucretmayis() {
        return brutucretmayis;
    }

    public void setBrutucretmayis(double brutucretmayis) {
        this.brutucretmayis = brutucretmayis;
    }

    public double getPrimtutarmayis() {
        return primtutarmayis;
    }

    public void setPrimtutarmayis(double primtutarmayis) {
        this.primtutarmayis = primtutarmayis;
    }

    public double mayis(double kummatNisan, double devirgvmNisan, double sgkdevredenNisan,
                        double nisandankalansgk) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Calisma gu sauisini giriniz");
        double gun = scan.nextDouble() ;
        System.out.println("Lutfen ucretibizi girin");
        double ucret = scan.nextDouble() ;
        System.out.println("Lutfen mesai surenizi giriniz");
        int mesaim = scan.nextInt();
        System.out.println("prim brut tutarini giriniz");
        double primmay = scan.nextDouble();
        System.out.println ("BES KESINTISI BARSA (1) TUSUNA BASUNUZ");
        int beso = scan.nextInt ();

        calgunmayis =gun;
        brutucretmayis = ucret /30*calgunmayis;
        primtutarmayis =primmay;
        guntutar = ucret / 30;
        ayucret = guntutar * gun;
        fmmesaiMayis = ucret /225*1.5*mesaim;
        System.out.println("MESAI TUTARI  : " + fmmesaiMayis);
        toplambrutMayis = ayucret + fmmesaiMayis + primmay;
        System.out.println("TOPLAM BRUT  " + toplambrutMayis);
        gunlukbrutMayis = (toplambrutMayis / 30);
        sgktoplambrutMayis = (toplambrutMayis + sgkdevredenNisan);
        System.out.println("SGK HESAPLANACAK  " + sgktoplambrutMayis);
        gunlukbrutM2 = (toplambrutMayis + sgkdevredenNisan) / 30;
        sgkgun = tavan /30;

        if ( beso == 1){
            bes5 =  toplambrutOcak *0.03;
        }else {
            bes5 = 0;
        }

        if(sgkdevredenNisan <= 0){
            if(toplambrutMayis <= (sgkgun * gun)){

                sgk5 = toplambrutMayis * 0.14;
                System.out.println("SGK ISCI KESINTI  " + sgk5);
            }
            else {
                sgk5 = ((tavan /30)*gun) * 0.14;
                System.out.println("SGK ISCI KESINTI  " + sgk5);
            }

            if(toplambrutMayis <= (sgkgun * gun)){

                sgkiszma = toplambrutMayis * 0.01;
                System.out.println("SGK ISSIZLIK  :  " + sgkiszma);
            }
            else {
                sgkiszma = ((tavan /30)*gun) * 0.01;
                System.out.println("SGK ISSIZLIK  :" + sgkiszma);
            }


        }
        else{
            if(((gunlukbrutMayis * gun)+sgkdevredenNisan) <= (sgkgun * gun)){

                sgk5 = sgktoplambrutMayis * 0.14;
                System.out.println( "SGK ISCI KESINTI  : "  +sgk5);
            }
            else {
                sgk5 = ((tavan /30)*gun) * 0.14;
                System.out.println( "SGK ISCI KESINTI  : "  +sgk5);
            }

            if(((gunlukbrutMayis * gun)+sgkdevredenNisan) <= (sgkgun * gun)){

                sgkiszma = sgktoplambrutMayis * 0.01;
                System.out.println("SGK ISSIZLIK  :" + sgkiszma);
            }
            else {
                sgkiszma = ((tavan /30)*gun) * 0.01;
                System.out.println("SGK ISSIZLIK  :" + sgkiszma);
            }

        }
        if (toplambrutMayis > tavan){
            mayistankalansgk = toplambrutMayis - tavan;
        }else {
            mayistankalansgk = 0 ;
        }

        dvma = (toplambrutMayis * 0.00759);
        System.out.println("DAMGA VERGISI  :" + dvma);

        Mayismat =   toplambrutMayis - (sgk5 + sgkiszma) ;
        System.out.println("MAYIS AYI GV MATRAHI  : " + Mayismat);
        kummatMayis = Mayismat + kummatNisan;
        System.out.println("KUMULATIF MATRAH  :" + kummatMayis);



        if (kummatMayis <= 32000.0) {
            gvkesMayis =    Mayismat * 0.15;
            System.out.println("GELIR VERGISI  :" + gvkesMayis);
        }
        else if (kummatMayis <= 70000.0){
            gvkesMayis =  4800 +  ((kummatMayis -32000) *0.20) - devirgvmNisan;
            System.out.println("GELIR VERGISI  :" + gvkesMayis);
        }
        else if (kummatMayis <= 250000.0){
            gvkesMayis = 12400 + ((kummatMayis - 70000.0) *0.27) - devirgvmNisan;
            System.out.println("GELIR VERGISI  :" + gvkesMayis);
        }
        else if (kummatMayis <= 880000.0){
            gvkesMayis = 61000 +  ((kummatMayis - 250000.0) *0.35) - devirgvmNisan;
            System.out.println("GELIR VERGISI  :" + gvkesMayis);
        }
        else if (kummatMayis > 880000.0){
            gvkesMayis = 281500.0 + ((kummatMayis - 880000.0) *0.40) - devirgvmNisan;
            System.out.println("GELIR VERGISI  :" + gvkesMayis);
        }


        if(sgkdevredenNisan > 0){
            if(tavan > toplambrutMayis){
                nisandevirdendusen =  (sgkiszma*100) - toplambrutMayis;
                System.out.println ("MART NISAN AYI DEVIRDEN DUSEN  :" + nisandevirdendusen);
            }else {
                nisandevirdendusen = 0;
            }

        }else {
            nisandevirdendusen = 0;
            System.out.println ("MART NISAN AYI DEVIRDEN DUSEN  :'" + nisandevirdendusen);
        }

        if((sgkdevredenNisan - nisandevirdendusen) <= nisandankalansgk){
            sgkdevredenMayis = (sgkdevredenNisan - nisandevirdendusen) + mayistankalansgk;
            System.out.println ("SGK DEVREDEN NISAN MAYIS : " + sgkdevredenMayis);


        }else{
            sgkdevredenMayis = nisandankalansgk + mayistankalansgk;
            System.out.println ("SGK DEVREDEN NISAN MAYIS  : " + sgkdevredenNisan);

        }
        kestopma = gvkesMayis + sgk5 + sgkiszma + dvma + bes5;
        netma = (toplambrutMayis - kestopma) + (gvind + dvind);
        System.out.println("NET UCRET  : " + netma);

        devirgvmMayis = devirgvmNisan + gvkesMayis;
        System.out.println("MAYIS DEVREDEN GELIR VERGISI  :" + devirgvmMayis);

        String FILE_NAME = "MAYIS_BORDRO.xlsx";

        XSSFWorkbook wb = new XSSFWorkbook ();
        XSSFSheet cs = wb.createSheet ( "BORDRO_2022" );
        //Sheet cs = wb.createSheet("Sayfa1");  //diger bir sheet tanimlama yontemi
        Object[][] table = {
                {"CG", "UCRET", "FM", "PRIM", "TOPLAM_BRUT","SGK_ISCI", "SGKISZ_ISCI", "SGK_DEVIR", "SGK_DEVDUS",
                        "DAMGA_VER", "GV", "KUM_GV","KES_TOP", "NET_ODEME"},
                {calgunmayis, brutucretmayis, primtutarmayis, fmmesaiMayis, toplambrutMayis, sgk5, sgkiszma,
                        sgkdevredenMayis, mayistankalansgk, dvma, gvkesMayis, kummatMayis, kestopma, netma}
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



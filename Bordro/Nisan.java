package Bordro;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Nisan extends Mart {
    public Nisan() {
        this.setKummatMart ( getKummatMart () );
        this.setDevirgvmMart ( getDevirgvmMart () );
        this.setSgkdevredenMart (getSgkdevredenMart ());
        this.setOcSbDevirsgk ( getOcSbDevirsgk () );
        this.setMayissgkdevretmeye ( getMayissgkdevretmeye () );
        this.setMarttankalansgk ( getMarttankalansgk () );
    }





    double tavan = 37530.0;
    double dvind = 37.98;
    double gvind = 638.01;
    double sgk4;
    double sgkiszn;
    double dvn;
    double netn;
    double kestopn;
    double Nisanmat;
    double kummatNisan;
    double gvkesNisan = 0;

    double fmmesaiNisan ;

    double gunlukbrutN2;

    double gunlukbrutNisan;

    double toplambrutNisan =0;
    double sgktoplambrutNisan;
    double sgkdevredenNisan;
    double devirgvmNisan;

    double guntutar ;
    double ayucret;
    double gunluktbrut;
    double mrtmysdevretmeyensgk;

    double nisandankalansgk;
    double sbtmrtdevirsgk;
    double calgunnisan;

    double brutucretnisan;

    double primtutarnisan;

    double martdevirdendusen;
    double beso  ;

    double bes4;

    @Override
    public double getBeso() {
        return beso;
    }

    @Override
    public void setBeso(double beso) {
        this.beso = beso;
    }

    public double getBes4() {
        return bes4;
    }

    public void setBes4(double bes4) {
        this.bes4 = bes4;
    }

    public double getMartdevirdendusen() {
        return martdevirdendusen;
    }

    public void setMartdevirdendusen(double martdevirdendusen) {
        this.martdevirdendusen = martdevirdendusen;
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

    public double getSgk4() {
        return sgk4;
    }

    public void setSgk4(double sgk4) {
        this.sgk4 = sgk4;
    }

    public double getSgkiszn() {
        return sgkiszn;
    }

    public void setSgkiszn(double sgkiszn) {
        this.sgkiszn = sgkiszn;
    }

    public double getDvn() {
        return dvn;
    }

    public void setDvn(double dvn) {
        this.dvn = dvn;
    }

    public double getNetn() {
        return netn;
    }

    public void setNetn(double netn) {
        this.netn = netn;
    }

    public double getKestopn() {
        return kestopn;
    }

    public void setKestopn(double kestopn) {
        this.kestopn = kestopn;
    }

    public double getNisanmat() {
        return Nisanmat;
    }

    public void setNisanmat(double nisanmat) {
        Nisanmat = nisanmat;
    }

    public double getKummatNisan() {
        return kummatNisan;
    }

    public void setKummatNisan(double kummatNisan) {
        this.kummatNisan = kummatNisan;
    }

    public double getGvkesNisan() {
        return gvkesNisan;
    }

    public void setGvkesNisan(double gvkesNisan) {
        this.gvkesNisan = gvkesNisan;
    }

    public double getFmmesaiNisan() {
        return fmmesaiNisan;
    }

    public void setFmmesaiNisan(double fmmesaiNisan) {
        this.fmmesaiNisan = fmmesaiNisan;
    }

    public double getGunlukbrutN2() {
        return gunlukbrutN2;
    }

    public void setGunlukbrutN2(double gunlukbrutN2) {
        this.gunlukbrutN2 = gunlukbrutN2;
    }

    public double getGunlukbrutNisan() {
        return gunlukbrutNisan;
    }

    public void setGunlukbrutNisan(double gunlukbrutNisan) {
        this.gunlukbrutNisan = gunlukbrutNisan;
    }

    public double getToplambrutNisan() {
        return toplambrutNisan;
    }

    public void setToplambrutNisan(double toplambrutNisan) {
        this.toplambrutNisan = toplambrutNisan;
    }

    public double getSgktoplambrutNisan() {
        return sgktoplambrutNisan;
    }

    public void setSgktoplambrutNisan(double sgktoplambrutNisan) {
        this.sgktoplambrutNisan = sgktoplambrutNisan;
    }

    public double getSgkdevredenNisan() {
        return sgkdevredenNisan;
    }

    public void setSgkdevredenNisan(double sgkdevredenNisan) {
        this.sgkdevredenNisan = sgkdevredenNisan;
    }

    public double getDevirgvmNisan() {
        return devirgvmNisan;
    }

    public void setDevirgvmNisan(double devirgvmNisan) {
        this.devirgvmNisan = devirgvmNisan;
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

    public double getMrtmysdevretmeyensgk() {
        return mrtmysdevretmeyensgk;
    }

    public void setMrtmysdevretmeyensgk(double mrtmysdevretmeyensgk) {
        this.mrtmysdevretmeyensgk = mrtmysdevretmeyensgk;
    }

    public double getNisandankalansgk() {
        return nisandankalansgk;
    }

    public void setNisandankalansgk(double nisandankalansgk) {
        this.nisandankalansgk = nisandankalansgk;
    }

    public double getSbtmrtdevirsgk() {
        return sbtmrtdevirsgk;
    }

    public void setSbtmrtdevirsgk(double sbtmrtdevirsgk) {
        this.sbtmrtdevirsgk = sbtmrtdevirsgk;
    }

    public double getCalgunnisan() {
        return calgunnisan;
    }

    public void setCalgunnisan(double calgunnisan) {
        this.calgunnisan = calgunnisan;
    }

    public double getBrutucretnisan() {
        return brutucretnisan;
    }

    public void setBrutucretnisan(double brutucretnisan) {
        this.brutucretnisan = brutucretnisan;
    }

    public double getPrimtutarnisan() {
        return primtutarnisan;
    }

    public void setPrimtutarnisan(double primtutarnisan) {
        this.primtutarnisan = primtutarnisan;
    }

    public double nisan(double kummatMart, double devirgvmMart, double sgkdevredenMart,
                        double OcSbDevirsgk, double marttankalansgk) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Calisma gu sauisini giriniz");
        double gun = scan.nextDouble() ;
        System.out.println("Lutfen ucretibizi girin");
        double ucret = scan.nextDouble() ;
        System.out.println("Lutfen mesai surenizi giriniz");
        int mesaim = scan.nextInt();
        System.out.println("prim brut tutarini giriniz");
        double primni = scan.nextDouble();
        System.out.println ("BES KESINTISI BARSA (1) TUSUNA BASUNUZ");
        int beso = scan.nextInt ();

        primtutarnisan = primni;
        calgunnisan =gun;
        brutucretnisan = ucret /30*calgunnisan;
        guntutar = ucret / 30;
        ayucret = guntutar * gun;
        fmmesaiNisan = ucret /225*1.5*mesaim;
        System.out.println("MESAI TUTARI  :" + fmmesaiNisan);
        toplambrutNisan = ayucret + fmmesaiNisan + primni;
        System.out.println("TOPLAM BRUT  :" + toplambrutNisan);
        gunlukbrutNisan = (toplambrutNisan / 30);
        sgktoplambrutNisan = (toplambrutNisan + sgkdevredenMart );
        System.out.println("SGK HESAPLANACAK  :" + sgktoplambrutNisan);
        gunlukbrutN2 = (toplambrutNisan + sgkdevredenMart) / 30;
        sgkgun = tavan /30;
        if ( beso == 1){
            bes4 =  toplambrutOcak *0.03;
        }else {
            bes4 = 0;
        }
        if(sgkdevredenMart <= 0){
            if(toplambrutNisan <= (sgkgun * gun)){

                sgk4 = toplambrutNisan * 0.14;
                System.out.println("SGK ISCI KESINTI  " + sgk4);
            }
            else {
                sgk4 = ((tavan /30)*gun)* 0.14;
                System.out.println("SGK ISCI KESINTI  " + sgk4);
            }

            if(toplambrutNisan <= (sgkgun * gun)){

                sgkiszn = toplambrutNisan * 0.01;
                System.out.println("SGK ISSIZLIK  :  " + sgkiszn);
            }
            else {
                sgkiszn = ((tavan /30)*gun) * 0.01;
                System.out.println("SGK ISSIZLIK  :" + sgkiszn);
            }


        }
        else{
            if(((gunlukbrutNisan * gun)+sgkdevredenMart) <= (sgkgun * gun)){

                sgk4 = sgktoplambrutNisan * 0.14;
                System.out.println( "SGK ISCI KESINTI  :"  +sgk4);
            }
            else {
                sgk4 = ((tavan /30)*gun) * 0.14;
                System.out.println( "SGK ISCI KESINTI  : "  +sgk4);
            }

            if(((gunlukbrutNisan * gun)+sgkdevredenMart) <= (sgkgun * gun)){

                sgkiszn = sgktoplambrutNisan * 0.01;
                System.out.println("SGK ISSIZLIK  :" + sgkiszn);
            }
            else {
                sgkiszn = ((tavan /30)*gun) * 0.01;
                System.out.println("SGK ISSIZLIK  :" + sgkiszn);
            }

        }
        if (toplambrutNisan > tavan){
            nisandankalansgk = toplambrutNisan- tavan;
        }else {
            nisandankalansgk = 0 ;
        }

        dvn = (toplambrutNisan * 0.00759);
        System.out.println("DAMGA VERGISI  :" + dvn);

        Nisanmat =   toplambrutNisan - (sgk4 + sgkiszn);
        System.out.println("NISAN AYI GV MATRAHI  : " + Nisanmat);

        kummatNisan = Nisanmat + kummatMart;
        System.out.println("KUMULATIF MATRAH  :" + kummatNisan);



        if (kummatNisan <= 32000.0) {
            gvkesNisan =    Nisanmat * 0.15;
            System.out.println("GELIR VERGISI  :" + gvkesNisan);
        }
        else if (kummatNisan <= 70000.0){
            gvkesNisan =  4800 +  ((kummatNisan -32000) *0.20) - devirgvmMart;
            System.out.println("GELIR VERGISI  :" + gvkesNisan);
        }
        else if (kummatNisan <= 250000.0){
            gvkesNisan = 12400 + ((kummatNisan - 70000.0) *0.27) - devirgvmMart;
            System.out.println("GELIR VERGISI  :" + gvkesNisan);
        }
        else if (kummatNisan <= 880000.0){
            gvkesNisan = 61000 +  ((kummatNisan - 250000.0) *0.35) - devirgvmMart;
            System.out.println("GELIR VERGISI  :" + gvkesNisan);
        }
        else if (kummatNisan > 880000.0){
            gvkesNisan = 281500.0 + ((kummatNisan - 880000.0) *0.40) - devirgvmMart;
            System.out.println("GELIR VERGISI  :" + gvkesNisan);
        }



        if(sgkdevredenMart > 0){
            if(tavan > toplambrutNisan){
                martdevirdendusen =  (sgkiszn*100) - toplambrutNisan;
                System.out.println ("SUBAT MART AYI DEVIRDEN DUSEN  ;" + martdevirdendusen);
            }else {
                martdevirdendusen = 0;
            }

        }else {
            martdevirdendusen = 0;
            System.out.println ("SUBAT MART AYI DEVIRDEN DUSEN   : "   + martdevirdendusen);
        }

        if((sgkdevredenMart - martdevirdendusen) <= marttankalansgk){
            sgkdevredenNisan = (sgkdevredenMart - martdevirdendusen) + nisandankalansgk;
            System.out.println ("SGK DEVREDEN MART-NISAN  : " + sgkdevredenNisan);


        }else{
            sgkdevredenNisan = marttankalansgk + nisandankalansgk;
            System.out.println ("SGK DEVREDEN MART NISAN  : " + sgkdevredenNisan);

        }

        kestopn = gvkesNisan + sgk4 + sgkiszn + dvn + bes4;
        netn = (toplambrutNisan - kestopn) + (gvind + dvind);
        System.out.println("NET UCRET  : " + netn);

        devirgvmNisan = devirgvmMart + gvkesNisan;
        System.out.println("NISAN AYI DEVREDEN GELIR VERGISI  : " + devirgvmNisan);
        String FILE_NAME = "NISAN_BORDRO.xlsx";

        XSSFWorkbook wb = new XSSFWorkbook ();
        XSSFSheet cs = wb.createSheet ( "BORDRO_2022" );
        //Sheet cs = wb.createSheet("Sayfa1");  //diger bir sheet tanimlama yontemi
        Object[][] table = {
                {"CG", "UCRET", "FM", "PRIM", "TOPLAM_BRUT","SGK_ISCI", "SGKISZ_ISCI", "SGK_DEVIR", "SGK_DEVDUS",
                        "DAMGA_VER", "GV", "KUM_GV","KES_TOP", "NET_ODEME"},
                {calgunnisan, brutucretnisan, primtutarnisan, fmmesaiNisan, toplambrutNisan, sgk4, sgkiszn,
                        sgkdevredenNisan, nisandankalansgk, dvn, gvkesNisan, kummatNisan, kestopn, netn}
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



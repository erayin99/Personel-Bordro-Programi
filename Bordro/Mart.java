package Bordro;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Mart extends Subat {
    public Mart() {
        this.setKummatsubat (getKummatsubat());
        this.setSgkdevredenSubat (getSgkdevredenSubat());
        this.setDevirgvSubat (getDevirgvSubat ());
        this.setOcaktandevirsgk ( getOcaktandevirsgk () );
        this.setSubattankalansgk ( getSubattankalansgk () );


    }



    double tavan = 37530.0;
    double sgk3;
    double sgkiszm;
    double dvm;
    double martmat;
    double kummatMart;
    double gvkesMart = 0;
    double dvind = 37.98;
    double gvind = 638.01;
    double kestopm;
    double netm;
    double fmmesaimart ;

    double gunlukbrutm2;

    double gunlukbrutMart;

    double toplambrutMart =0;
    double sgktoplamnrutMart;
    double sgkdevredenMart;
    double devirgvmMart;

    double guntutar ;
    double ayucret;
    double gunluktbrut;

    double devirdendusMart = 0;

    double devirkalan;
    double OcSbDevirsgk;
    double mayissgkdevretmeye;
    double devirdendusenmart;
    double marttankalansgk;
    double ocaksubatdevdusensgk;
    double calgunmart;

    double brutucretmart;

    double primtutarmart;
    double subatdevirdendusen;
    double beso  ;

    double bes3;

    @Override
    public double getBeso() {
        return beso;
    }

    @Override
    public void setBeso(double beso) {
        this.beso = beso;
    }

    public double getBes3() {
        return bes3;
    }

    public void setBes3(double bes3) {
        this.bes3 = bes3;
    }

    public double getSubatdevirdendusen() {
        return subatdevirdendusen;
    }

    public void setSubatdevirdendusen(double subatdevirdendusen) {
        this.subatdevirdendusen = subatdevirdendusen;
    }

    @Override
    public double getTavan() {
        return tavan;
    }

    @Override
    public void setTavan(double tavan) {
        this.tavan = tavan;
    }

    public double getSgk3() {
        return sgk3;
    }

    public void setSgk3(double sgk3) {
        this.sgk3 = sgk3;
    }

    public double getSgkiszm() {
        return sgkiszm;
    }

    public void setSgkiszm(double sgkiszm) {
        this.sgkiszm = sgkiszm;
    }

    public double getDvm() {
        return dvm;
    }

    public void setDvm(double dvm) {
        this.dvm = dvm;
    }

    public double getMartmat() {
        return martmat;
    }

    public void setMartmat(double martmat) {
        this.martmat = martmat;
    }

    public double getKummatMart() {
        return kummatMart;
    }

    public void setKummatMart(double kummatMart) {
        this.kummatMart = kummatMart;
    }

    public double getGvkesMart() {
        return gvkesMart;
    }

    public void setGvkesMart(double gvkesMart) {
        this.gvkesMart = gvkesMart;
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

    public double getKestopm() {
        return kestopm;
    }

    public void setKestopm(double kestopm) {
        this.kestopm = kestopm;
    }

    public double getNetm() {
        return netm;
    }

    public void setNetm(double netm) {
        this.netm = netm;
    }

    public double getFmmesaimart() {
        return fmmesaimart;
    }

    public void setFmmesaimart(double fmmesaimart) {
        this.fmmesaimart = fmmesaimart;
    }

    public double getGunlukbrutm2() {
        return gunlukbrutm2;
    }

    public void setGunlukbrutm2(double gunlukbrutm2) {
        this.gunlukbrutm2 = gunlukbrutm2;
    }

    public double getGunlukbrutMart() {
        return gunlukbrutMart;
    }

    public void setGunlukbrutMart(double gunlukbrutMart) {
        this.gunlukbrutMart = gunlukbrutMart;
    }

    public double getToplambrutMart() {
        return toplambrutMart;
    }

    public void setToplambrutMart(double toplambrutMart) {
        this.toplambrutMart = toplambrutMart;
    }

    public double getSgktoplamnrutMart() {
        return sgktoplamnrutMart;
    }

    public void setSgktoplamnrutMart(double sgktoplamnrutMart) {
        this.sgktoplamnrutMart = sgktoplamnrutMart;
    }

    public double getSgkdevredenMart() {
        return sgkdevredenMart;
    }

    public void setSgkdevredenMart(double sgkdevredenMart) {
        this.sgkdevredenMart = sgkdevredenMart;
    }

    public double getDevirgvmMart() {
        return devirgvmMart;
    }

    public void setDevirgvmMart(double devirgvmMart) {
        this.devirgvmMart = devirgvmMart;
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

    public double getDevirdendusMart() {
        return devirdendusMart;
    }

    public void setDevirdendusMart(double devirdendusMart) {
        this.devirdendusMart = devirdendusMart;
    }

    public double getDevirkalan() {
        return devirkalan;
    }

    public void setDevirkalan(double devirkalan) {
        this.devirkalan = devirkalan;
    }

    public double getOcSbDevirsgk() {
        return OcSbDevirsgk;
    }

    public void setOcSbDevirsgk(double ocSbDevirsgk) {
        OcSbDevirsgk = ocSbDevirsgk;
    }

    public double getMayissgkdevretmeye() {
        return mayissgkdevretmeye;
    }

    public void setMayissgkdevretmeye(double mayissgkdevretmeye) {
        this.mayissgkdevretmeye = mayissgkdevretmeye;
    }

    public double getDevirdendusenmart() {
        return devirdendusenmart;
    }

    public void setDevirdendusenmart(double devirdendusenmart) {
        this.devirdendusenmart = devirdendusenmart;
    }

    public double getMarttankalansgk() {
        return marttankalansgk;
    }

    public void setMarttankalansgk(double marttankalansgk) {
        this.marttankalansgk = marttankalansgk;
    }

    public double getOcaksubatdevdusensgk() {
        return ocaksubatdevdusensgk;
    }

    public void setOcaksubatdevdusensgk(double ocaksubatdevdusensgk) {
        this.ocaksubatdevdusensgk = ocaksubatdevdusensgk;
    }

    public double getCalgunmart() {
        return calgunmart;
    }

    public void setCalgunmart(double calgunmart) {
        this.calgunmart = calgunmart;
    }

    public double getBrutucretmart() {
        return brutucretmart;
    }

    public void setBrutucretmart(double brutucretmart) {
        this.brutucretmart = brutucretmart;
    }

    public double getPrimtutarmart() {
        return primtutarmart;
    }

    public void setPrimtutarmart(double primtutarmart) {
        this.primtutarmart = primtutarmart;
    }

    public double mart(double kummatsbt, double sgkdevredenSubat, double devirgvSubat,
                       double  ocaktandevirsgk, double subattankalansgk) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Calisma gu sauisini giriniz");
        double gun = scan.nextDouble() ;
        System.out.println("Lutfen ucretibizi girin");
        double ucret = scan.nextDouble() ;
        System.out.println("Lutfen mesai surenizi giriniz");
        int mesaim = scan.nextInt();
        System.out.println("prim brut tutarini giriniz");
        double primm = scan.nextDouble();
        System.out.println ("BES KESINTISI BARSA (1) TUSUNA BASUNUZ");
        int beso = scan.nextInt ();


        calgunmart =gun;
        brutucretmart = ucret /30*calgunmart;
        primtutarsubat = primm;
        guntutar = ucret / 30;
        ayucret = guntutar * gun;
        fmmesaimart = ucret /225*1.5*mesaim;
        System.out.println("MESAI TUTARI  " + fmmesaimart);
        toplambrutMart = ayucret + fmmesaimart + primm;
        System.out.println("TOPLAM BRUT  " + toplambrutMart);
        gunlukbrutMart = (toplambrutMart / 30);
        sgktoplamnrutMart = toplambrutMart + sgkdevredenSubat;
        System.out.println("SGK HESAPLANACAK  " + sgktoplamnrutMart);
        gunlukbrutm2 = (toplambrutMart + sgkdevredenSubat) / 30;
        sgkgun = tavan /30;

        if ( beso == 1){
            bes3 =  toplambrutOcak *0.03;
        }else {
            bes3 = 0;
        }

        if(sgkdevredenSubat <= 0){
            if(toplambrutMart <= (sgkgun * gun)){

                sgk3 = toplambrutMart * 0.14;
                System.out.println("SGK ISCI KESINTI  " + sgk3);
            }
            else {
                sgk3 = ((tavan /30)*gun) * 0.14;
                System.out.println("SGK ISCI KESINTI  " + sgk3);
            }

            if(toplambrutMart <= (sgkgun * gun)){

                sgkiszm = toplambrutMart * 0.01;
                System.out.println("SGK ISSIZLIK  :  " + sgkiszm);
            }
            else {
                sgkiszm = ((tavan /30)*gun) * 0.01;
                System.out.println("SGK ISSIZLIK  :" + sgkiszm);
            }


        }
        else{
            if(((toplambrutMart * gun)+sgkdevredenSubat) <= (sgkgun * gun)){

                sgk3 = sgktoplamnrutMart * 0.14;
                System.out.println( "SGK ISCI KESINTI  : "  +sgk3);
            }
            else {
                sgk3 = (sgkgun * gun) * 0.14;
                System.out.println( "SGK ISCI KESINTI  : "  +sgk3);
            }

            if(((gunlukbrutMart * gun)+sgkdevredenSubat) <= (sgkgun * gun)){

                sgkiszm = sgktoplamnrutMart * 0.01;
                System.out.println("SGK ISSIZLIK  :" + sgkiszm);
            }
            else {
                sgkiszm = (sgkgun * gun) * 0.01;
                System.out.println("SGK ISSIZLIK  :" + sgkiszm);
            }

        }
        if (toplambrutMart > tavan){
            marttankalansgk = toplambrutMart- tavan;
        }else {
            marttankalansgk = 0 ;
        }

        dvm = (toplambrutMart * 0.00759);
        System.out.println("DAMGA VERGISI  :" + dvm);

        martmat =   toplambrutMart - (sgk3 + sgkiszm);
        System.out.println("MART AYI GV MATRAHI  : " + martmat);
        kummatMart = martmat + kummatsbt;
        System.out.println("KUMULATIF MATRAH  :" + kummatMart);

        if (kummatMart <= 32000.0) {
            gvkesMart = martmat * 0.15;
            System.out.println("GELIR VERGISI  :" + gvkesMart);
        }
        else if (kummatMart <= 70000.0){
            gvkesMart =  4800 +  ((kummatMart -32000) *0.20) - devirgvSubat;
            System.out.println("GELIR VERGISI  :" + gvkesMart);
        }
        else if (kummatMart <= 250000.0){
            gvkesMart = 12400 + ((kummatMart - 70000.0) *0.27) - devirgvSubat;
            System.out.println("GELIR VERGISI  :" + gvkesMart);
        }
        else if (kummatMart <= 880000.0){
            gvkesMart = 61000 +  ((kummatMart - 250000.0) *0.35) - devirgvSubat;
            System.out.println("GELIR VERGISI  :" + gvkesMart);
        }
        else if (kummatMart > 880000.0){
            gvkesMart = 281500.0 + ((kummatMart - 880000.0) *0.40) - devirgvSubat;
            System.out.println("GELIR VERGISI  :" + gvkesMart);
        }



        if(sgkdevredenSubat > 0){
            if(tavan > toplambrutMart){
                subatdevirdendusen =  (sgkiszm*100) - toplambrutMart;
                System.out.println ("OCAK SUBAT AYI DEVIRDEN DUSEN" + subatdevirdendusen);
            }else {
                subatdevirdendusen = 0;
            }

        }else {
            subatdevirdendusen = 0;
            System.out.println ("OCAK  SUBAT AYI DEVIRDEN DUSEN  : " + ocakdevirdendusen);
        }

        if((sgkdevredenSubat - subatdevirdendusen) <= subattankalansgk){
           sgkdevredenMart = (sgkdevredenSubat - subatdevirdendusen) + marttankalansgk;
            System.out.println ("SGK DEVREDEN SUBAT-MART  : " + sgkdevredenMart);


        }else{
            sgkdevredenMart = subattankalansgk + marttankalansgk;
        System.out.println ("SGK DEVREDEN SUBAT MART  : " + sgkdevredenMart);

        }


        kestopm = gvkesMart + sgk3 + sgkiszm + dvm + bes3;
        netm = (toplambrutMart - kestopm) + (gvind + dvind);
        System.out.println("NET UCRET  : " + netm);

        devirgvmMart = devirgvSubat + gvkesMart;
        System.out.println("DEVREDEN GELIR VERGISI  : " + devirgvmMart);


        String FILE_NAME = "MART_BORDRO.xlsx";

        XSSFWorkbook wb = new XSSFWorkbook ();
        XSSFSheet cs = wb.createSheet ( "BORDRO_2022" );
        //Sheet cs = wb.createSheet("Sayfa1");  //diger bir sheet tanimlama yontemi
        Object[][] table = {
                {"CG", "UCRET", "FM", "PRIM", "TOPLAM_BRUT","SGK_ISCI", "SGKISZ_ISCI", "SGK_DEVIR", "SGK_DEVDUS",
                        "DAMGA_VER", "GV", "KUM_GV","KES_TOP", "NET_ODEME"},
                {calgunmart, brutucretmart, primtutarmart, fmmesaimart, toplambrutMart, sgk3, sgkiszm,
                        sgkdevredenMart, marttankalansgk, dvm, gvkesMart, kummatMart, kestopm, netm}
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



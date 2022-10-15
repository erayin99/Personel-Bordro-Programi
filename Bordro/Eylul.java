package Bordro;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Eylul extends Agustos {
    public Eylul() {
        this.setKummatagustos ( getKummatagustos () );
        this.setDevirgvmagustos ( getDevirgvmagustos () );
        this.setSgkdevredenagustos ( getSgkdevredenagustos () );
        this.setAgustosdankalansgk ( getAgustosdankalansgk () );

    }


    double tavan2 = 48532.50;
    double dvind2 = 49.12;
    double gvind4 = 1100.07;
    double sgk9;
    double sgkisze;
    double dve;
    double nete;
    double kestope;
    double eylulsmat;
    double kummateylul;
    double gvkeseylul = 0;

    double fmmesaieylul;

    double gunlukbrutE2;

    double gunlukbrutEYLUL;

    double toplambrutEYLUL = 0;
    double sgktoplambrutEYLUL;
    double sgkdevredeneylul;
    double devirgvmeylul;

    double guntutar;
    double ayucret;
    double gunluktbrut;
    double eyluldankalansgk;
    double agsteyltdevirsgk;
    double calguneylul;

    double brutucreteylul;

    double primtutareylul;
    double agustosdevirdendusensgk;

    double beso  ;

    double bes9;

    @Override
    public double getBeso() {
        return beso;
    }

    @Override
    public void setBeso(double beso) {
        this.beso = beso;
    }

    public double getBes9() {
        return bes9;
    }

    public void setBes9(double bes9) {
        this.bes9 = bes9;
    }

    public double getAgustosdevirdendusensgk() {
        return agustosdevirdendusensgk;
    }

    public void setAgustosdevirdendusensgk(double agustosdevirdendusensgk) {
        this.agustosdevirdendusensgk = agustosdevirdendusensgk;
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

    public double getGvind4() {
        return gvind4;
    }

    public void setGvind4(double gvind4) {
        this.gvind4 = gvind4;
    }

    public double getSgk9() {
        return sgk9;
    }

    public void setSgk9(double sgk9) {
        this.sgk9 = sgk9;
    }

    public double getSgkisze() {
        return sgkisze;
    }

    public void setSgkisze(double sgkisze) {
        this.sgkisze = sgkisze;
    }

    public double getDve() {
        return dve;
    }

    public void setDve(double dve) {
        this.dve = dve;
    }

    public double getNete() {
        return nete;
    }

    public void setNete(double nete) {
        this.nete = nete;
    }

    public double getKestope() {
        return kestope;
    }

    public void setKestope(double kestope) {
        this.kestope = kestope;
    }

    public double getEylulsmat() {
        return eylulsmat;
    }

    public void setEylulsmat(double eylulsmat) {
        this.eylulsmat = eylulsmat;
    }

    public double getKummateylul() {
        return kummateylul;
    }

    public void setKummateylul(double kummateylul) {
        this.kummateylul = kummateylul;
    }

    public double getGvkeseylul() {
        return gvkeseylul;
    }

    public void setGvkeseylul(double gvkeseylul) {
        this.gvkeseylul = gvkeseylul;
    }

    public double getFmmesaieylul() {
        return fmmesaieylul;
    }

    public void setFmmesaieylul(double fmmesaieylul) {
        this.fmmesaieylul = fmmesaieylul;
    }

    public double getGunlukbrutE2() {
        return gunlukbrutE2;
    }

    public void setGunlukbrutE2(double gunlukbrutE2) {
        this.gunlukbrutE2 = gunlukbrutE2;
    }

    public double getGunlukbrutEYLUL() {
        return gunlukbrutEYLUL;
    }

    public void setGunlukbrutEYLUL(double gunlukbrutEYLUL) {
        this.gunlukbrutEYLUL = gunlukbrutEYLUL;
    }

    public double getToplambrutEYLUL() {
        return toplambrutEYLUL;
    }

    public void setToplambrutEYLUL(double toplambrutEYLUL) {
        this.toplambrutEYLUL = toplambrutEYLUL;
    }

    public double getSgktoplambrutEYLUL() {
        return sgktoplambrutEYLUL;
    }

    public void setSgktoplambrutEYLUL(double sgktoplambrutEYLUL) {
        this.sgktoplambrutEYLUL = sgktoplambrutEYLUL;
    }

    public double getSgkdevredeneylul() {
        return sgkdevredeneylul;
    }

    public void setSgkdevredeneylul(double sgkdevredeneylul) {
        this.sgkdevredeneylul = sgkdevredeneylul;
    }

    public double getDevirgvmeylul() {
        return devirgvmeylul;
    }

    public void setDevirgvmeylul(double devirgvmeylul) {
        this.devirgvmeylul = devirgvmeylul;
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

    public double getEyluldankalansgk() {
        return eyluldankalansgk;
    }

    public void setEyluldankalansgk(double eyluldankalansgk) {
        this.eyluldankalansgk = eyluldankalansgk;
    }

    public double getAgsteyltdevirsgk() {
        return agsteyltdevirsgk;
    }

    public void setAgsteyltdevirsgk(double agsteyltdevirsgk) {
        this.agsteyltdevirsgk = agsteyltdevirsgk;
    }

    public double getCalguneylul() {
        return calguneylul;
    }

    public void setCalguneylul(double calguneylul) {
        this.calguneylul = calguneylul;
    }

    public double getBrutucreteylul() {
        return brutucreteylul;
    }

    public void setBrutucreteylul(double brutucreteylul) {
        this.brutucreteylul = brutucreteylul;
    }

    public double getPrimtutareylul() {
        return primtutareylul;
    }

    public void setPrimtutareylul(double primtutareylul) {
        this.primtutareylul = primtutareylul;
    }

    public double eylul(double kummatagustos, double devirgvmagustos, double sgkdevredenagustos,
                        double agustosdankalansgk) {


        Scanner scan = new Scanner ( System.in );
        System.out.println ( "Calisma gu sauisini giriniz" );
        double gun = scan.nextDouble ();
        System.out.println ( "Lutfen ucretibizi girin" );
        double ucret = scan.nextDouble ();
        System.out.println ( "Lutfen mesai surenizi giriniz" );
        int mesaim = scan.nextInt ();
        System.out.println ( "prim brut tutarini giriniz" );
        double primeyl = scan.nextDouble ();
        System.out.println ("BES KESINTISI BARSA (1) TUSUNA BASUNUZ");
        int beso = scan.nextInt ();
        calguneylul =gun;
        brutucreteylul = ucret /30*calguneylul;
        primtutareylul = primeyl;
        guntutar = ucret / 30;
        ayucret = guntutar * gun;
        fmmesaieylul = ucret / 225 * 1.5 * mesaim;
        System.out.println ( "MESAI TUTARI  ; " + fmmesaieylul );
        toplambrutEYLUL = ayucret + fmmesaieylul + primeyl;
        System.out.println ( "TOPLAM BRUT  " + toplambrutEYLUL );
        gunlukbrutEYLUL = (toplambrutEYLUL / 30);
        sgktoplambrutEYLUL = (toplambrutEYLUL + sgkdevredenagustos);
        System.out.println ( "SGK HESAPLANACAK  " + sgktoplambrutEYLUL );
        gunlukbrutE2 = (toplambrutEYLUL + sgkdevredenagustos) / 30;
        sgkgun = tavan2 / 30;
        if ( beso == 1){
            bes9 =  toplambrutOcak *0.03;
        }else {
            bes9 = 0;
        }

        if (sgkdevredenagustos <= 0) {
            if (toplambrutEYLUL <= (sgkgun * gun)) {

                sgk9 = toplambrutEYLUL * 0.14;
                System.out.println ( "SGK ISCI KESINTI  " + sgk9 );
            } else {
                sgk9 = ((tavan2 / 30) * gun) * 0.14;
                System.out.println ( "SGK ISCI KESINTI  " + sgk9 );
            }

            if (toplambrutEYLUL <= (sgkgun * gun)) {

                sgkisze = toplambrutEYLUL * 0.01;
                System.out.println ( "SGK ISSIZLIK  :  " + sgkisze );
            } else {
                sgkisze = ((tavan2 / 30) * gun) * 0.01;
                System.out.println ( "SGK ISSIZLIK  :" + sgkisze );
            }


        } else {
            if (((gunlukbrutEYLUL * gun) + sgkdevredenagustos) <= (sgkgun * gun)) {

                sgk9 = sgktoplambrutEYLUL * 0.14;
                System.out.println ( "SGK ISCI KESINTI  : " + sgk9 );
            } else {
                sgk9 = ((tavan2 / 30) * gun) * 0.14;
                System.out.println ( "SGK ISCI KESINTI  : " + sgk9 );
            }


            if (((gunlukbrutEYLUL * gun) + sgkdevredenagustos) <= (sgkgun * gun)) {

                sgkisze = sgktoplambrutEYLUL * 0.01;
                System.out.println ( "SGK ISSIZLIK  :" + sgkisze );
            } else {
                sgkisze = ((tavan2 / 30) * gun) * 0.01;
                System.out.println ( "SGK ISSIZLIK  :" + sgkisze );
            }
        }

            if (toplambrutEYLUL > tavan2) {
                eyluldankalansgk = toplambrutEYLUL - tavan2;
            } else {
                eyluldankalansgk = 0;
            }

            dve = (toplambrutEYLUL * 0.00759);
            System.out.println ( "DAMGA VERGISI  :" + dve );

            eylulsmat = toplambrutEYLUL - (sgk9 + sgkisze);
            System.out.println ( "EYLUL AYI GV MATRAHI" + eylulsmat );

            kummateylul = eylulsmat + kummatagustos;
            System.out.println ( "KUMULATIF MATRAH  :" + kummateylul );


            if (kummateylul <= 32000.0) {
                gvkeseylul = eylulsmat * 0.15;
                System.out.println ( "GELIR VERGISI  :" + gvkeseylul );
            } else if (kummateylul <= 70000.0) {
                gvkeseylul = 4800 + ((kummateylul - 32000) * 0.20) - devirgvmagustos;
                System.out.println ( "GELIR VERGISI  :" + gvkeseylul );
            } else if (kummateylul <= 250000.0) {
                gvkeseylul = 12400 + ((kummateylul - 70000.0) * 0.27) - devirgvmagustos;
                System.out.println ( "GELIR VERGISI  :" + gvkeseylul );
            } else if (kummateylul <= 880000.0) {
                gvkeseylul = 61000 + ((kummateylul - 250000.0) * 0.35) - devirgvmagustos;
                System.out.println ( "GELIR VERGISI  :" + gvkeseylul );
            } else if (kummateylul > 880000.0) {
                gvkeseylul = 281500.0 + ((kummateylul - 880000.0) * 0.40) - devirgvmagustos;
                System.out.println ( "GELIR VERGISI  :" + gvkeseylul );
            }



        if(sgkdevredenagustos > 0){
            if(tavan > toplambrutEYLUL){
                agustosdevirdendusensgk =  (sgkisze*100) - toplambrutEYLUL;
                System.out.println ("TEMMUZ AGUSTOS AYI DEVIRDEN DUSEN  : " + agustosdevirdendusensgk);
            }else {
                agustosdevirdendusensgk = 0;
            }

        }else {
            agustosdevirdendusensgk = 0;
            System.out.println ("TEMMUZ AGUSTIS AYI DEVIRDEN DUSEN  : " + agustosdevirdendusensgk);
        }

        if((sgkdevredenagustos - agustosdevirdendusensgk) <= agustosdankalansgk){
            sgkdevredeneylul = (sgkdevredenagustos - agustosdevirdendusensgk) + eyluldankalansgk;
            System.out.println ("SGK DEVREDEN AGUSTOS EYLUL  : " + sgkdevredeneylul);


        }else{
            sgkdevredeneylul = agustosdankalansgk + eyluldankalansgk;
            System.out.println ("SGK DEVREDEN AGUSTOS EYLUL : " + sgkdevredeneylul);

        };

            kestope = gvkeseylul + sgk9 + sgkisze + dve - bes9;
            nete = (toplambrutEYLUL - kestope) + (gvind4 + dvind2);
            System.out.println ( "NET UCRET  : " + nete );

            devirgvmeylul = devirgvmagustos + gvkeseylul;
            System.out.println ( "EYLUL DEVREDEN GELIR VERGISI  : " + devirgvmeylul );

        String FILE_NAME = "EYLUL_BORDRO.xlsx";

        XSSFWorkbook wb = new XSSFWorkbook ();
        XSSFSheet cs = wb.createSheet ( "BORDRO_2022" );
        //Sheet cs = wb.createSheet("Sayfa1");  //diger bir sheet tanimlama yontemi
        Object[][] table = {
                {"CG", "UCRET", "FM", "PRIM", "TOPLAM_BRUT","SGK_ISCI", "SGKISZ_ISCI", "SGK_DEVIR", "SGK_DEVDUS",
                        "DAMGA_VER", "GV", "KUM_GV","KES_TOP", "NET_ODEME"},
                {calguneylul, brutucreteylul, primtutareylul, fmmesaieylul, toplambrutEYLUL, sgk9, sgkisze,
                        sgkdevredeneylul, eyluldankalansgk, dve, gvkeseylul, kummateylul, kestope, nete}
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



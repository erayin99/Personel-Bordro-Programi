package Bordro;

public class Main1 {


    public static void main(String[] args) {

        Ocak ock = new Ocak();
        ock.ocak( ock.sgkisz, ock.kummatOcak, ock.net );
        Subat sbt = new Subat();
        sbt.subat(ock.kummatOcak,ock.gvkesOcak, ock.sgkdevredenocak);
        Mart mrt = new Mart();
        mrt.mart(sbt.kummatsubat, sbt.sgkdevredenSubat, sbt.devirgvSubat,
                sbt.ocaktandevirsgk, sbt.subattankalansgk );
        Nisan nsn = new Nisan ();
        nsn.nisan (mrt.kummatMart, mrt.devirgvmMart, mrt.sgkdevredenMart,
                mrt.OcSbDevirsgk, mrt.marttankalansgk);
        Mayis mys = new Mayis ();
        mys.mayis ( nsn.kummatNisan, nsn.devirgvmNisan, nsn.sgkdevredenNisan,
                nsn.nisandankalansgk );
        Haziran hzrn = new Haziran ();
        hzrn.Haziran ( mys.kummatMayis, mys.devirgvmMayis, mys.sgkdevredenMayis,
                mys.mayistankalansgk);
        Temmuz tmmz = new Temmuz ();
        tmmz.temmuz ( hzrn.kummatHaziran, hzrn.devirgvmHaziran, hzrn.sgkdevredenHaziran,
                hzrn.Hazirandankalansgk);
        Agustos ags = new Agustos ();
        ags.agustos (tmmz.kummattemmuz, tmmz.devirgvmtemmuz, tmmz.sgkdevredentemmuz,
                tmmz.temmuzdankalansgk);
        Eylul eyl = new Eylul ();
        eyl.eylul ( ags.kummatagustos, ags.devirgvmagustos, ags.sgkdevredenagustos,
                ags.agustosdankalansgk);
        Ekim ekm =new Ekim ();
        ekm.ekim ( eyl.kummateylul, eyl.devirgvmeylul, eyl.sgkdevredeneylul,
                eyl.eyluldankalansgk );
        Kasim ksm = new Kasim ();
        ksm.kasim ( ekm.kummatekim, ekm.devirgvmekim, ekm.sgkdevredenekim,
                ekm.ekimdankalansgk );
        Aralik ara = new Aralik ();
        ara.aralik ( ksm.kummatkasim, ksm.devirgvmkasim, ksm.sgkdevredenkasim,
                ksm.kasimdankalansgk );




    }
}

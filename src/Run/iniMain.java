package Run;

import kingdom.Pisces;

/**
 *
 * @author fatiq
 */
public class iniMain {
    public static void main(String[] args) {
        Pisces pindang = new Pisces("Pindang");
        System.out.println("Nama\t\t : "+pindang.getNama());
        System.out.println("Nama Latin\t : "+pindang.getNamaLatin());
        System.out.println("Lapisan Luar\t : "+pindang.getLapisanLuar());
        System.out.println(pindang.bernafas());
        System.out.println();
        
        pindang.setAlatPernafasan("hidung");
        pindang.setLapisanLuar("kulit");
        
        System.out.println("Lapisan Luar Baru: "+pindang.getLapisanLuar());
        System.out.println("Sekarang "+pindang.bernafas());
    }
}

package kingdom;


/**
 *
 * @author fatiq
 */
public class Invertereberata extends Hewan {
    private boolean bertulangBelakang = false;

    public Invertereberata(){
        super();
    }

    public Invertereberata(String nama){
        super(nama);
    }

    public Invertereberata(String nama, String namaLatin){
        super(nama, namaLatin);
    }
    
    public boolean isBertulangBelakang() {
        return bertulangBelakang;
    }
}

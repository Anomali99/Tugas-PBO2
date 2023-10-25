package kingdom;


/**
 *
 * @author fatiq
 */
public class Vertereberata extends Hewan {
    private boolean bertulangBelakang = true;

    public Vertereberata(){
        super();
    }

    public Vertereberata(String nama){
        super(nama);
    }

    public Vertereberata(String nama, String namaLatin){
        super(nama, namaLatin);
    }
    
    public boolean isBertulangBelakang() {
        return bertulangBelakang;
    }
}

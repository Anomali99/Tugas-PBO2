package kingdom;


/**
 *
 * @author fatiq
 */
public class Aves extends Vertereberata {
    private String alatPernafasan;
    private String lapisanLuar;
    
    public Aves(){
        super();
        super.setAlatPernafasan("Paru-Paru");
        super.setLapisanLuar("Bulu");
    }

    public Aves(String nama){
        super(nama);
        super.setAlatPernafasan("Paru-Paru");
        super.setLapisanLuar("Bulu");
    }

    public Aves(String nama, String namaLatin){
        super(nama, namaLatin);
        super.setAlatPernafasan("Paru-Paru");
        super.setLapisanLuar("Bulu");
    }

    public String getAlatPernafasan() {
        if(this.alatPernafasan != null)
            return this.alatPernafasan;
        else
            return super.getAlatPernafasan();
    }

    public void setAlatPernafasan(String alatPernafasan) {
        this.alatPernafasan = alatPernafasan;
    }

    public String getLapisanLuar() {
        if(this.lapisanLuar != null)
            return this.lapisanLuar;
        else
            return super.getLapisanLuar();
    }

    public void setLapisanLuar(String lapisanLuar) {
        this.lapisanLuar = lapisanLuar;
    }
}

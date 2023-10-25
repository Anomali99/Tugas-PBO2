package kingdom;


/**
 *
 * @author fatiq
 */
public class Pisces extends Vertereberata {
    private String alatPernafasan;
    private String lapisanLuar;
    
    public Pisces(){
        super();
        super.setAlatPernafasan("Insang");
        super.setLapisanLuar("Sisik");
    }

    public Pisces(String nama){
        super(nama);
        super.setAlatPernafasan("Insang");
        super.setLapisanLuar("Sisik");
    }

    public Pisces(String nama, String namaLatin){
        super(nama, namaLatin);
        super.setAlatPernafasan("Insang");
        super.setLapisanLuar("Sisik");
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

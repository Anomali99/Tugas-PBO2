package kingdom;


/**
 *
 * @author fatiq
 */
public class Reptil extends Vertereberata {
    private String alatPernafasan;
    private String lapisanLuar;
    
    public Reptil(){
        super();
        super.setAlatPernafasan("Paruh-Paruh");
        super.setLapisanLuar("Kulit");
    }

    public Reptil(String nama){
        super(nama);
        super.setAlatPernafasan("Paruh-Paruh");
        super.setLapisanLuar("Kulit");
    }

    public Reptil(String nama, String namaLatin){
        super(nama, namaLatin);
        super.setAlatPernafasan("Paruh-Paruh");
        super.setLapisanLuar("Kulit");
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

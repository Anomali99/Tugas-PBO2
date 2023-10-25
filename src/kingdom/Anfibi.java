package kingdom;
/**
 *
 * @author fatiq
 */
public class Anfibi extends Vertereberata {
    private String alatPernafasan;
    private String lapisanLuar;
    
    public Anfibi(){
        super();
        super.setAlatPernafasan("Insang dan Paruh-Paruh");
        super.setLapisanLuar("Kulit");
    }

    public Anfibi(String nama){
        super(nama);
        super.setAlatPernafasan("Insang dan Paruh-Paruh");
        super.setLapisanLuar("Kulit");
    }

    public Anfibi(String nama, String namaLatin){
        super(nama, namaLatin);
        super.setAlatPernafasan("Insang dan Paruh-Paruh");
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

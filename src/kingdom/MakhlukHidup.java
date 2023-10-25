package kingdom;


/**
 *
 * @author fatiq
 */
public class MakhlukHidup {
    private String nama;
    private String namaLatin;
    private String ciriKhas;
    private String alatPernafasan;
    private String lapisanLuar;
    
    public MakhlukHidup(){
        this.nama = "Tidak didefinisikan";
        this.namaLatin = "Tidak didefinisikan";
    }
    
    public MakhlukHidup(String nama, String namaLatin){
        this.nama = nama;
        this.namaLatin = namaLatin;
    }
    
    public MakhlukHidup(String nama){
        this.nama = nama;
        this.namaLatin = "Tidak didefinisikan";
    }
    
    protected void setAlatPernafasan(String alat){
        this.alatPernafasan = alat;
    }
    
    public String bernafas(){
        return ("bernafas  dengan " + this.getAlatPernafasan());
    }
    
    public boolean tumbuh(){
        return true;
    }
    
    public boolean bergerak(){
        return true;
    }

    public String getNama() {
        return nama;
    }

    public String getNamaLatin() {
        return namaLatin;
    }

    public String getCiriKhas() {
        return ciriKhas;
    }
    
    public void setCiriKhas(String ciriKhas) {
        this.ciriKhas = ciriKhas;
    }

    public String getLapisanLuar() {
        return this.lapisanLuar;
    }
    
    protected void setLapisanLuar(String lapisanLuar) {
        this.lapisanLuar = lapisanLuar;
    }

    public String getAlatPernafasan() {
        return alatPernafasan;
    }
}

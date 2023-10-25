package kingdom;


/**
 *
 * @author fatiq
 */
public class Hewan extends MakhlukHidup {
    private String jenisMakanan;
    private String habitan;
    private String caraReproduksi;
    
    public Hewan(){
        super();
    }

    public Hewan(String nama){
        super(nama);
    }

    public Hewan(String nama, String namaLatin){
        super(nama, namaLatin);
    }
    
    public String makan(){
        if(jenisMakanan.equalsIgnoreCase("herbivora")){
            return "Makan Tumbuhan";
        } else if (jenisMakanan.equalsIgnoreCase("karnivora")){
            return "Makan Daging";
        } else if (jenisMakanan.equalsIgnoreCase("omnivora")){
            return "Makan Daging dan Tumbuhan";
        } else {
            return null;
        }
    }
    
    public String reproduksi(){
        if(caraReproduksi.equalsIgnoreCase("vivipar")){
            return "Beranak";
        } else if (caraReproduksi.equalsIgnoreCase("ovipar")){
            return "Beltelur";
        }else if (caraReproduksi.equalsIgnoreCase("ovovivipar")){
            return "Beltelur dan Beranak";
        } else {
            return null;
        }
    }

    public String getJenisMakanan() {
        return jenisMakanan;
    }

    public void setJenisMakanan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }

    public String getHabitan() {
        return habitan;
    }

    public void setHabitan(String habitan) {
        this.habitan = habitan;
    }

    public String getCaraReproduksi() {
        return caraReproduksi;
    }

    public void setCaraReproduksi(String caraReproduksi) {
        this.caraReproduksi = caraReproduksi;
    }
    
}

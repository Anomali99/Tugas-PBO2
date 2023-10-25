package kingdom;


/**
 *
 * @author fatiq
 */
public class Tumbuhan extends MakhlukHidup {
    private String jenisAkar;
    private String jenisDaun;
    private String caraBerkembangBiak;
    private boolean berbijiTerbuka;

    public Tumbuhan(){
        super();
    }

    public Tumbuhan(String nama){
        super(nama);
    }

    public Tumbuhan(String nama, String namaLatin){
        super(nama, namaLatin);
    }
    
    public String getJenisAkar() {
        return jenisAkar;
    }

    public void setJenisAkar(String jenisAkar) {
        this.jenisAkar = jenisAkar;
    }

    public String getJenisDaun() {
        return jenisDaun;
    }

    public void setJenisDaun(String jenisDaun) {
        this.jenisDaun = jenisDaun;
    }

    public String getCaraBerkembangBiak() {
        return caraBerkembangBiak;
    }

    public void setCaraBerkembangBiak(String caraBerkembangBiak) {
        this.caraBerkembangBiak = caraBerkembangBiak;
    }

    public boolean isBerbijiTerbuka() {
        return berbijiTerbuka;
    }


    public void setBerbijiTerbuka(boolean berbijiTerbuka) {
        this.berbijiTerbuka = berbijiTerbuka;
    }
}

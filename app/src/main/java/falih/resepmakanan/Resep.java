package falih.resepmakanan;

/**
 * Created by Falih on 10/11/2017.
 */

public class Resep {
    private String Judul, Keterangan, Instruksi;
    int Gambar;

    public Resep(String judul, int gambar, String keterangan, String instruksi) {
        this.Judul = judul;
        this.Keterangan = keterangan;
        this.Gambar = gambar;
        this.Instruksi = instruksi;
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String judul) {
        Judul = judul;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public void setKeterangan(String keterangan) {
        Keterangan = keterangan;
    }

    public String getInstruksi() {
        return Instruksi;
    }

    public void setInstruksi(String instruksi) {
        Instruksi = instruksi;
    }

    public int getGambar() {
        return Gambar;
    }

    public void setGambar(int gambar) {
        Gambar = gambar;
    }
}
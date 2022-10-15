package tugas;

/*
 * @author Nafiaaeluv
 */
public class Pegawai {
    public String nip;
    public String nama;
    public String alamat;
    public int gaji;
    
    Pegawai(){
        
    }
    
    Pegawai(String nip, String nama, String alamat){
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    
    String getNama(){
        return nama;
    }
    
    int getGaji(){
        return gaji;
    }
}
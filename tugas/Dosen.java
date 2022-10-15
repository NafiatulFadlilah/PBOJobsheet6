package tugas;

/*
 * @author Nafiaaeluv
 */
public class Dosen extends Pegawai{
    public int jumlahSKS = 0;
    public int TARIF_SKS = 200000;
    
    Dosen(String nip, String nama, String alamat){
        super();
        super.nip = nip;
        super.nama = nama;
        super.alamat = alamat;
    }
    
    void setSKS(int sks){
        this.jumlahSKS = sks;
    }
    
    @Override
    int getGaji(){
        gaji = super.getGaji() + (this.jumlahSKS * this.TARIF_SKS);
        return gaji;
    }   
}
package tugas;

/*
 * @author Nafiaaeluv
 */
public class DaftarGaji {
    public Pegawai[] listPegawai;
    
    DaftarGaji(int n){
        this.listPegawai = new Pegawai[n];
    }
    
    void addPegawai(Pegawai pegawai){
        for(int i = 0; i < listPegawai.length; i++){
            this.listPegawai[i] = pegawai;
        }
    }
    
    void printSemuaGaji(){
        System.out.println("=====||DAFTAR GAJI||=====");
        System.out.println("-------------------------");
        System.out.println("Nama Pegawai\t||\tGaji");
        System.out.println("-------------------------");
        for(int i = 0; i < 1; i++){
            System.out.println(this.listPegawai[i].getNama() + "\t||\t" + this.listPegawai[i].getGaji());
        }
    }
}
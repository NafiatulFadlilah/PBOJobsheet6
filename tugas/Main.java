package tugas;
import java.util.Scanner;
/*
 * @author Nafiaaeluv
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DaftarGaji g = new DaftarGaji(5);
        String answer;
        do{
            System.out.println("=======||PROGRAM GAJI DOSEN||=======");
            
            System.out.println("Input Data Dosen");
            System.out.println("NIP: ");
            String nip = sc.next();
            System.out.println("Nama: ");
            String nama = sc.next();
            System.out.println("Alamat: ");
            String alamat = sc.next();
            Dosen d = new Dosen(nip, nama, alamat);
            
            System.out.println("Masukkan jumlah sks: ");
            int sks = sc.nextInt();
            d.setSKS(sks);            
            g.addPegawai(d);
            g.printSemuaGaji();           
            
            System.out.println("Apakah Anda ingin menginput lagi (Y/y)?");
            answer = sc.next();
        }while(answer.equalsIgnoreCase("Y"));
    }
}
package Inheritance;
import java.util.Scanner;
public class EmployeeAction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pil ;
        
        do{
        System.out.println("            INFORMASI PEGAWAI           ");
        System.out.println("========================================");
        System.out.print("Nama Pegawai            \t:");
        String Nama = input.nextLine();
        System.out.print("ID Pegawai              \t:");
        String Id = input.nextLine();
        System.out.print("Jabatan Pegawai         \t:");
        String Jabatan = input.nextLine();
        System.out.print("Tahun Masuk Bekerja     \t:");
        int TMB = input.nextInt();input.nextLine();
        System.out.print("Status(Menikah/Single)   \t:");
        String Status = input.nextLine();
        System.out.print("Jumlah Anak             \t:");
        int JumlahAnak = input.nextInt();
        System.out.println("");
        
        if(Jabatan.equalsIgnoreCase("Pegawai Tetap")){
            PegawaiTetap A = new PegawaiTetap(Nama,Id,Jabatan,Status,TMB,JumlahAnak);
            A.Bonus();
            A.TunjanganAnak();
            A.TunjanganIstri();
            A.TotalGaji();
            A.DisplayPegawaiTetap();
        }
        else if(Jabatan.equalsIgnoreCase("Manager")){
            Manager B = new Manager(Nama,Id,Jabatan,Status,TMB,JumlahAnak);
            B.Bonus();
            B.TunjanganAnak();
            B.TunjanganIstri();
            B.TotalGaji();
            B.DisplayManager();
        }
        else if(Jabatan.equalsIgnoreCase("Pegawai Tidak Tetap")){
            PegawaiTidakTetap C = new PegawaiTidakTetap(Nama,Id,Jabatan,Status,TMB,JumlahAnak);
            C.Bonus();
            C.TunjanganAnak();
            C.TunjanganIstri();
            System.out.print("Masukan Jam Kerja       \t:");
            int jk = input.nextInt();
            System.out.println("");
            C.setJamKerja(jk);
            C.TotalGaji();
            C.DisplayPegawaiTidakTetap();
        }
        else{
            System.out.println("Jabatan Yang Anda Masukkan Tidak Terdaftar");
        }
            System.out.println("");
            System.out.print("CEK LAGI 1/0            \t:");
            pil = input.nextInt();
            input.nextLine();
            System.out.println("");
        }while(pil==1);
        System.out.println("========SELAMAT DATANG KEMBALI===========");
    }
    
}

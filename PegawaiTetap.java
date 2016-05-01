package Inheritance;
public class PegawaiTetap extends Employee {
    
public PegawaiTetap(String A, String B, String C, String D, int E, int F){
    super(A , B, C, D, E, F);
}    
public void DisplayPegawaiTetap(){
    System.out.println("        INFORMASI PEGAWAI TETAP        ");
    System.out.println("----------------------------------------");
    System.out.println("Nama            \t:"+Nama);
    System.out.println("Id Kerja        \t:"+Id);
    System.out.println("Jabatan         \t:"+Jabatan);
    System.out.println("Tahun Masuk     \t:"+Masuk);
    System.out.println("Lama Bekerja    \t:"+MasaKerja);
    System.out.println("Tunjangan Istri \t:"+TIstri);
    System.out.println("Tunjangan Anak  \t:"+TAnak);
    System.out.println("Bonus           \t:"+Bonus);
    System.out.println("Total Gaji      \t:"+TotalGaji());
}
}

package Inheritance;
public class Manager extends Employee {
protected long TunjanganJabatan;
    
public Manager (String A, String B, String C, String D, int E, int F){
    super(A , B, C, D, E, F);    
}
public long TunjanganJabatan(){
    TunjanganJabatan = (long) (0.1 * TotalGaji());
    return TunjanganJabatan;
}
@Override
public long TotalGaji(){
    return Gaji + TIstri + TAnak + Bonus + TunjanganJabatan;
}
public void DisplayManager(){
    System.out.println("        INFORMASI MANAGER        ");
    System.out.println("----------------------------------------");
    System.out.println("Nama                \t:"+Nama);
    System.out.println("Id Kerja            \t:"+Id);
    System.out.println("Jabatan             \t:"+Jabatan);
    System.out.println("Tahun Masuk         \t:"+Masuk);
    System.out.println("Lama Bekerja        \t:"+MasaKerja+ " Tahun ");
    System.out.println("Tunjangan Istri     \t:"+TIstri);
    System.out.println("Tunjangan Anak      \t:"+TAnak);
    System.out.println("Bonus               \t:"+Bonus);
    System.out.println("Tunjangan Manager   \t:"+TunjanganJabatan());
    System.out.println("Total Gaji          \t:"+TotalGaji());
}

}

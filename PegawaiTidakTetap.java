package Inheritance;
public class PegawaiTidakTetap extends Employee {
protected long GajiLembur;
public int JamKerja;
public PegawaiTidakTetap (String A, String B, String C, String D, int E, int F){
    super(A , B, C, D, E, F);    
}
public void setJamKerja(int a){
    JamKerja = a;
}
public long GajiLembur(){
    if(JamKerja >10){
        GajiLembur = 10000;
    }
    else{
        GajiLembur = 0;
    }
    return GajiLembur;
}
@Override
public long TotalGaji(){
    return Gaji + TIstri + TAnak + Bonus + GajiLembur;
}
public void DisplayPegawaiTidakTetap(){
    System.out.println("        INFORMASI PEGAWAI TIDAK TETAP        ");
    System.out.println("----------------------------------------");
    System.out.println("Nama                \t:"+Nama);
    System.out.println("Id Kerja            \t:"+Id);
    System.out.println("Jabatan             \t:"+Jabatan);
    System.out.println("Tahun Masuk         \t:"+Masuk);
    System.out.println("Lama Bekerja        \t:"+MasaKerja+ " Tahun ");
    System.out.println("Tunjangan Istri     \t:"+TIstri);
    System.out.println("Tunjangan Anak      \t:"+TAnak);
    System.out.println("Bonus               \t:"+Bonus);
    System.out.println("Gaji Lembur         \t:"+GajiLembur());
    System.out.println("Total Gaji          \t:"+TotalGaji());
}

}

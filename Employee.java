package Inheritance;
public class Employee {

protected String Nama, Id, Jabatan, Istri;
protected int Masuk, Anak,MasaKerja ;
protected long Tunjangan, TIstri, TAnak, Bonus;
protected static final long Gaji = 3000000;

public Employee(String A, String B, String C, String D, int E, int F){
    Nama = A;
    Id = B;
    Jabatan = C;
    Istri = D;
    Masuk = E;
    Anak = F;
}

public long Bonus(){
    MasaKerja = 2016 - Masuk;
    if(MasaKerja <= 5){
        Bonus = 0;
    }
    else if( MasaKerja >5 && MasaKerja<=10){
        Bonus = (long) (0.05 * Gaji * MasaKerja);
    }
    else{
        Bonus = (long) (0.1 * Gaji * MasaKerja);
    }
    return Bonus;
}

public long TunjanganIstri(){
    if (Istri.equalsIgnoreCase("Menikah")){
        TIstri = (long) (0.1 * Gaji);
    }
    else{
        TIstri = 0;
    }
    return TIstri;
}
public long TunjanganAnak(){
    if(Anak <= 3){
        TAnak = (long) (0.15 * Gaji * Anak);
    }
    else if(Anak >3){
        TAnak = (long) (0.15 * Gaji * 3);
    }
    else{
        TAnak = 0;
    }
    return TAnak;
}
public long TotalGaji(){
    return Gaji + TIstri + TAnak + Bonus;
    
}
}

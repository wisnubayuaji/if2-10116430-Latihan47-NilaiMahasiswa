/**
 * @author
 * Nim  : 10116430
 * Nama : Wisnu Bayu Aji
 * Kelas: IF-2
 */
 
public class App {
    public static void main(String[] args) throws Exception {
        
		Scanner scn = new Scanner(System.in);
        Age obj = new Age();
        
        //in
        System.out.print("Masukan Tahun Lahir Anda : ");
        int yearBirth = scn.nextInt();
        System.out.println("");
        
        //out
        System.out.println("=====Hasil Perhitungan Umur=====");
        obj.setYearBirth(yearBirth);
        System.out.println("Tahun lahir anda : "+obj.getYearBirth());
        System.out.println("Hari ini tahun : "+obj.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "+obj.hitungUmur()+
                " tahun");
        System.out.println("Tandanya kamu "+obj.tandanyaKamu(yearBirth));
    }
}

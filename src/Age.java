/**
 * @author
 * Nim  : 10116430
 * Nama : Wisnu Bayu Aji
 * Kelas: IF-2
 */
 
public class Age {
    private int yearBirth, yearNow;
    private String red;
    
    public Age() {
        
    }
    public int getYearBirth() {
        return yearBirth;
    }
    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }
    public int getYearNow() {
        yearNow = 2019;
        return yearNow;
    }
    public int hitungUmur() {
        int umur = yearNow-yearBirth;
        return umur;
    }
    public String tandanyaKamu(int umur) {
        umur = yearNow-yearBirth;
        if (umur <= 5) {
            this.red = "\033[31mLAGI LUCU-LUCU NYA";
        } else if (umur <= 10) {
            this.red = "\033[31mMASIH ANAK-ANAK";
        } else if (umur <= 13) {
            this.red = "\033[31mMASIH REMADJA";
        } else if (umur <= 19) {
            this.red = "\033[31mALAY";
        } else if (umur <= 29) {
            this.red = "\033[31mLAGI GALAU NYARI JODOH";
        } else if (umur <= 35) {
            this.red = "\033[31mLAGI SIBUK NYARI UANG";
        } else if (umur <= 150) {
            this.red = "\033[31mSUDAH TUA";
        } else {
            this.red = "\033[31mTIDAK TERDETEKSI DI KEHIDUPAN";
        }
        return red;
    }
    
}

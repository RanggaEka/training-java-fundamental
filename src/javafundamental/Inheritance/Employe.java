package javafundamental.Inheritance;

/** Class employee pasti punya nama dan tanggal lahir, sedangkan yg membedakan
 * yaitu adanya kode (NIP/Nomor Induk Pegawai)
 */
public class Employe extends Person {
	private String kode; // ini nip nomor induk pegawai

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
	

}

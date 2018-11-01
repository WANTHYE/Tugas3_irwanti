
public class Mahasiswa {
	private String Nama, Nim, Kelas, Alamat;
	
	public void mahasiswa (String Nama, String Nim, String Kelas, String Alamat) {
		this.Nama = Nama;
		this.Nim = Nim;
		this.Kelas = Kelas;
		this.Alamat = Alamat;
		
	}
	
	public String getNama(){
		return Nama;
	}
	public String getNim(){
		return Nim;
	}
	public String getKelas(){
		return Kelas;
	}
	public String getAlamat(){
		return Alamat;
	
		
	}
}

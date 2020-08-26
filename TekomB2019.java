class mahasiswa {
	String nama,asal;
	
	void isiData(String nama, String asal){
		this.nama = nama;
		this.asal = asal;
	}
}
public class TekomB2019{
	public static void main(String[] args){
		mahasiswa TekomB = new mahasiswa();
		
		TekomB.isiData("Muh.Arsandi", "Luwu");
		
		System.out.println("Nama Mahasiswa : " + TekomB.nama);
		System.out.println("Asal Mahasiswa : " + TekomB.asal);
	}
}
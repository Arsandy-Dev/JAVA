class mobil2 {
	String warna;
	int tahunProduksi;
	
	void isiData(String warna, int tahunProduksi){
		this.warna = warna;
		this.tahunProduksi = tahunProduksi;
	}
}
public class KelasMobil3 {
	public static void main(String[] args){
		mobil2 mobilku = new mobil2();
		
		mobilku.isiData("Biru", 2018);
		
		System.out.println("Warna : " + mobilku.warna);
		System.out.println("Tahun : " + mobilku.tahunProduksi);
	}
}


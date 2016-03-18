package aplikasi_sharing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Foto extends Media {


	public Foto(String nama, int ukuran, String jenis){
		super(nama,ukuran,jenis);
	}
	
	
	public void setNama(String nama){
		super.setNama(nama);
	}
	
	public String getNama(){
		return super.getNama();
	}
	
	public void setUkuran(int ukuran){
		super.setUkuran(ukuran);
	}
	
	public int getUkuran(){
		return super.getUkuran();
	}
	
	public void setJenis(String jenis){
		super.setJenis(jenis);
	}
	
	public String getJenis(){
		return super.getJenis();
	}
}

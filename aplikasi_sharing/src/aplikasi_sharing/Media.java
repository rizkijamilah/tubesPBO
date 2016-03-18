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
public abstract class Media {
	private String nama;
	private int ukuran;
        private String path;
	private Foto[] foto;
	private Video[] video;
	
	public Media (String nama, int ukuran, String jenis) {
			this.nama = nama;
			this.ukuran = ukuran;
			this.jenis = jenis;
			foto = new Foto[5];
			video = new Video[5];
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public String getNama () {
		return this.nama;
	}
	
	public void setUkuran (int ukuran) {
		this.ukuran = ukuran;
	}
	
	public int getUkuran () {
		return this.ukuran;
	}
	
	public void setJenis (String jenis) {
		this.jenis = jenis;
	}
	
	public String getJenis () {
		return this.jenis;
	}
}

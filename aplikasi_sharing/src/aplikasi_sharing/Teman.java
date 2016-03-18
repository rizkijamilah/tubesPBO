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
public class Teman {
	private String nama;
	private String status;
	
	public Teman (String nama) {
		this.nama = nama;
	}
	
	public Teman (String nama, String status) {
		this.nama = nama;
		this.status = status;
	}
	
	public String getNama() {
		return this.nama;
	}
	
	public String getStatus() {
		return this.status;
	}
}

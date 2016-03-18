package aplikasi_sharing;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kita
 */
public class Akun {
	private String nama;
	private int nTeman = 0;
	private int maxTeman;
	private String password;
	private Akun[] friend;
        private ArrayList<Akun> friends = new ArrayList();
	private Media[] media;
        private ArrayList<Media> friends = new ArrayList();
	
	public Akun(String nama, String password){
		this.nama = nama;
		this.password = password;
	}
	
	public void setNama(String nama){
		this.nama = nama;
	}
	
	public String getNama(){
		return this.nama;
	}
	
	public void addFriend(Akun p){ 
		if (friends.size() < maxTeman) {
                    friends.add(p);
		System.out.println("Teman Penuh");
		}
		
	}
	
	public void removeTeman(int i) {
            if (i < friends.size() || i > maxTeman) System.out.println("Indeks tidak sesuai");
            else friends.remove(i);
}

public void createFoto(String path, int ukuran) {
    Media m = new Foto(path, size, "Foto");
    media.add(m);
}
	
}
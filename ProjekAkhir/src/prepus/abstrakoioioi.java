/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepus;

/**
 *
 * @author HP
 */
public abstract class abstrakoioioi{
    protected String judulbuku;
    protected String pengarang;
    protected int jumhal;
    protected String penerbit;
    protected int tabit;
    protected int stok;
    protected String lokasibuku;
    
    protected String m_nik;
    protected String namamember;
    protected String alamatmember;
    protected String jenis_kelamin;
    protected String no_tilpun_member;
    
    protected String username;
    protected String pawot;
    protected String nama;
    protected String u_nik;
    protected String u_alamat;
    protected String u_no_tilpun;
    
    protected String stgl_selang;
    protected String stgl_kembali;
    
    protected String mtgl_selang;
    protected String mtgl_kembali;
    
    protected abstract void setJudulBuku(String judulbuku);
    protected abstract void setPengarang(String pengarang);
    protected abstract void setJumhal(int jumhal);
    protected abstract void setPenerbit(String penerbit);
    protected abstract void setTabit(int tabit);
    protected abstract void setStok(int stok);
    protected abstract void setLokasiBuku(String lokasibuku);
    
    protected abstract void setMNIK(String m_nik);
    protected abstract void setNamaMember(String namamember);
    protected abstract void setAlamatMember(String alamatmember);
    protected abstract void setJenis_kelamin(String jenis_kelamin);
    protected abstract void setTilpunMember(String no_tilpun_member);
    
    protected abstract void setUsername(String username);
    protected abstract void setPawot(String pawot);
    protected abstract void setNama(String nama);
    protected abstract void setUNIK(String u_nik);
    protected abstract void setUAlamat(String u_alamat);
    protected abstract void setUTilpun(String u_no_tilpun);
    
    protected abstract void setStgl_selang(String stgl_selang);
    protected abstract void setStgl_kembali(String stgl_kembali);
    
    protected abstract void setMtgl_selang(String mtgl_selang);
    protected abstract void setMtgl_kembali(String mtgl_kembali);
    
    protected abstract String getJudulBuku();
    protected abstract String getPengarang();
    protected abstract int getJumhal();
    protected abstract String getPenerbit();
    protected abstract int getTabit();
    protected abstract int getStok();
    protected abstract String getLokasiBuku();
    
    protected abstract String getMNIK();
    protected abstract String getNamaMember();
    protected abstract String getAlamatMember();
    protected abstract String getJenis_kelamin();
    protected abstract String getTilpunMember();
    
    protected abstract String getUsername();
    protected abstract String getPawot();
    protected abstract String getNama();
    protected abstract String getUNIK();
    protected abstract String getUAlamat();
    protected abstract String getUTilpun();
    
    protected abstract String getStgl_selang();
    protected abstract String getStgl_kembali();
    
    protected abstract String getMtgl_selang();
    protected abstract String getMtgl_kembali();
}

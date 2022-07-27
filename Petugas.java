
package lelang;
import java.util.ArrayList;
public class Petugas implements UserInterface {
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    
    public Petugas(){
        this.namaPetugas.add("pain\t");
        this.alamat.add("Jember");
        this.telepon.add("8757574362");
    }
    
    public int getJmlPetugas(){
        return this.namaPetugas.size();
    }
    
    @Override
    public void setNama(String namaPetugas){
        this.namaPetugas.add(namaPetugas);
    }
    @Override
    public void setAlamat(String alamat){
        this.alamat.add(alamat);
    }
    @Override
    public void setTelepon(String telepon){
        this.telepon.add(telepon);
    }
    
    @Override
    public String getNama(int id){
        return this.namaPetugas.get(id);
    }
    @Override
    public String getAlamat(int id){
        return this.alamat.get(id);
    }
    @Override
    public String getTelepon(int id){
        return this.telepon.get(id);
    }
}

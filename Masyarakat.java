
package lelang;
import java.util.ArrayList;

public class Masyarakat implements UserInterface {
    
    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    
    public Masyarakat(){
        
        this.namaMasyarakat.add("tchala");
        this.alamat.add("wakanda");
        this.telepon.add("13578");
        
        
        this.namaMasyarakat.add("billi elish");
        this.alamat.add("Nganjuk");
        this.telepon.add("13254");
        
    }
    
    public int getJmlMasyarakat(){
        return  this.namaMasyarakat.size();
    }
    
    @Override
    public void setNama(String namaMasyarakat){
        this.namaMasyarakat.add(namaMasyarakat);
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
        return this.namaMasyarakat.get(id);
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

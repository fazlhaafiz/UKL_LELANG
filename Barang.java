
package lelang;
import java.util.ArrayList;
import java.util.Scanner;
public class Barang {
    Scanner input = new Scanner(System.in);

    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> hargaAwal = new ArrayList<Integer>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
//inher=gunanya utk mewariskan sifat dri supercls ke subcls(mewariskan pake implemants dipakai interface(polimor),extends)
    public Barang() {
        System.out.print("Masukkan Barang yang mau dilelang  : ");
        this.namaBarang.add(input.next());
        System.out.print("Masukkan harga awal barang         : Rp.");
        this.hargaAwal.add(input.nextInt());
        System.out.print("Apakah barang bisa ditawar?(yes/no): ");
        String answer = input.next();
        if ("yes".equals(answer)) {
            this.status.add(true);
            System.out.println("Barang dapat ditawar");
        } else {
            System.out.println("Barang tidak boleh ditawar");
            this.status.add(false);
        }
    }
//encap=suatu yg berfungsi untuk melindungi suatu data yg ada dalam suatu kls(pub,priv,protectd,defoult)
    
    public int getJmlBarang() {
        return this.namaBarang.size();
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang.add(namaBarang);
    }

    public void setHargaAwal(int hargaAwal) {
        this.hargaAwal.add(hargaAwal);
    }

    public void setStatus(boolean status) {
        this.status.add(status);
    }

    public String getNamaBarang(int idBarang) {
        return this.namaBarang.get(idBarang);
    }

    public int getHargaAwal(int idBarang) {
        return this.hargaAwal.get(idBarang);
    }

    public boolean getStatus(int idBarang) {
        return this.status.get(idBarang);
    }

    
    public void editStatus(int idBarang, boolean status) {
        this.status.add(idBarang, status);
    }
    
    
}

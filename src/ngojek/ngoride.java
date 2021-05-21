
package ngojek;

/**
 * ride
 */
interface ride {
    public void tampilngoride();
    
}

public class ngoride implements ride{
    String lokasi;
    String tujuan;
    int biaya;
    int total,jarak;
    int ongkir=2000;
   public ngoride (String lokasi1,String tujuan1,int biaya1,int jarak1){
       this.lokasi = lokasi1;
       this.tujuan = tujuan1;
       this.biaya = biaya1;
       this.jarak =jarak1;
       total = (biaya*jarak)+ongkir;
    }
    public void tampilngoride(){
       System.out.println("Lokasi anda    :"+lokasi);
       System.out.println("Lokasi tujuan  :"+tujuan);
       System.out.println("Biaya order    :"+total);
   }
}
   

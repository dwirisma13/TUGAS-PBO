
package ngojek;

abstract class food{
  public abstract void tampilngofood();
}

public class ngofood extends food{

    String nama;
    int harga,total;
    int ongkir = 2000;
    
    ngofood(String nama1,int harga1){
      this.nama =nama1;
      this.harga=harga1;
      total=harga+ongkir;
    }

    public void tampilngofood(){
        System.out.println("Anda memilih "+nama);
        System.out.println("Total order  : "+total);
    }
}
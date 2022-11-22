/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
/**
 *
 * @author usert
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fasilitas perintah = new fasilitas();
List<Barang> list = perintah.selectAll();
for(Barang barang : list){
System.out.println(barang.getKode_barang());
System.out.println(barang.getNama_barang());
System.out.println(barang.getJumlah());
System.out.println(barang.getHarga());
System.out.println("-------------------------");
}
}
}
    
    
    


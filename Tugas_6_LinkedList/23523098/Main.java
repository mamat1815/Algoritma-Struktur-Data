package Tugas_6_LinkedList;

public class Main {
    public static void main(String[] args) {
        
        LinkedList<Mahasiswa> mhs = new LinkedList<>();
        
        mhs.add(new Mahasiswa("16523001","Idris",3.88));
        mhs.add(new Mahasiswa("16523002","Agus",3.18));
        mhs.add(new Mahasiswa("16523003","Dani",3.42));
        mhs.add(new Mahasiswa("16523008","Roni",3.67));
        mhs.add(new Mahasiswa("16523020","Sinta",3.05));
        
        LinkedList.Element ptr = mhs.first;
        
        while(ptr != null) {
            Mahasiswa m = (Mahasiswa) ptr.data;
            System.out.println("NIM: "+m.getNIM());
            System.out.println("Nama: "+m.getNama());
            System.out.println("IPK: "+m.getIPK());
            System.out.println("");
            ptr = ptr.next;    
        }
        
        /*
        Ganti kode ini untuk mengganti IPK mahasiswa di indeks ke-3
        Kemudian tampilkan data mahasiswa yang ada di indeks ke-3
        */

        Mahasiswa x = (Mahasiswa) mhs.get(3);
        x.setIPK(3.5);
        x.setNIM("23523098");
        x.setNama("Afsar");

        System.out.println("List Setelah dirubah");
        
        LinkedList.Element pt = mhs.first;
        
        while(pt != null) {
            Mahasiswa m = (Mahasiswa) pt.data;
            System.out.println("NIM: "+m.getNIM());
            System.out.println("Nama: "+m.getNama());
            System.out.println("IPK: "+m.getIPK());
            System.out.println("");
            pt = pt.next;    
        }

    }
}





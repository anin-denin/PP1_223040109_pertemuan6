package Latihan7;


import Latihan6.Node;

public class Tugas{
    public static void main(String[] args) {
        // 1. Create list dengan keyword new
        StrukturList myList = new StrukturList();

        // 2. Tambah elemen sehingga elemen list berisi (4, 3, 7, 8, 1, 9)
        myList.addTail(new Node(4));
        myList.addTail(new Node(3));
        myList.addTail(new Node(7));
        myList.addTail(new Node(8));
        myList.addTail(new Node(1));
        myList.addTail(new Node(9));

        // 3. Tampilkan elemen list
        System.out.print("Elemen list sebelum dihapus: ");
        myList.displayElement();

        // 4. Hapus semua elemen list
        myList.removeAll();

        // 5. Tampilkan elemen list setelah dihapus
        System.out.print("Elemen list setelah dihapus: ");
        myList.displayElement();
    }
}

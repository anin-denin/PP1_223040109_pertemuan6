package Latihan7;

import Latihan6.Node;

public class StrukturListTest {
    public static void main(String[] args) {
        // 1. Create list dengan keyword new
        StrukturList myList = new StrukturList();

        // 2. Tambah elemen 5 di akhir list
        myList.addTail(new Node(5));

        // 3. Tambah elemen 4 di akhir list
        myList.addTail(new Node(4));

        // 4. Tambah elemen 6 di akhir list
        myList.addTail(new Node(6));

        // 5. Tampilkan elemen list
        System.out.print("Elemen list: ");
        myList.displayElement();

        // 6. Cari elemen bernilai 6
        int elemenCari = 6;
        System.out.println("Hasil pencarian elemen " + elemenCari + ": " + myList.find(elemenCari));
    }
}



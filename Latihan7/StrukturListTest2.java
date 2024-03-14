package Latihan7;

import Latihan6.Node;

public class StrukturListTest2 {
    public static void main(String[] args) {
        // 1. Create list dengan keyword new
        StrukturList myList = new StrukturList();

        // 2. Tambah elemen sehingga elemen list berisi (7, 6, 4, 2, 3)
        myList.addTail(new Node(7));
        myList.addTail(new Node(6));
        myList.addTail(new Node(4));
        myList.addTail(new Node(2));
        myList.addTail(new Node(3));

        // 3. Tampilkan elemen list
        System.out.print("Elemen list: ");
        myList.displayElement();

        // 4. Tampilkan size elemen list
        System.out.println("Ukuran list: " + myList.size());
    }
}

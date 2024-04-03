import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Membuat objek ArrayList untuk menyimpan String
        ArrayList<String> list = new ArrayList<>();

        // Menambahkan elemen ke ArrayList
        list.add("Mangga");
        list.add("Apel");
        list.add("Jeruk");

        // Menampilkan isi ArrayList
        System.out.println("Isi ArrayList:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}

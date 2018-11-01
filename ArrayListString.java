import java.util.ArrayList;
public class ArrayListString {


	public static void main(String[] args) {
	ArrayList<String> arrayList1 = new 	ArrayList<String>();
		arrayList1.add("A");
		arrayList1.add("C");
		arrayList1.add("D");
		arrayList1.add("F");
		arrayList1.add("G");
				
	//sisipkan diantara data
		arrayList1.add(3, "E");
		arrayList1.add(1, "B");
				
	//hapus data //masukkan data yg mau dihapus
		arrayList1.remove(1); //hapus sesuai urutan kolom (index)
		arrayList1.remove("C"); //hapus sesuai nama variabel
				
	//ganti (Set) huruf lain
		arrayList1.set(0, "Z");
				
		System.out.println(arrayList1.toString());
		arrayList1.remove(0);
		System.out.println(arrayList1.toString());
			}

		}



import java.util.ArrayList;


public class StackString {
	ArrayList<String> k = new ArrayList<String>();
	int irwanti = -1;
	
	public void push(String value){
		irwanti++;
		k.add(irwanti,value);
	}
	public String pop(){
		String value = "KOSONG";
		if (irwanti>-1){
		value = k.get(irwanti);
		k.remove(irwanti);
		irwanti--;}
		return value;
		}
	
	public void cetak (){
		System.out.println("afri : " +irwanti+ " # namanya : "+k.toString());
	}
}

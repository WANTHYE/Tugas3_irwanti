import java.util.ArrayList;


public class StackFloat {
	ArrayList<Float> kotak =new ArrayList<Float>();
	public int irwanti = -1;
	
	public void push(float value){
		irwanti++;
		kotak.add(irwanti,value);
	}
	public float pop(){
		float value = irwanti;
		if (irwanti>-1){
			value = kotak.get(irwanti);
			kotak.remove(irwanti);
			irwanti--;
		}
		return value;}
		public void cetak(){
	System.out.println(kotak.toString());
		}
}

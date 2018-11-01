import java.util.ArrayList;


public class QueueDouble {

ArrayList<Double> aku = new ArrayList<Double>();
	int irwanti = -1;

	public void insert(Double value) {
		irwanti++;
		aku.add(irwanti,value);
	}
	public Double get() {
		Double value = (double) 0.1f;
		if(irwanti>-1) {
			value = aku.get(0);
			aku.remove(0);
			irwanti--;
		}
		return value;
		
	}
	public void cetak1() {
		System.out.println("Step : "+irwanti+" > VARIABLE: "+aku.toString());
		
	}
	public void cetak() {
		// TODO Auto-generated method stub
		
	}
}

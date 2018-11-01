import java.util.ArrayList;


public class QueueFloat {
ArrayList<Float> irwanti = new ArrayList<Float>();
	int irwantibanget = -1;

	public void insert(Float value) {
		irwantibanget++;
		irwanti.add(irwantibanget,value);
	}
	public Float get() {
		Float value = 0.6f;
		if(irwantibanget>-1) {
			value = irwanti.get(0);
			irwanti.remove(0);
			irwantibanget--;
		}
		return value;
		
	}
	public void cetak1() {
		System.out.println("Step : "+irwantibanget+" > VARIABLE: "+irwanti.toString());
	}
	public void cetak() {
		// TODO Auto-generated method stub
		
	}
}

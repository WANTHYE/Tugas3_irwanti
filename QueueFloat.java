import java.util.ArrayList;


public class QueueFloat {
ArrayList<Float> sudarminkuh = new ArrayList<Float>();
	int sudarminbanget = -1;

	public void insert(Float value) {
		sudarminbanget++;
		sudarminkuh.add(sudarminbanget,value);
	}
	public Float get() {
		Float value = 0.6f;
		if(sudarminbanget>-1) {
			value = sudarminkuh.get(0);
			sudarminkuh.remove(0);
			sudarminbanget--;
		}
		return value;
		
	}
	public void cetak1() {
		System.out.println("Step : "+sudarminbanget+" > VARIABLE: "+sudarminkuh.toString());
	}
	public void cetak() {
		// TODO Auto-generated method stub
		
	}
}

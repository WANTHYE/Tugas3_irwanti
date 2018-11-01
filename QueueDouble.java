import java.util.ArrayList;


public class QueueDouble {

ArrayList<Double> aku = new ArrayList<Double>();
	int sudarminkuh = -1;

	public void insert(Double value) {
		sudarminkuh++;
		aku.add(sudarminkuh,value);
	}
	public Double get() {
		Double value = (double) 0.1f;
		if(sudarminkuh>-1) {
			value = aku.get(0);
			aku.remove(0);
			sudarminkuh--;
		}
		return value;
		
	}
	public void cetak1() {
		System.out.println("Step : "+sudarminkuh+" > VARIABLE: "+aku.toString());
		
	}
	public void cetak() {
		// TODO Auto-generated method stub
		
	}
}

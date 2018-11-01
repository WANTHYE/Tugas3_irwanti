
import java.util.ArrayList;


public class StackDouble {
	ArrayList<Double> u =new ArrayList<Double>();
	public int irwanti = -1;
	
		public void push(Double value){
			irwanti++;
			u.add(irwanti,value);
		}
		
			public double pop() {
				double value=irwanti;
			if (irwanti>-1){				
				value = u.get(irwanti);
				u.remove(irwanti);
				irwanti--;
			}
			return value;
			}
			public void cetak(){
				System.out.println(u.toString());

}
}

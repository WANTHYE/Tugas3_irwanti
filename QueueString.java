
import java.util.ArrayList;

	public class QueueString {
		ArrayList<String> wakanda = new ArrayList<String>();
		int irwanti = -1;

		public void insert(String value) {
			irwanti++;
			wakanda.add(irwanti,value);
		}
		public String get() {
			String value = "KOSONG";
			if(irwanti>-1) {
				value = wakanda.get(0);
				wakanda.remove(0);
				irwanti--;
			}
			return value;
			
		}
		public void cetak() {
			System.out.println("STEP : "+irwanti+" > KELAS: "+wakanda.toString());
		}
	}

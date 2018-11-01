
public class MainStackDouble {


	public static void main(String[] args) {
		StackDouble irwanti =new StackDouble();
		irwanti.push(6.4);
		irwanti.cetak();
		irwanti.push(6.4);
		
		irwanti.cetak();
		
		double d0=irwanti.pop();
		System.out.println(d0);
		double d1=irwanti.pop();
		System.out.println(d1);
		irwanti.cetak();
		double d2=irwanti.pop();
		System.out.println("tadaaaaaa");
	}

	}


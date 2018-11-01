
public class MainStackFloat {

	public static void main(String[] args) {
		StackFloat bukangkalengkaleng =new StackFloat();
		bukangkalengkaleng.push(1.6f);
		bukangkalengkaleng.push(2.6f);
		bukangkalengkaleng.push(4.7f);
		bukangkalengkaleng.cetak();
		float d0=bukangkalengkaleng.pop();
		System.out.println(d0);
		bukangkalengkaleng.cetak();

	}

}

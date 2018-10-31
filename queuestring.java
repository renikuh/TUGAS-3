package ASD3;


	import java.util.ArrayList;

	public class queuestring {
		ArrayList<String> kelase = new ArrayList<String>();
		int reni = -1;

		public void insert(String value) {
			reni++;
			kelase.add(reni,value);
		}
		public String get() {
			String value = "KOSONG";
			if(reni>-1) {
				value = kelase.get(0);
				kelase.remove(0);
				reni--;
			}
			return value;
			
		}
		public void cetak() {
			System.out.println("ECOR : "+reni+" > KELAS A: "+kelase.toString());
		}
	}

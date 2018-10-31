package ASD3;


	import java.util.ArrayList;

	public class queuefloat {
		ArrayList<Float> kelase = new ArrayList<Float>();
		int reni= -1;

		public void insert(Float value) {
			reni++;
			kelase.add(reni,value);
		}
		public Float get() {
			Float value = 0.1f;
			if(reni>-1) {
				value = kelase.get(0);
				kelase.remove(0);
				reni--;
			}
			return value;
			
		}
		public void cetak() {
			System.out.println("ECOR : "+reni+" > VARIABLE: "+kelase.toString());
		}
	}

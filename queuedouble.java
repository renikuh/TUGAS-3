package ASD3;


	import java.util.ArrayList;

	public class queuedouble {
		ArrayList<Double> kelasa= new ArrayList<Double>();
		int reni = -1;

		public void insert(Double value) {
			reni++;
			kelasa.add(reni,value);
		}
		public Double get() {
			Double value = 0.1;
			if(reni>-1) {
				value = kelasa.get(0);
				kelasa.remove(0);
				reni--;
			}
			return value;
			
		}
		public void cetak() {
			System.out.println("ECOR : "+reni+" > VARIABLE: "+kelasa.toString());
		}
	}


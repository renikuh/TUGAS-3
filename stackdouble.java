
	import java.util.ArrayList;
	public class stackdouble {
		ArrayList<Double> kotak =new ArrayList<Double>();
		public int reni= -1;
		
			public void push(Double value){
				reni++;
				kotak.add(reni,value);
			}
			
				public double pop() {
					double value=reni;
				if (reni>-1){				
					value = kotak.get(reni);
					kotak.remove(reni);
					reni--;
				}
				return value;
				}
				public void cetak(){
					System.out.println(kotak.toString());
				}
	}

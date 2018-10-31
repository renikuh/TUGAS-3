
import java.util.ArrayList;
public class StackString {
		ArrayList<String>kotak = new ArrayList<String>();
		int reni = -1;
		
		public void push(String value){
			reni++;
			kotak.add(reni,value);
		}
		public String pop(){
			String value = "KOSONG";
			if (reni>-1){
			value = kotak.get(reni);
			kotak.remove(reni);
			reni--;}
			return value;
			}
		
		public void cetak (){
			System.out.println("reni : " +reni+ " # namanya : "+kotak.toString());
		}
	}

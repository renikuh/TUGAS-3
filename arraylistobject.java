
import java.util.ArrayList;
public class ArrayListObject {

		ArrayList<Mahasiswa> biodata;
			
		public ArrayListObject(){
			biodata = new ArrayList<Mahasiswa>();
		}
		public void IsiData(String nama, String nim, char kelas, String alamat){
			biodata.add(new Mahasiswa(nama,nim,kelas,alamat));
		}
		
		public static void main(String[] args) {
			ArrayList Data = new ArrayList();
			
			Data.add("Reni Ramli");
			Data.add("D0217008");
			Data.add("A");
			Data.add("Alamat");
			
			System.out.println(Data);
		}
			
	}


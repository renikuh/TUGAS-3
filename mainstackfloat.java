
public class mainstackfloat {
	public static void main(String[] args) {
		stackfloat kotak =new stackfloat();
		kotak.push(1.2f);
		kotak.push(2.3f);
		kotak.push(3.4f);
		kotak.cetak();
		float d0=kotak.pop();
		System.out.println(d0);
		kotak.cetak();

	}

}

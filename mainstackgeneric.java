package ASD3;
public class mainstackgeneric {
		public static void main(String[] args) {
			mainstackgeneric<Integer> st = new mainstackgeneric();
	        st.push(2);
	        st.push(1);
	        st.push(2);
	        st.cetak();
	        System.out.println("Size: " + st.size());
	        System.out.println(st.pop());
	    }
	}

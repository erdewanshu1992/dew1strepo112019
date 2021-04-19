package Simple_Java;

public class ReverseTest {

	public static void main(String[] args) {

		String str = "Interview";
        // conversion from String object to StringBuffer
        StringBuffer sbr = new StringBuffer(str);
        // To reverse the string
        sbr.reverse();
        System.out.println(sbr);
	}

}

package Simple_Java;

public class Break_Continue {

	public static void main(String[] args) {

		//This example jumps out of the loop when i is equal to 4:
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    break;
			  }
			  System.out.println(i);
			}
		
		System.out.println("This example skips the value of 4");
		//This example skips the value of 4:
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    continue;
			  }
			  System.out.println(i);
			}
		
		System.out.println("Break Example");
		int i = 0;
		while (i < 10) {
		  System.out.println(i);
		  i++;
		  if (i == 4) {
		    break;
		  }
	  }

    }
  }

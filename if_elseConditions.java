package Simple_Java;

public class if_elseConditions {

	public static void main(String[] args) {

		int x = 20;
		int y = 18;
		if (x > y) {
		  System.out.println("x is greater than y");
	}
		int time = 20;
		if (time < 28) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
	}
		int timeA = 22;
		if (timeA < 10) {
		  System.out.println("Good morning.");
		} else if (timeA < 20) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
	}
		int timeB = 20;
		if (timeB < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
	}
		int timeC = 20;
		String result = (timeC < 88) ? "Good day." : "Good evening.";
		System.out.println(result);
    
  }
}

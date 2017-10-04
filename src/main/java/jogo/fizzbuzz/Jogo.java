package jogo.fizzbuzz;

public class Jogo {

	public String fizzBuzz(int i) {
		String resto = "";
		if (i == 0) {
			resto = "0";
		}else if (i % 3 == 0 && i % 5 == 0) {
				resto = "fizz buzz";
		} else if (i % 3 == 0) {
				resto = "fizz";
		} else if (i % 5 == 0) {
				resto = "buzz";
		}
		 else 	resto = "" + i;
		return resto;

	}

}

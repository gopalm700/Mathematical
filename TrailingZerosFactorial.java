package com.gopal;

public class TrailingZerosFactorial {

	/**
	 * This method calculates the number of trailing zeros of the factorial of
	 * the given no.
	 * 
	 * Our logic is to summing of the integers in the factorial series 
	 * which is divisible by 5.
	 * Test ai
	 * 5! = 5 X 4 X 3 X 2 X 1
	 * 
	 * 
	 * @param n
	 * @return the number of zero's in the end.
	 */
	public int getLSZ(final int n) {

            		if (n < 5) {

			return 0;
		}
		int j = n;

		while ((j % 5) != 0) {
			--j;
		}
		int result = j / 5;
		int exp = 5 * 5;
		while (exp < j) {
			result += (j / exp);
			exp *= 5;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(new TrailingZerosFactorial().getLSZ(15));
	}
}

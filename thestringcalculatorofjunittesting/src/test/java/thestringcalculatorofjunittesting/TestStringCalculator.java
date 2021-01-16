package thestringcalculatorofjunittesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestStringCalculator{
	@Test
	public void
	return_0_when_input_is_empty() {
		assertEquals("0", given(""));
	}
	@Test
	public void
	return_3_when_input_is_1_2() {
		assertEquals("3", given("1,2"));
	}

	private String given(String number) {
		StringCalculator stringCalculator = new StringCalculator();
		return stringCalculator.sum(number);
	}

}

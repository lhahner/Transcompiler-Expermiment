package com.env.transexp;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Sorting_Tests {
	Sorting sort;
	@BeforeEach
	void init() {
		sort = new Sorting();
	}
	@Test
	@DisplayName("Swapping functionallity")
	void swap_aShouldBeAtb_321() {
		int[] input_arr = {1, 2, 3};
		int[] output_arr = {3, 2, 1};
		assertArrayEquals(output_arr, sort.swap(input_arr, 0, 2), "Should be 3,2,1");
	}
	@Test
	@DisplayName("One Number Test")
	void swap_nothingShouldChange_1() {
		int[] input_arr = {1};
		int[] ouput_arr = {1};
		assertArrayEquals(ouput_arr, sort.swap(input_arr, 0, 0), "should be 1");
	}
	@Test
	@DisplayName("NullPointerException")
	void swap_testForException_NullException() {
		int[] input_arr = {};
		try {
			sort.swap(input_arr, 0, 1);
			fail("Should have thrown an exception");
		}
		catch(RuntimeException e) {
			assertTrue(true);
		}
	}
	
	@Test
	@DisplayName("NotAllowedException")
	void length_testNotAllowedException() {
		assertThrows(NotAllowedException.class, () -> {
			 int[] arr = {1, 0, 1, 1, 1, 0, 0, 1};
			sort.length(arr);
		});
	}
}


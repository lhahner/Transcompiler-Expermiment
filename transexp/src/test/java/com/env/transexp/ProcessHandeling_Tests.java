package com.env.transexp;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ProcessHandeling_Tests {
	
	ProcessHandeling ph;
	@BeforeEach
	void init() {
		ph = new ProcessHandeling();
	}
	
	@Test
	@DisplayName("Pid should be the same as expected from pb.info")
	void isPid_isPidSayItsPid_True() {
		assertTrue(ph.isPid("6176"), "Should be Pid if number is correct");
	}
	void getPid_returnsNumberOfPid_sixDigitNumber() {
		assertEquals("echo", ph.getProcess());
	}
}

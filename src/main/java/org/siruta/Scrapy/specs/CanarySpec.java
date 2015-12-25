package org.siruta.Scrapy.specs;

import org.testng.annotations.Test;

public class CanarySpec {

	@Test
	public void execute() {
		assert "Ok".equalsIgnoreCase("ok");
	}
}

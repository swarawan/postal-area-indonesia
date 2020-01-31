package id.swarawan.postalarea.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProvinceDataTest {

	@Test
	public void testProvinceData() {
		Long id = 1L;
		String name = "Yogyakarta";

		ProvinceData data = new ProvinceData();
		data.setId(id);
		data.setName(name);

		Assertions.assertEquals(id, data.getId());
		Assertions.assertEquals(name, data.getName());
	}
}
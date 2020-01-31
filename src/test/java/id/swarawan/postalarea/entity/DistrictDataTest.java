package id.swarawan.postalarea.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class DistrictDataTest {

	@Test
	public void testDistrictData() {
		Long id = 1L;
		Long cityId = 2L;
		String name = "Yogyakarta";

		DistrictData data = new DistrictData();
		data.setId(id);
		data.setCityId(cityId);
		data.setName(name);

		Assertions.assertEquals(id, data.getId());
		Assertions.assertEquals(cityId, data.getCityId());
		Assertions.assertEquals(name, data.getName());
	}
}
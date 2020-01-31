package id.swarawan.postalarea.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class CityDataTest {

	@Test
	public void testCityData() {
		Long id = 1L;
		Long provinceId = 2L;
		String name = "Yogyakarta";
		String type = "Kab";

		CityData data = new CityData();
		data.setId(id);
		data.setProvinceId(provinceId);
		data.setName(name);
		data.setType(type);

		Assertions.assertEquals(id, data.getId());
		Assertions.assertEquals(provinceId, data.getProvinceId());
		Assertions.assertEquals(name, data.getName());
		Assertions.assertEquals(type, data.getType());
	}
}
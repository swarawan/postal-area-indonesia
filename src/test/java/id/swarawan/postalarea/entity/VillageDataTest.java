package id.swarawan.postalarea.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VillageDataTest {

	@Test
	public void testVillageData() {
		Long id = 1L;
		Long districtId = 2L;
		String name = "name";
		String type = "type";
		String postalCode = "postalcode";

		VillageData data = new VillageData();
		data.setId(id);
		data.setDistrictId(districtId);
		data.setName(name);
		data.setType(type);
		data.setPostalCode(postalCode);

		Assertions.assertEquals(id, data.getId());
		Assertions.assertEquals(districtId, data.getDistrictId());
		Assertions.assertEquals(name, data.getName());
		Assertions.assertEquals(type, data.getType());
		Assertions.assertEquals(postalCode, data.getPostalCode());
	}
}
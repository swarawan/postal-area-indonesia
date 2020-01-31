package id.swarawan.postalarea.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PostalAreaServiceImplTest {

	private PostalAreaService postalAreaService;

	@BeforeEach
	public void init() throws IOException {
		postalAreaService = new PostalAreaServiceImpl();
		postalAreaService.init();
	}

	@Test
	public void test() {
		Assertions.assertNotNull(postalAreaService.findAllProvince());
		Assertions.assertNotNull(postalAreaService.findProvince(1L));

		Assertions.assertNotNull(postalAreaService.findAllCity());
		Assertions.assertNotNull(postalAreaService.findAllCityByProvince(1L));
		Assertions.assertNotNull(postalAreaService.findCity(1L));

		Assertions.assertNotNull(postalAreaService.findAllDistrict());
		Assertions.assertNotNull(postalAreaService.findAllDistrictByCity(1L));
		Assertions.assertNotNull(postalAreaService.findDistrict(1L));

		Assertions.assertNotNull(postalAreaService.findAllVillageByDistrict(1L));

	}
}
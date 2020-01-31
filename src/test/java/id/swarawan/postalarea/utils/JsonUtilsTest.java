package id.swarawan.postalarea.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import id.swarawan.postalarea.entity.CityData;
import id.swarawan.postalarea.entity.DistrictData;
import id.swarawan.postalarea.entity.ProvinceData;
import id.swarawan.postalarea.entity.VillageData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JsonUtilsTest {

	@Autowired
	private JsonUtils jsonUtils;

	@Test
	public void testJsonParsing_Province() throws IOException {
		List<ProvinceData> provinces = jsonUtils.parse("json/postal_area_province.json", new TypeReference<List<ProvinceData>>() {
		});

		Assertions.assertNotNull(provinces);
	}

	@Test
	public void testJsonParsing_City() throws IOException {
		List<CityData> cities = jsonUtils.parse("json/postal_area_city.json", new TypeReference<List<CityData>>() {
		});

		Assertions.assertNotNull(cities);
	}

	@Test
	public void testJsonParsing_District() throws IOException {
		List<DistrictData> districts = jsonUtils.parse("json/postal_area_district.json", new TypeReference<List<DistrictData>>() {
		});

		Assertions.assertNotNull(districts);
	}

	@Test
	public void testJsonParsing_Village() throws IOException {
		List<VillageData> villages = jsonUtils.parse("json/postal_area_village.json", new TypeReference<List<VillageData>>() {
		});

		Assertions.assertNotNull(villages);
	}
}
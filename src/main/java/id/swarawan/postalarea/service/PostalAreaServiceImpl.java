package id.swarawan.postalarea.service;

import com.fasterxml.jackson.core.type.TypeReference;
import id.swarawan.postalarea.entity.CityData;
import id.swarawan.postalarea.entity.DistrictData;
import id.swarawan.postalarea.entity.ProvinceData;
import id.swarawan.postalarea.entity.VillageData;
import id.swarawan.postalarea.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PostalAreaServiceImpl implements PostalAreaService {

	private JsonUtils jsonUtils = new JsonUtils();
	private List<ProvinceData> provinces = new ArrayList<>();
	private List<CityData> cities = new ArrayList<>();
	private List<DistrictData> districts = new ArrayList<>();
	private List<VillageData> villages = new ArrayList<>();

	@Override
	public void init() throws IOException {
		provinces = jsonUtils.parse("json/postal_area_province.json", new TypeReference<List<ProvinceData>>() {
		});
		cities = jsonUtils.parse("json/postal_area_city.json", new TypeReference<List<CityData>>() {
		});
		districts = jsonUtils.parse("json/postal_area_district.json", new TypeReference<List<DistrictData>>() {
		});
		villages = jsonUtils.parse("json/postal_area_village.json", new TypeReference<List<VillageData>>() {
		});
	}

	@Override
	public List<ProvinceData> findAllProvince() {
		return provinces;
	}

	@Override
	public ProvinceData findProvince(Long provinceId) {
		return provinces.stream()
			.filter(province -> provinceId.equals(province.getId()))
			.findFirst()
			.orElse(null);
	}

	@Override
	public List<CityData> findAllCity() {
		return cities;
	}

	@Override
	public CityData findCity(Long cityId) {
		return cities.stream()
			.filter(city -> cityId.equals(city.getId()))
			.findFirst()
			.orElse(null);
	}

	@Override
	public List<CityData> findAllCityByProvince(Long provinceId) {
		return cities.stream()
			.filter(city -> provinceId.equals(city.getProvinceId()))
			.collect(Collectors.toCollection(ArrayList::new));
	}

	@Override
	public List<DistrictData> findAllDistrict() {
		return districts;
	}

	@Override
	public DistrictData findDistrict(Long districtId) {
		return districts.stream()
			.filter(district -> districtId.equals(district.getId()))
			.findFirst()
			.orElse(null);
	}

	@Override
	public List<DistrictData> findAllDistrictByCity(Long cityId) {
		return districts.stream()
			.filter(district -> cityId.equals(district.getCityId()))
			.collect(Collectors.toCollection(ArrayList::new));
	}

	@Override
	public VillageData findVillage(Long villageId) {
		return villages.stream()
			.filter(village -> villageId.equals(village.getId()))
			.findFirst()
			.orElse(null);
	}

	@Override
	public List<VillageData> findAllVillageByDistrict(Long districtId) {
		return villages.stream()
			.filter(village -> districtId.equals(village.getDistrictId()))
			.collect(Collectors.toCollection(ArrayList::new));
	}
}

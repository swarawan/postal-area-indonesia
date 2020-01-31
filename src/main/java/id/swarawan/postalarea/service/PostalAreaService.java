package id.swarawan.postalarea.service;

import id.swarawan.postalarea.entity.CityData;
import id.swarawan.postalarea.entity.DistrictData;
import id.swarawan.postalarea.entity.ProvinceData;
import id.swarawan.postalarea.entity.VillageData;

import java.io.IOException;
import java.util.List;

public interface PostalAreaService {

	public void init() throws IOException;

	public List<ProvinceData> findAllProvince();

	public ProvinceData findProvince(Long provinceId);

	// =========================================================================

	public List<CityData> findAllCity();

	public CityData findCity(Long cityId);

	public List<CityData> findAllCityByProvince(Long provinceId);

	// =========================================================================

	public List<DistrictData> findAllDistrict();

	public DistrictData findDistrict(Long districtId);

	public List<DistrictData> findAllDistrictByCity(Long cityId);

	// =========================================================================

	public VillageData findVillage(Long villageId);

	public List<VillageData> findAllVillageByDistrict(Long districtId);

}

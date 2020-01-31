package id.swarawan.postalarea.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CityData {

	@JsonProperty("city_id")
	private Long id;

	@JsonProperty("city_province_id")
	private Long provinceId;

	@JsonProperty("city_name")
	private String name;

	@JsonProperty("city_type")
	private String type;
}

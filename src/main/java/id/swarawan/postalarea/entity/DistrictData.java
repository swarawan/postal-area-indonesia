package id.swarawan.postalarea.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DistrictData {

	@JsonProperty("district_id")
	private Long id;

	@JsonProperty("district_city_id")
	private Long cityId;

	@JsonProperty("district_name")
	private String name;
}

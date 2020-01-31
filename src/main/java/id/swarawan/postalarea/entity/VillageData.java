package id.swarawan.postalarea.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class VillageData {

	@JsonProperty("village_id")
	private Long id;

	@JsonProperty("village_district_id")
	private Long districtId;

	@JsonProperty("village_name")
	private String name;

	@JsonProperty("village_type")
	private String type;

	@JsonProperty("village_postal_code")
	private String postalCode;
}

package id.swarawan.postalarea.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProvinceData {

	@JsonProperty("province_id")
	private Long id;

	@JsonProperty("province_name")
	private String name;
}

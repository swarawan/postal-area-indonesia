package id.swarawan.postalarea.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class JsonUtils {

	public <T> T parse(String filename, TypeReference reference) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		ClassPathResource classPathResource = new ClassPathResource(filename);
		return objectMapper.readValue(classPathResource.getInputStream(), reference);
	}
}

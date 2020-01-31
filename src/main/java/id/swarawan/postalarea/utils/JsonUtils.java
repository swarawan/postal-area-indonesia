package id.swarawan.postalarea.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;

@Component
public class JsonUtils {

	public <T> T parse(String filename, TypeReference reference) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		File file = ResourceUtils.getFile("classpath:" + filename);
		return objectMapper.readValue(file, reference);
	}
}

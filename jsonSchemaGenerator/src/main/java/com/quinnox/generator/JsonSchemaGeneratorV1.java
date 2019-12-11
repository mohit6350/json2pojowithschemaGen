package com.quinnox.generator;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializationConfig;

import com.quinnox.util.Input;

public class JsonSchemaGeneratorV1 {

	public static void main(String[] args) throws IOException {
		System.out.println(JsonSchemaGeneratorV1.getJsonSchema(Input.class));
	}

	public static String getJsonSchema(Class clazz) throws IOException {

		org.codehaus.jackson.map.ObjectMapper objectMapper = new org.codehaus.jackson.map.ObjectMapper();
		objectMapper.configure(SerializationConfig.Feature.WRITE_ENUMS_USING_TO_STRING, true);
		org.codehaus.jackson.schema.JsonSchema jsonSchema = objectMapper.generateJsonSchema(clazz);
		return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonSchema);
	}

}

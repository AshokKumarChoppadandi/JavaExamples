package com.bigdata.java;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ReadJsonFile {
    public static void main(String[] args) throws IOException {

        if (args.length != 1) {
            System.err.println("Invalid number of arguments!");
        }

        String filePath = args[0];

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(new File(filePath));

        String connectorName = jsonNode.get("name").asText();
        System.out.println("Connector Name - " + connectorName);

        String kafkaTopic = jsonNode.get("config").get("topics").asText();
        System.out.printf("Kafka Topic Name - %s\n", kafkaTopic);
        System.out.println("Execution Completed");
    }
}

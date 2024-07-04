package com.bigdata.java;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.*;

public class JsonFormatter {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.err.println("Invalid number of arguments!");
        }
        String inputFilePath = args[0];
        String outputFilePath = args[1];

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(new File(inputFilePath));

        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.writeValue(new File(outputFilePath), jsonNode);

        System.out.println("JSON file written successfully!");
    }
}

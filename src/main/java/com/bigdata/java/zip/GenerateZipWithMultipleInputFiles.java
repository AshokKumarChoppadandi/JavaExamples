package com.bigdata.java.zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class GenerateZipWithMultipleInputFiles {
    public static List<String> inputFiles = new ArrayList<>();
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Invalid number of arguments. Expected - <Input Directory> <Test.zip>");
            System.exit(-1);
        }
        File inputDir = new File(args[0]);
        File outputFile = new File(args[1]);

        getAllFileNames(inputDir);

        try {
            ZipOutputStream outputStream = new ZipOutputStream(Files.newOutputStream(outputFile.toPath()));
            String outputFileName = outputFile.getName();
            String zipFolderName = outputFileName.substring(0, outputFileName.lastIndexOf("."));

            for (String filePath : inputFiles) {
                System.out.println("File Path - " + filePath);
                String fileName = filePath.substring(inputDir.getAbsolutePath().length() + 1);
                String zippedFileName = zipFolderName + "/" + fileName;
                System.out.println("Zip File Name - " + zippedFileName);
                ZipEntry entry = new ZipEntry(zippedFileName);
                outputStream.putNextEntry(entry);

                FileInputStream inputStream = new FileInputStream(filePath);
                byte[] buffer = new byte[1024];
                int len;
                while ((len = inputStream.read(buffer)) > 0) {
                    outputStream.write(buffer, 0, len);
                }
                inputStream.close();
                System.out.println("Zipping - " + filePath);
            }

            outputStream.closeEntry();
            outputStream.close();
            outputStream.close();

            System.out.println("Generating Zip file completed - " + outputFile);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getAllFileNames(File inputDir) {
        File[] files = inputDir.listFiles();
        assert files != null;
        for (File file : files) {
            if (file.isFile()) {
                inputFiles.add(file.getAbsolutePath());
            } else {
                getAllFileNames(file);
            }
        }
    }
}
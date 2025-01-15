package com.bigdata.java.zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class GenerateZipWithSingleInputFile {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Invalid number of arguments. Expected - <InputFile.json> <Test.zip>");
            System.exit(-1);
        }

        File inputFile = new File(args[0]);
        File outputFile = new File(args[1]);
        try {
            ZipOutputStream outputStream = new ZipOutputStream(Files.newOutputStream(outputFile.toPath()));
            String outputFileName = outputFile.getName();
            String zipFolderName = outputFileName.substring(0, outputFileName.lastIndexOf("."));
            ZipEntry entry = new ZipEntry(zipFolderName + "/" + inputFile.getName());
            outputStream.putNextEntry(entry);

            FileInputStream inputStream = new FileInputStream(inputFile);
            byte[] buffer = new byte[1024];
            int len;
            while ((len = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, len);
            }

            outputStream.closeEntry();
            outputStream.close();

            inputStream.close();
            outputStream.close();

            System.out.println(inputFile.getCanonicalPath() + " is zipped to " + outputFile);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
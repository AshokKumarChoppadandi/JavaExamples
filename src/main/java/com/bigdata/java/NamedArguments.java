package com.bigdata.java;

import org.apache.commons.cli.*;

public class NamedArguments {
    public static void main(String[] args) {

        Option option1 = Option
                .builder()
                .option("t")
                .longOpt("epochTimestamp")
                .hasArg()
                .desc("Epoch timestamp to reset in milliseconds")
                .build();

        Option option2 = new Option("a", "action", true, "Action to perform - allowed values are dryRun | execute | status | stop");

        Option option3 = new Option("h", "help", false, "Usage");

        Options options = new Options();
        options.addRequiredOption("p", "propertiesFile", true, "Properties File Path");
        options.addRequiredOption("b", "bootstrapServer", true, "Kafka Bootstrap Server URL");
        options.addRequiredOption("c", "connectServer", true, "Kafka Connect Server URL");
        options.addOption(option1);
        options.addOption(option2);
        options.addOption(option3);

        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine line = parser.parse(options, args);
            if (line.hasOption("h")) {
                printHelp(options);
            } else {
                String countryCode = line.getOptionValue("p");
                System.out.println("countryCode - " + countryCode);
            }
        } catch (ParseException e) {
            printHelp(options);
            System.err.println(e.getMessage());
        }


    }

    private static void printHelp(Options options) {
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("java -cp JavaExamples-1.0-SNAPSHOT.jar NamedArguments [options]", options);
    }
}

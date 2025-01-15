package io.github.ashokkumarchoppadandi.testutils;

import org.testcontainers.containers.PostgreSQLContainer;

public class EmbeddedPostgreSQLContainer {
    public static PostgreSQLContainer postgreSQLContainer = EmbeddablePostgreSQLContainer.getInstance();
}

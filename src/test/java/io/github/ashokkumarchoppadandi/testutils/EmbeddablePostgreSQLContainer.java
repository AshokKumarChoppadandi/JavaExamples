package io.github.ashokkumarchoppadandi.testutils;

import org.testcontainers.containers.PostgreSQLContainer;

public class EmbeddablePostgreSQLContainer extends PostgreSQLContainer<EmbeddablePostgreSQLContainer> {
    public static String dockerImage = "postgres:latest";
    public static String databaseName = "test";
    public static String username = "testuser";
    public static String password = "Test@123";
    public static PostgreSQLContainer container;

    public EmbeddablePostgreSQLContainer() {
        super(dockerImage);
    }

    public static PostgreSQLContainer getInstance() {
        if (container == null) {
            container = new PostgreSQLContainer(dockerImage)
                    .withDatabaseName(databaseName)
                    .withUsername(username)
                    .withPassword(password);
        }

        if (!container.isRunning()) {
            container.start();
        }

        return container;
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void stop() {
        // super.stop();
    }
}

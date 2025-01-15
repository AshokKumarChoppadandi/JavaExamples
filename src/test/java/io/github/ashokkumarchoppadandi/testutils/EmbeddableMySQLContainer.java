/*package io.github.ashokkumarchoppadandi.testutils;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.utility.DockerImageName;

public abstract class EmbeddableMySQLContainer<SELF extends MySQLContainer<SELF>> {

    private static final MySQLContainer mySQLContainer = new MySQLContainer<>(DockerImageName.parse("mysql:8"))
                    .withReuse(true)
                    .withUsername("test")
                    .withPassword("Test@123")
                    .withDatabaseName("mydb")
                    .withExposedPorts(3306);

    @BeforeAll
    public static void setup() {
        mySQLContainer.start();
    }
}*/

package io.github.ashokkumarchoppadandi.jdbc;

import io.github.ashokkumarchoppadandi.testutils.EmbeddedPostgreSQLContainer;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class JdbcUrlTest extends EmbeddedPostgreSQLContainer {
    @Test
    public void testJdbcUrlInstanceWithEmptyArguments() {
        JdbcUrl url = new JdbcUrl();

        Assertions.assertNull(url.dbName);
        Assertions.assertNull(url.host);
        Assertions.assertEquals(0, url.port);
        Assertions.assertNull(url.username);
        Assertions.assertNull(url.password);
        Assertions.assertNull(url.defaultDatabase);
    }

    @Test
    public void testJdbcUrlInstanceWithArguments() {
        JdbcUrl url = new JdbcUrl(
                "mysql",
                "localhost",
                3306,
                "test",
                "test@123",
                "default"
        );

        Assertions.assertEquals("mysql", url.dbName);
        Assertions.assertEquals("localhost", url.host);
        Assertions.assertEquals(3306, url.port);
        Assertions.assertEquals("test", url.username);
        Assertions.assertEquals("test@123", url.password);
        Assertions.assertEquals("default", url.defaultDatabase);
    }

    @Test
    public void testDbConnection() {
        String dbName = "postgresql";
        String dbHost = postgreSQLContainer.getHost();
        int port = (int) postgreSQLContainer.getExposedPorts().get(0);
        String username = postgreSQLContainer.getUsername();
        String password = postgreSQLContainer.getPassword();
        String database = postgreSQLContainer.getDatabaseName();

        String jdbcUrl = postgreSQLContainer.getJdbcUrl();

        // Assertions.assertEquals();

        System.out.println("dbName - " + dbName);
        System.out.println("dbHost - " + dbHost);
        System.out.println("port - " + port);
        System.out.println("username - " + username);
        System.out.println("password - " + password);
        System.out.println("database - " + database);
        System.out.println("JDBC URL - " + jdbcUrl);
    }
}

package io.github.ashokkumarchoppadandi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUrl {
    String dbName;
    String host;
    int port;
    String username;
    String password;
    String defaultDatabase;

    public JdbcUrl(String dbName, String host, int port, String username, String password, String defaultDatabase) {
        this.dbName = dbName;
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
        this.defaultDatabase = defaultDatabase;
    }

    public JdbcUrl() {
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getDefaultDatabase() {
        return defaultDatabase;
    }

    public void setDefaultDatabase(String defaultDatabase) {
        this.defaultDatabase = defaultDatabase;
    }

    public String toJdbcUrl() {
        return dbName + "://" + username + ":" + password + "@" + host + ":" + port + "/" + defaultDatabase;
    }

    public boolean isConnecting() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String jdbcUrl = toJdbcUrl();
        Connection connection = DriverManager.getConnection(jdbcUrl);

        return connection.isValid(1000);
    }
}

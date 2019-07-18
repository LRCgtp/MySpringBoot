package com.hand.exam1.utills;

import java.sql.*;

public class JdbcUtill {
    static final String URL = GetJdbcProperties.getjdbcProperties().getUrl();
    static final String Driver_Class = GetJdbcProperties.getjdbcProperties().getDriverClass();
    static final String USERNAME = GetJdbcProperties.getjdbcProperties().getUser();
    static final String PASSWORD = GetJdbcProperties.getjdbcProperties().getPassword();


    static {
        try {
            Class.forName(Driver_Class);
        } catch (ClassNotFoundException e) {
            System.out.println("驱动出错了");
        }
    }

    /**
     * 获取流
     *
     * @return
     */
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 关闭流
     *
     * @param connection
     * @param preparedStatement
     * @param resultSet
     */
    public static void close(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 数据跟新关流
     * @param connection
     * @param preparedStatement
     */
    public static void close(Connection connection, PreparedStatement preparedStatement) {
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

   /* public static void main(String[] args) {
        Connection connection = getConnection();
        System.out.println(Driver_Class);
        System.out.println(URL);
        System.out.println(connection);
    }*/
}